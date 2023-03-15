package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.model.User;
import com.heyue.serivce.UserSerivce;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "UserController")
@Tag(name = "UserController",description = "用户管理")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserSerivce userSerivce;

    @ApiOperation("获取所有用户")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<User>> listAll(){
        List<User> users = userSerivce.listAll();
        return CommonResult.success(users);
    }

    @ApiOperation("添加用户")
    @GetMapping(value = "/addUser")
    @ResponseBody
    public CommonResult addUser(@RequestBody User user){
        user.setId(PKeyGenerator.generator());
        int count = userSerivce.addUser(user);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改用户信息")
    @GetMapping(value = "/updateUser")
    @ResponseBody
    public CommonResult updateUser(@RequestBody User user){
        int count = userSerivce.updateUser(user);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除用户")
    @GetMapping(value = "/deleteUser")
    @ResponseBody
    public CommonResult deleteUser(@RequestParam("id") Long id){
        int count = userSerivce.deleteUser(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
