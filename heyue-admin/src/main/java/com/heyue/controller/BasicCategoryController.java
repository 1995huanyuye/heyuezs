package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.BasicCategoryParam;
import com.heyue.model.BasicCategory;
import com.heyue.model.MaterialCategory;
import com.heyue.serivce.BasicCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@Api(tags = "基装定额类别")
@RequestMapping("/basic_category")
@CrossOrigin
public class BasicCategoryController {
    @Autowired
    private BasicCategoryService service;

    @ApiOperation("获取所有基装定额类别")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<BasicCategory>> listAll(){
        List<BasicCategory> categories = list2TreeByMap(service.listAll());
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

    private List<BasicCategory> list2TreeByMap(List<BasicCategory> details){
        Map<Long, List<BasicCategory>> parentMap  = details.stream().collect(Collectors.groupingBy(BasicCategory::getParentId));
        for (Map.Entry<Long, List<BasicCategory>> entry : parentMap.entrySet()) {
            List<BasicCategory> childs = entry.getValue();
            for (BasicCategory child : childs) {
                child.setChildren(parentMap.get(child.getId()));
            }
        }
        //返回根节点数据
        return parentMap.get(Long.valueOf(0));
    }
}
