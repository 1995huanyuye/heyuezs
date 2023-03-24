package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.model.BudgetModelInfo;
import com.heyue.serivce.BudgetModelInfoService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "空间模板详细信息")
@RequestMapping("/budgetmodelinfo")
public class BudgetModelInfoController {
    @Autowired
    private BudgetModelInfoService service;

    @ApiOperation("添加空间详细信息")
    @GetMapping(value = "/addBudgetModelInfo")
    @ResponseBody
    public CommonResult addBudgetModelInfo(@RequestBody BudgetModelInfo info){
        info.setId(PKeyGenerator.generator());
        int count = service.addBudgetModelInfo(info);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改空间详细信息")
    @GetMapping(value = "/updateBudgetModelInfo")
    @ResponseBody
    public CommonResult updateBudgetModelInfo(@RequestBody BudgetModelInfo info){
        int count = service.updateBudgetModelInfo(info);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除空间信息")
    @GetMapping(value = "/deleteBudgetModelInfo")
    @ResponseBody
    public CommonResult deleteBudgetModelInfo(@RequestParam("id") Long id){
        int count = service.deleteBudgetModelInfo(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
