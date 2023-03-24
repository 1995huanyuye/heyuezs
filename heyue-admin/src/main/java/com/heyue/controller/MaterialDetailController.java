package com.heyue.controller;

import com.heyue.api.CommonResult;
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
public class MaterialDetailController {
    @Autowired
    private MaterialDetailService service;

    @ApiOperation("获取所有材料定额")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MaterialDetail>> listAll(){
        List<MaterialDetail> details = service.listAll();
        return CommonResult.success(details);
    }

    @ApiOperation("添加材料定额")
    @GetMapping(value = "/addMaterialDetail")
    @ResponseBody
    public CommonResult addMaterialDetail(@RequestBody MaterialDetail detail){
        detail.setId(PKeyGenerator.generator());
        int count = service.addMaterialDetail(detail);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改材料定额")
    @GetMapping(value = "/updateMaterialDetail")
    @ResponseBody
    public CommonResult updateMaterialDetail(@RequestBody MaterialDetail detail){
        int count = service.updateMaterialDetail(detail);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除材料定额")
    @GetMapping(value = "/deleteMaterialDetail")
    @ResponseBody
    public CommonResult deleteMaterialDetail(@RequestParam("id") Long id){
        int count = service.deleteMaterialDetail(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
