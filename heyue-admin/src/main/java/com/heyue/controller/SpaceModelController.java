package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.SpaceItemAddParam;
import com.heyue.dto.SpaceItemConfigParam;
import com.heyue.dto.SpaceItemParam4Add;
import com.heyue.model.SpaceAggVO;
import com.heyue.model.SpaceItem;
import com.heyue.model.SpaceItemConfig;
import com.heyue.model.SpaceItemParam;
import com.heyue.serivce.SpaceModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "空间模板管理")
@RequestMapping("/space_model")
@CrossOrigin
public class SpaceModelController {
    @Autowired
    private SpaceModelService service;

    @ApiOperation("获取所有空间")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SpaceItem>> listAll(@RequestParam Long category_id){
        List<SpaceItem> spaceItemList = service.listAll(category_id);
        return CommonResult.success(spaceItemList);
    }

    @ApiOperation(value = "空间详细信息")
    @RequestMapping(value = "/getItem",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SpaceAggVO> getItem(@RequestParam Long item_id){
        SpaceAggVO item = service.loadSpaceDataById(item_id);
        return CommonResult.success(item);
    }

    @ApiOperation(value = "新增空间")
    @RequestMapping(value = "/addSpaceItem",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Long> addSpaceItem(@RequestBody SpaceItemAddParam param, @RequestParam Long category_id){
        Long aLong = service.addSpaceItem(param, category_id);
        return CommonResult.success(aLong);
    }

    @ApiOperation(value = "新增配置参数")
    @RequestMapping(value = "/addSpaceItemParam",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addSpaceItemParam(@RequestBody SpaceItemParam4Add o,@RequestParam Long item_id){
        int count = service.addSpaceItemParam(o, item_id);
        return CommonResult.success(count);
    }

    @ApiOperation(value = "删除配置参数")
    @RequestMapping(value = "/delSpaceItemParam",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delSpaceItemParam(@RequestBody SpaceItemParam o){
        int count = service.delSpaceItemParam(o);
        return CommonResult.success(count);
    }

    @ApiOperation(value = "新增装修配置")
    @RequestMapping(value = "/addSpaceItemConfig",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addSpaceItemConfig(@RequestBody SpaceItemConfigParam o,@RequestParam Long item_id){
        int count = service.addSpaceItemConfig(o, item_id);
        return CommonResult.success(count);
    }

    @ApiOperation(value = "删除装修配置")
    @RequestMapping(value = "/delSpaceItemConfig",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delSpaceItemConfig(@RequestBody SpaceItemConfig o){
        int count = service.delSpaceItemConfig(o);
        return CommonResult.success(count);
    }

    @ApiOperation(value = "更新空间")
    @RequestMapping(value = "/updateSpaceItem",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateSpaceItem(@RequestBody SpaceItem o){
        int count = service.updateSpaceItem(o);
        return CommonResult.success(count);
    }

    @ApiOperation(value = "删除空间")
    @RequestMapping(value = "/deleteSpaceItem",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteSpaceItem(@RequestParam Long id,@RequestParam Long category_id){
        int count = service.deleteSpaceItem(id,category_id);
        return CommonResult.success(count);
    }

}
