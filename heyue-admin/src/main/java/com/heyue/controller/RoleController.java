package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.constinfo.staff.StaffConst;
import com.heyue.model.Role;
import com.heyue.serivce.RoleService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = "角色管理")
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @ApiOperation("添加角色")
    @GetMapping(value = "/addRole")
    @ResponseBody
    public CommonResult addRole(@RequestBody Role role){
        role.setId(PKeyGenerator.generator());
        int count = roleService.addRole(role);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改角色信息")
    @GetMapping(value = "/updateRole")
    @ResponseBody
    public CommonResult updateRole(@RequestBody Role role){
        int count = roleService.updateRole(role);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除角色")
    @GetMapping(value = "/deleteRole")
    @ResponseBody
    public CommonResult deleteRole(@RequestParam("id") Long id){
        int count = roleService.deleteRole(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

//    @ApiOperation("添加角色")
//    @GetMapping(value = "/addRoleTest")
//    @ResponseBody
//    public CommonResult addRoleTest(){
//        Role role = new Role();
//        role.setId(PKeyGenerator.generator());
//        role.setRoleName("业务员");
//        role.setRoleCode("employee");
//        role.setStatus(StaffConst.ABLE);
//        int count = roleService.addRole(role);
//        if(count>0){
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed();
//    }
}
