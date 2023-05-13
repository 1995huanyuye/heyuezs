package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.MaterialCategoryParam;
import com.heyue.model.MaterialCategory;
import com.heyue.serivce.MaterialCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@Api(tags = "材料定额类别")
@RequestMapping("/material_category")
@CrossOrigin
public class MaterialCategoryController {
    @Autowired
    private MaterialCategoryService service;

    @ApiOperation("获取所有定额类别")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MaterialCategory>> listAll(){
        List<MaterialCategory> details =list2TreeByMap(service.listAll());
        return CommonResult.success(details);
    }

    @ApiOperation("获取指定材料定额类别")
    @RequestMapping(value = "/queryMaterialCategory",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<MaterialCategory> queryMaterialCategory(@RequestParam Long category_id){
        MaterialCategory category = service.loadCategoryById(category_id);
        if(category==null){
            CommonResult.failed("未找到指定材料定额目录");
        }
        return CommonResult.success(category);
    }


    @ApiOperation("添加材料定额类别")
    @RequestMapping(value = "/addMaterialCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addMaterialCategory(@RequestBody MaterialCategoryParam param){
        int count = service.addMaterialCategory(param);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改材料定额类别")
    @RequestMapping(value = "/updateMaterialCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMaterialCategory(@RequestBody MaterialCategory category){
        int count = service.updateMaterialCategory(category);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除材料定额类别")
    @RequestMapping(value = "/deleteMaterialCategory",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMaterialCategory(@RequestParam("id") Long id){
        int count = service.deleteMaterialCategory(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    private List<MaterialCategory> list2TreeByMap(List<MaterialCategory> details){
        Map<Long, List<MaterialCategory>> parentMap  = details.stream().collect(Collectors.groupingBy(MaterialCategory::getParentId));
        for (Map.Entry<Long, List<MaterialCategory>> entry : parentMap.entrySet()) {
            List<MaterialCategory> childs = entry.getValue();
            for (MaterialCategory child : childs) {
                child.setChildren(parentMap.get(child.getId()));
            }
        }
        //返回根节点数据
        return parentMap.get(Long.valueOf(0));
    }


}
