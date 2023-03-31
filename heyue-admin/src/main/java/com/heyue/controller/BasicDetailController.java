package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.BasicDetailParam;
import com.heyue.model.BasicDetail;
import com.heyue.serivce.BasicDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "基装定额")
@RequestMapping("/basic_detail")
public class BasicDetailController {
    @Autowired
    private BasicDetailService service;

    @ApiOperation("获取所有基装定额")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<BasicDetail>> listAll(@RequestParam Long category_id,@RequestParam String isHaveParent){
        List<BasicDetail> details = service.listAll(category_id,isHaveParent);
        return CommonResult.success(details);
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
}
