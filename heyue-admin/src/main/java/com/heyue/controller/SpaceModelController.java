package com.heyue.controller;

import com.heyue.api.CommonPage;
import com.heyue.api.CommonResult;
import com.heyue.dto.DecorationProjectParam;
import com.heyue.dto.SpaceItemConfigParam;
import com.heyue.dto.SpaceParam4Add;
import com.heyue.dto.SpaceTemplateAgg;
import com.heyue.model.*;
import com.heyue.serivce.SpaceModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
    public CommonResult<SpaceTemplateAgg> getItem(@RequestParam Long item_id){
        SpaceTemplateAgg item = service.loadSpaceDataById(item_id);
        return CommonResult.success(item);
    }

    @ApiOperation(value = "新增空间")
    @RequestMapping(value = "/addSpaceItem",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addSpaceItem(@RequestBody SpaceTemplateAgg param, @RequestParam Long category_id){
        try {
            service.addSpaceItem(param, category_id);
        }catch (Exception e){
            return CommonResult.failed("新增失败！");
        }
        return CommonResult.success("新增成功！");
    }


    @ApiOperation(value = "更新空间")
    @RequestMapping(value = "/updateSpaceItem",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateSpaceItem(@RequestBody SpaceTemplateAgg agg){
        try {
            service.updateSpaceItem(agg);
        }catch (Exception e){
            return CommonResult.failed("更新失败！");
        }
        return CommonResult.success("更新成功！");
    }

    @ApiOperation(value = "删除空间")
    @RequestMapping(value = "/deleteSpaceItem",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteSpaceItem(@RequestParam Long id){
        try {
            service.deleteSpaceItem(id);
        }catch (Exception e){
            return CommonResult.failed("删除失败！");
        }
        return CommonResult.success("删除成功！");
    }

    @ApiOperation(value = "新增空间参数")
    @RequestMapping(value = "/addSpaceParam",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addSpaceParam(@RequestBody SpaceParam4Add o){
        try {
            service.addSpaceParam(o);
        }catch (Exception e){
            return CommonResult.failed("新增失败！"+e.getMessage());
        }
        return CommonResult.success("新增成功！");
    }

    @ApiOperation(value = "删除空间参数")
    @RequestMapping(value = "/delSpaceParam",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delSpaceParam(@RequestParam Long id){
        try {
           service.delSpaceParam(id);
        }catch (Exception e){
           return CommonResult.failed("删除失败！"+e.getMessage());
        }
        return CommonResult.success("删除成功！");
    }

    @ApiOperation(value = "更新空间参数")
    @RequestMapping(value = "/updateSpaceParam",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateSpaceParam(@RequestBody SpaceParam param){
        try {
            service.updateSpaceParam(param);
        }catch (Exception e){
           return CommonResult.failed("更新失败"+e.getMessage());
        }
        return CommonResult.success("更新成功！");
    }

    @ApiOperation(value = "分页查询空间参数")
    @RequestMapping(value = "/listSpaceParam",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SpaceParam>> listSpaceParam(@RequestParam(defaultValue = "0") int pageNum, @RequestParam(defaultValue = "10")int pageSize){
        List<SpaceParam> spaceParamsList = service.listSpaceParam();
        int firstIndex = (pageNum - 1) * pageSize;
        int lastIndex = pageNum * pageSize;
        if(lastIndex>=spaceParamsList.size()){
            lastIndex = spaceParamsList.size();
        }
        return CommonResult.success(CommonPage.restPage(spaceParamsList.subList(firstIndex, lastIndex),pageNum,pageSize,spaceParamsList.size()/pageSize+1,new Long(spaceParamsList.size())));
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

    @ApiOperation(value = "新增装修项目")
    @RequestMapping(value = "/addDecorationParam",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addDecorationParam(@RequestBody DecorationProjectParam param){
        try {
            service.addDecorationParam(param);
        }catch (Exception e){
            return CommonResult.failed("新增失败！"+e.getMessage());
        }
        return CommonResult.success("新增成功！");
    }

    @ApiOperation(value = "删除装修项目")
    @RequestMapping(value = "/delDecorationParam",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delDecorationParam(@RequestParam Long id){
        try {
            service.delDecorationParam(id);
        }catch (Exception e){
            return CommonResult.failed("删除失败！"+e.getMessage());
        }
        return CommonResult.success("删除成功！");
    }

    @ApiOperation(value = "更新装修项目")
    @RequestMapping(value = "/updateDecorationParam",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDecorationParam(@RequestBody DecorationProject vo){
        try {
            service.updateDecorationParam(vo);
        }catch (Exception e){
            return CommonResult.failed("更新失败"+e.getMessage());
        }
        return CommonResult.success("更新成功！");
    }

    @ApiOperation(value = "分页查询装修项目")
    @RequestMapping(value = "/listDecorationParam",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DecorationProject>> listDecorationParam(@RequestParam Integer projectType,@RequestParam(defaultValue = "0") int pageNum, @RequestParam(defaultValue = "10")int pageSize){
        List<DecorationProject> decorationProjects = service.listDecorationParam(projectType);
        if(decorationProjects!=null&&decorationProjects.size()>0){
            int firstIndex = (pageNum - 1) * pageSize;
            int lastIndex = pageNum * pageSize;
            if(lastIndex>=decorationProjects.size()){
                lastIndex = decorationProjects.size();
            }
            return CommonResult.success(CommonPage.restPage(decorationProjects.subList(firstIndex, lastIndex),pageNum,pageSize,decorationProjects.size()/pageSize+1,new Long(decorationProjects.size())));
        }
       return  CommonResult.success(CommonPage.restPage(decorationProjects));
    }


    @ApiOperation(value = "移入定额配置")
    @RequestMapping(value = "/moveIntoConfig",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult moveIntoConfig(@RequestParam Long id,@RequestParam int type){
        try {
            service.moveIntoConfig(id,type);
        }catch (Exception e){
            return CommonResult.failed("移入失败！"+e.getMessage());
        }
        return CommonResult.success("移入成功！");
    }

    @ApiOperation(value = "移出定额配置")
    @RequestMapping(value = "/removeConfig",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult removeConfig(@RequestParam Long id){
        try {
            service.removeConfig(id);
        }catch (Exception e){
            return CommonResult.failed("移出失败！"+e.getMessage());
        }
        return CommonResult.success("移出成功！");
    }

    @ApiOperation(value = "查询已移入配置")
    @RequestMapping(value = "/selectConfig",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<SpaceSelectInfo>> selectConfig(@RequestParam Long id){
        try {
            List<SpaceSelectInfo> spaceSelectInfos = service.selectConfig(id);
            return CommonResult.success(spaceSelectInfos);
        }catch (Exception e){
            return CommonResult.failed("查询失败！"+e.getMessage());
        }
    }

    @ApiOperation(value = "查询报价项目")
    @RequestMapping(value = "/querySpaceItemConfig",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<SpaceItemConfig>> querySpaceItemConfig(@RequestParam Long spaceItemId){
        try {
            List<SpaceItemConfig> spaceItemConfigs = service.querySpaceItemConfig(spaceItemId);
            return CommonResult.success(spaceItemConfigs);
        }catch (Exception e){
            return CommonResult.failed("查询失败！"+e.getMessage());
        }
    }

    @ApiOperation(value = "更新报价项目配置")
    @RequestMapping(value = "/updateSpaceItemConfig",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateSpaceItemConfig(@RequestBody SpaceItemConfig param){
        try {
            service.updateSpaceItemConfig(param);
        }catch (Exception e){
            return CommonResult.failed("查询失败！"+e.getMessage());
        }
        return CommonResult.failed("更新成功！");
    }


}
