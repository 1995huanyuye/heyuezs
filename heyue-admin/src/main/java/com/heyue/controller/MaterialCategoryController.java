package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.model.MaterialCategory;
import com.heyue.serivce.MaterialCategoryService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "材料定额类别")
@RequestMapping("/material_category")
public class MaterialCategoryController {
    @Autowired
    private MaterialCategoryService service;

    @ApiOperation("获取所有定额类别")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MaterialCategory>> listAll(){
        List<MaterialCategory> details = service.listAll();
        return CommonResult.success(details);
    }

    @ApiOperation("添加材料定额类别")
    @GetMapping(value = "/addMaterialCategory")
    @ResponseBody
    public CommonResult addMaterialCategory(@RequestBody MaterialCategory category){
        category.setId(PKeyGenerator.generator());
        int count = service.addMaterialCategory(category);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改材料定额类别")
    @GetMapping(value = "/updateMaterialCategory")
    @ResponseBody
    public CommonResult updateMaterialCategory(@RequestBody MaterialCategory category){
        int count = service.updateMaterialCategory(category);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除材料定额类别")
    @GetMapping(value = "/deleteMaterialCategory")
    @ResponseBody
    public CommonResult deleteMaterialCategory(@RequestParam("id") Long id){
        int count = service.deleteMaterialCategory(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
