package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.SpaceCategoryParam;
import com.heyue.model.SpaceCategory;
import com.heyue.serivce.SpaceCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@Api(tags = "空间模板类别")
@RequestMapping("/space_category")
public class SpaceCategoryController {
    @Autowired
    private SpaceCategoryService service;

    @ApiOperation("获取所有空间分类")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SpaceCategory>> listAll(){
        List<SpaceCategory> categories = service.listAll();
        return CommonResult.success(categories);
    }

    @ApiOperation("获取指定空间分类")
    @RequestMapping(value = "/queryCategory",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<SpaceCategory> queryCategory(@RequestParam Long category_id){
        SpaceCategory category = service.queryCategory(category_id);
        if(category==null){
            CommonResult.failed("未找到指定空间分类");
        }
        return CommonResult.success(category);
    }

    @ApiOperation("添加空间分类")
    @RequestMapping(value = "/addSpaceCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addSpaceCategory(@RequestBody SpaceCategoryParam param){
        String message = "";
        int count = service.addSpaceCategory(param);
        if(count==-1){
            message= "类别编码重复";
        }
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed(message);
    }

    @ApiOperation("修改空间分类")
    @RequestMapping(value = "/updateSpaceCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateSpaceCategory(@RequestBody SpaceCategory category){
        int count = service.updateSpaceCategory(category);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除空间分类")
    @RequestMapping(value = "/deleteSpaceCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteSpaceCategory(@RequestParam("id") Long id){
        int count = service.deleteSpaceCategory(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
