package com.heyue.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.github.pagehelper.PageHelper;
import com.heyue.api.CommonPage;
import com.heyue.api.CommonResult;
import com.heyue.dto.BasicDetailExport;
import com.heyue.dto.BasicDetailParam;
import com.heyue.dto.ItemVOParm;
import com.heyue.model.BasicDetail;
import com.heyue.model.ItemVO;
import com.heyue.serivce.BasicDetailService;
import com.heyue.serivce.DataOpratorService;
import com.heyue.util.ExcelExportUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@Api(tags = "基装定额")
@RequestMapping("/basic_detail")
@CrossOrigin
public class BasicDetailController {
    @Autowired
    private BasicDetailService service;

    @Autowired
    private DataOpratorService dataOpratorService;


    @ApiOperation("获取所有基装定额")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<BasicDetail>> listAll(@RequestParam Long category_id,
                                                         @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                                         @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<BasicDetail> details = service.listAll(category_id);
        int firstIndex = (pageNum - 1) * pageSize;
        int lastIndex = pageNum * pageSize;
        if(lastIndex>=details.size()){
            lastIndex = details.size();
        }
        return CommonResult.success(CommonPage.restPage(details.subList(firstIndex, lastIndex),new Long(details.size())));
    }

    @ApiOperation(value = "基装定额详细信息")
    @RequestMapping(value = "/query",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<BasicDetail> query(Long detail_id){
        BasicDetail detail = service.loadBasicDetailById(detail_id);
        return CommonResult.success(detail);
    }

    @ApiOperation("添加基装定额")
    @RequestMapping(value = "/addBasicDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addBasicDetail(@RequestParam Long category_id,@RequestBody BasicDetailParam param){
        String message = "";
        int count = service.addBasicDetail(param,category_id);
        if(count==-1){
            message = "基装定额编码重复";
        }
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed(message);
    }

    @ApiOperation("修改基装定额")
    @RequestMapping(value = "/updateBasicDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBasicCategory(@RequestBody BasicDetail detail){
        int count = service.updateBasicDetail(detail);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除基装定额")
    @RequestMapping(value = "/deleteBasicDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteBasicDetail(@RequestParam("id") Long id){
        int count = service.deleteBasicDetail(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @SneakyThrows(IOException.class)
    @ApiOperation(value = "基装定额导出模板",notes = "exportTemplate", produces = "application/octet-stream")
    @RequestMapping(value = "/exportTemplate",method = RequestMethod.GET)
    @ResponseBody
    public void exportBasicDetailTemplate(HttpServletResponse response){
        ExcelExportUtils.setExcelResProp(response,"ExportTemplate");
        try {
            EasyExcel.write(response.getOutputStream())
                    .head(BasicDetailExport.class)
                    .excelType(ExcelTypeEnum.XLSX)
                    .sheet("sheet1")
                    .doWrite(new ArrayList<>(8));
        }catch (Exception e){
            throw e;
        }

    }

    @ApiOperation(value = "导入基装定额数据",notes = "importData")
    @RequestMapping(value = "/imoportData",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult importBasicDetailData(@RequestPart("file")MultipartFile file,@RequestParam Long category) throws IOException {
        try {
            dataOpratorService.importBasicExcel(file,category);
        }catch (Exception e){
            return CommonResult.failed("导入失败");
        }
        return CommonResult.success("导入成功");
    }


    @SneakyThrows(IOException.class)
    @ApiOperation(value = "导出基装定额数据",notes = "exportData",produces = "application/octet-stream")
    @RequestMapping(value = "/exportData",method = RequestMethod.GET)
    @ResponseBody
    public void exportDataBasicDetailData(@RequestParam Long category,HttpServletResponse response){
        ExcelExportUtils.setExcelResProp(response,"Data");
        List<BasicDetail> details = service.listAll(category);
        try {
            dataOpratorService.exportBasicExcel(details,response);
        }catch (Exception e){
            throw e;
        }
    }


    @ApiOperation("获取字段显示信息")
    @RequestMapping(value = "/listBasicShowInfoAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<ItemVO>> listBasicAll(){
        List<ItemVO> itemVOS = service.listBasicAll();
        return CommonResult.success(itemVOS);
    }

    @ApiOperation("插入字段显示信息")
    @RequestMapping(value = "/insertBasicShowInfo",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertBasic(@RequestBody ItemVOParm parm){
        try {
            service.insertBasic(parm);
        }catch (Exception e){
            CommonResult.failed(e.getMessage());
        }
        return CommonResult.success(1);
    }

    @ApiOperation("更新字段显示信息")
    @RequestMapping(value = "/updateBasicShowInfo",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBasic(@RequestBody List<ItemVO> list){
        try {
            service.updateBasic(list);
        }catch (Exception e){
            CommonResult.failed(e.getMessage());
        }
        return CommonResult.success(1);
    }




}
