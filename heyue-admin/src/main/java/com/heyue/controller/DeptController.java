package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.model.Dept;
import com.heyue.serivce.DeptService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "部门管理")
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @ApiOperation("获取所有部门")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Dept>> listAll(){
        List<Dept> clients = deptService.listAll();
        return CommonResult.success(clients);
    }

    @ApiOperation("添加部门")
    @GetMapping(value = "/addDept")
    @ResponseBody
    public CommonResult addDept(@RequestBody Dept dept){
        dept.setId(PKeyGenerator.generator());
        int count = deptService.addDept(dept);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改部门信息")
    @GetMapping(value = "/updateDept")
    @ResponseBody
    public CommonResult updateDept(@RequestBody Dept dept){
        int count = deptService.updateDept(dept);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除客户")
    @GetMapping(value = "/deleteDept")
    @ResponseBody
    public CommonResult deleteDept(@RequestParam("id") Long id){
        int count = deptService.deleteDept(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

//    @ApiOperation("添加部门")
//    @GetMapping(value = "/addDeptTest")
//    @ResponseBody
//    public CommonResult addDeptTest(){
//        Dept dept = new Dept();
//        dept.setId(PKeyGenerator.generator());
//        dept.setDeptCode("dept3");
//        dept.setDeptName("部门三");
//        dept.setParentDept(16789396041340L);
//        int count = deptService.addDept(dept);
//        if(count>0){
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed();
//    }

}
