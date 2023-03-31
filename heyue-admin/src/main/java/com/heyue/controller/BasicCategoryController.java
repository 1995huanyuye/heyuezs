package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.BasicCategoryParam;
import com.heyue.model.BasicCategory;
import com.heyue.serivce.BasicCategoryService;
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

    @ApiOperation("获取指定基装定额类别")
    @RequestMapping(value = "/queryBasicCategory",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<BasicCategory> queryBasicCategory(@RequestParam Long category_id){
        BasicCategory category = service.loadCategoryById(category_id);
        if(category==null){
            CommonResult.failed("未找到指定基装定额目录");
        }
        return CommonResult.success(category);
    }

    @ApiOperation("添加基装定额类别")
    @RequestMapping(value = "/addBasicCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addBasicCategory(@RequestBody BasicCategoryParam param){
        int count = service.addBasicCategory(param);
        if(count==-1){
            CommonResult.failed("类别编码重复");
        }
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改基装定额类别")
    @RequestMapping(value = "/updateBasicCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBasicCategory(@RequestBody BasicCategory category){
        int count = service.updateBasicCategory(category);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除基装定额类别")
    @RequestMapping(value = "/deleteBasicCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteBasicCategory(@RequestParam("id") Long id){
        int count = service.deleteBasicCategory(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
