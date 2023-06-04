package com.heyue.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.heyue.api.CommonPage;
import com.heyue.api.CommonResult;
import com.heyue.dto.BasicDetailExport;
import com.heyue.dto.ItemVOParm;
import com.heyue.dto.MaterialDetailExport;
import com.heyue.dto.MaterialDetailParam;
import com.heyue.model.BasicDetail;
import com.heyue.model.ItemVO;
import com.heyue.model.MaterialDetail;
import com.heyue.serivce.DataOpratorService;
import com.heyue.serivce.MaterialDetailService;
import com.heyue.util.ExcelExportUtils;
import com.heyue.util.PKeyGenerator;
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
@Api(tags = "材料定额")
@RequestMapping("/material_detail")
@CrossOrigin
public class MaterialDetailController {
    @Autowired
    private MaterialDetailService service;

    @Autowired
    private DataOpratorService dataOpratorService;

    @ApiOperation("获取所有材料定额")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MaterialDetail>> listAll(@RequestParam Long category_id,
                                                            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                                            @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<MaterialDetail> details = service.listAll(category_id);
        int firstIndex = (pageNum - 1) * pageSize;
        int lastIndex = pageNum * pageSize;
        if(lastIndex>=details.size()){
            lastIndex = details.size();
        }
        return CommonResult.success(CommonPage.restPage(details.subList(firstIndex, lastIndex),new Long(details.size())));
    }

    @ApiOperation(value = "材料定额详细信息")
    @RequestMapping(value = "/query",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<MaterialDetail> query(Long detail_id){
        MaterialDetail detail = service.loadMaterialDetailById(detail_id);
        return CommonResult.success(detail);
    }

    @ApiOperation("添加材料定额")
    @RequestMapping(value = "/addMaterialDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addMaterialDetail(@RequestParam Long category_id,@RequestBody MaterialDetailParam param){
        String message = "";
        int count = service.addMaterialDetail(param,category_id);
        if(count==-1){
            message = "基装定额编码重复";
        }
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed(message);
    }

    @ApiOperation("修改材料定额")
    @RequestMapping(value = "/updateMaterialDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMaterialDetail(@RequestBody MaterialDetail detail){
        int count = service.updateMaterialDetail(detail);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除材料定额")
    @RequestMapping(value = "/deleteMaterialDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMaterialDetail(@RequestParam("id") Long id){
        int count = service.deleteMaterialDetail(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @SneakyThrows(IOException.class)
    @ApiOperation(value = "材料定额导出模板",notes = "exportTemplate", produces = "application/octet-stream")
    @RequestMapping(value = "/exportTemplate",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult exportMaterialDetailTemplate(HttpServletResponse response){
        ExcelExportUtils.setExcelResProp(response,"ExportTemplate");
        try {
            EasyExcel.write(response.getOutputStream())
                    .head(MaterialDetailExport.class)
                    .excelType(ExcelTypeEnum.XLSX)
                    .sheet("sheet1")
                    .doWrite(new ArrayList<>(8));
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
        return CommonResult.success(1);
    }

    @ApiOperation(value = "导入材料定额数据",notes = "importData")
    @RequestMapping(value = "/imoportData",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult importMaterialDetailData(@RequestPart("file") MultipartFile file, @RequestParam Long category){
        try {
            dataOpratorService.importMaterialExcel(file,category);
        }catch (Exception e){
            return CommonResult.failed("导入失败");
        }
        return CommonResult.success("导入成功");
    }


    @SneakyThrows(IOException.class)
    @ApiOperation(value = "导出材料定额数据",notes = "exportData",produces = "application/octet-stream")
    @RequestMapping(value = "/exportData",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult exportMaterialData(@RequestParam Long category,HttpServletResponse response){
        ExcelExportUtils.setExcelResProp(response,"Data");
        List<MaterialDetail> details = service.listAll(category);
        try {
            dataOpratorService.exporMaterialExcel(details,response);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
        return CommonResult.success(1);
    }

    @ApiOperation("获取字段显示信息")
    @RequestMapping(value = "/listMaterialShowInfoAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<ItemVO>> listMaterialAll(){
        List<ItemVO> itemVOS = service.listMaterialAll();
        return CommonResult.success(itemVOS);
    }

    @ApiOperation("插入字段显示信息")
    @RequestMapping(value = "/insertMaterialShowInfo",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertMaterial(@RequestBody ItemVOParm parm){
        try {
            service.insertMaterial(parm);
        }catch (Exception e){
            CommonResult.failed(e.getMessage());
        }
        return CommonResult.success(1);
    }

    @ApiOperation("更新字段显示信息")
    @RequestMapping(value = "/updateMaterialShowInfo",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMaterial(@RequestBody List<ItemVO> list){
        try {
            service.updateMaterial(list);
        }catch (Exception e){
            CommonResult.failed(e.getMessage());
        }
        return CommonResult.success(1);
    }
}
