package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.model.BasicDetail;
import com.heyue.serivce.BasicDetailService;
import com.heyue.util.PKeyGenerator;
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
    public CommonResult<List<BasicDetail>> listAll(){
        List<BasicDetail> details = service.listAll();
        return CommonResult.success(details);
    }

    @ApiOperation("添加基装定额")
    @GetMapping(value = "/addBasicDetail")
    @ResponseBody
    public CommonResult addBasicDetail(@RequestBody BasicDetail detail){
        detail.setId(PKeyGenerator.generator());
        int count = service.addBasicDetail(detail);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改基装定额")
    @GetMapping(value = "/updateBasicDetail")
    @ResponseBody
    public CommonResult updateBasicCategory(@RequestBody BasicDetail detail){
        int count = service.updateBasicDetail(detail);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除基装定额")
    @GetMapping(value = "/deleteBasicDetail")
    @ResponseBody
    public CommonResult deleteBasicDetail(@RequestParam("id") Long id){
        int count = service.deleteBasicDetail(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
