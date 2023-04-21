package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.MaterialDetailParam;
import com.heyue.model.BasicDetail;
import com.heyue.model.MaterialDetail;
import com.heyue.serivce.MaterialDetailService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "材料定额")
@RequestMapping("/material_detail")
@CrossOrigin
public class MaterialDetailController {
    @Autowired
    private MaterialDetailService service;

    @ApiOperation("获取所有材料定额")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MaterialDetail>> listAll(@RequestParam Long category_id,@RequestParam String isHaveParent){
        List<MaterialDetail> details = service.listAll(category_id,isHaveParent);
        return CommonResult.success(details);
    }

    @ApiOperation(value = "材料定额详细信息")
    @RequestMapping(value = "/query",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<MaterialDetail> query(Long detail_id){
        MaterialDetail detail = service.loadMaterialDetailById(detail_id);
        return CommonResult.success(detail);
    }

    @ApiOperation("添加材料定额")
    @RequestMapping(value = "/addMaterialDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addMaterialDetail(@RequestParam Long category_id,@RequestBody MaterialDetailParam param){
        String message = "";
        int count = service.addMaterialDetail(param,category_id);
        if(count==-1){
            message = "基装定额编码重复";
        }
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed(message);
    }

    @ApiOperation("修改材料定额")
    @RequestMapping(value = "/updateMaterialDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateMaterialDetail(@RequestBody MaterialDetail detail){
        int count = service.updateMaterialDetail(detail);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除材料定额")
    @RequestMapping(value = "/deleteMaterialDetail",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMaterialDetail(@RequestParam("id") Long id){
        int count = service.deleteMaterialDetail(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
