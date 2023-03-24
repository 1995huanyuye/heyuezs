package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.model.BudgetModel;
import com.heyue.serivce.BudgetModelService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "空间模板")
@RequestMapping("/budgetmodel")
public class BudgetModelController {
    @Autowired
    private BudgetModelService service;

    @ApiOperation("获取所有空间模板")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<BudgetModel>> listAll(){
        List<BudgetModel> details = service.listAll();
        return CommonResult.success(details);
    }

    @ApiOperation("添加空间模板")
    @GetMapping(value = "/addBudgetModel")
    @ResponseBody
    public CommonResult addBudgetModel(@RequestBody BudgetModel model){
        model.setId(PKeyGenerator.generator());
        int count = service.addBudgetModel(model);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改空间模板信息")
    @GetMapping(value = "/updateBudgetModel")
    @ResponseBody
    public CommonResult updateBudgetModel(@RequestBody BudgetModel model){
        int count = service.updateBudgetModel(model);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除空间模板")
    @GetMapping(value = "/deleteBudgetModel")
    @ResponseBody
    public CommonResult deleteBudgetModel(@RequestParam("id") Long id){
        int count = service.deleteBudgetModel(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
