package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.model.BasicCategory;
import com.heyue.serivce.BasicCategoryService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "基装定额类别")
@RequestMapping("/basic_category")
public class BasicCategoryController {
    @Autowired
    private BasicCategoryService service;

    @ApiOperation("获取所有基装定额类别")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<BasicCategory>> listAll(){
        List<BasicCategory> categories = service.listAll();
        return CommonResult.success(categories);
    }

    @ApiOperation("添加基装定额类别")
    @GetMapping(value = "/addBasicCategory")
    @ResponseBody
    public CommonResult addBasicCategory(@RequestBody BasicCategory category){
        category.setId(PKeyGenerator.generator());
        int count = service.addBasicCategory(category);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改基装定额类别")
    @GetMapping(value = "/updateBasicCategory")
    @ResponseBody
    public CommonResult updateBasicCategory(@RequestBody BasicCategory category){
        int count = service.updateBasicCategory(category);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除基装定额类别")
    @GetMapping(value = "/deleteBasicCategory")
    @ResponseBody
    public CommonResult deleteBasicCategory(@RequestParam("id") Long id){
        int count = service.deleteBasicCategory(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
