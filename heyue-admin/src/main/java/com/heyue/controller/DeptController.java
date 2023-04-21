package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.DeptParam;
import com.heyue.model.Dept;
import com.heyue.model.User;
import com.heyue.serivce.DeptService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "部门管理")
@RequestMapping("/dept")
@CrossOrigin
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
    @RequestMapping(value = "/addDept",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addDept(@RequestBody DeptParam param){
        String message = "";
        int count = deptService.addDept(param);
        if(count==-1){
            message = "部门编码重复";
        }else if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed(message);
    }

    @ApiOperation("修改部门信息")
    @RequestMapping(value = "/updateDept",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDept(@RequestBody DeptParam param){
        int count = deptService.updateDept(param);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除部门")
    @RequestMapping(value = "/deleteDept",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteDept(@RequestParam("id") Long id){
        int count = deptService.deleteDept(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("查询部门信息")
    @RequestMapping(value = "/{deptCode}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Dept> queryDeptInfo(@PathVariable("deptCode") String deptCode){
        Dept dept = deptService.queryDeptInfo(deptCode);
        if(dept == null){
            return CommonResult.failed("未找到指定部门");
        }
        return CommonResult.success(dept);
    }

}
