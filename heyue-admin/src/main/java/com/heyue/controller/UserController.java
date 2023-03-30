package com.heyue.controller;

import cn.hutool.core.collection.CollUtil;
import com.heyue.api.CommonPage;
import com.heyue.api.CommonResult;
import com.heyue.dto.UpdateUserPasswordParam;
import com.heyue.dto.UserLoginParam;
import com.heyue.dto.UserParam;
import com.heyue.model.Role;
import com.heyue.model.User;
import com.heyue.serivce.RoleService;
import com.heyue.serivce.UserAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Api(tags = "用户管理")
@RequestMapping("/admin")
public class UserController {

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private UserAdminService userAdminService;

    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<User> register(@Validated @RequestBody UserParam param){
        User user = userAdminService.register(param);
        if(user==null){
            return CommonResult.failed();
        }
        return CommonResult.success(user);
    }

    @ApiOperation(value = "登录后返回token")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@Validated @RequestBody UserLoginParam param){
        String token = userAdminService.login(param.getUserCode(), param.getPassword());
        if(token==null){
            return CommonResult.validateFailed("用户名或密码错误");
        }
        HashMap<String, String> tokenMap = new HashMap<>(2);
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/refreshToken",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult refreshToken(HttpServletRequest request){
        String token = request.getHeader(tokenHeader);
        String refreshToken = userAdminService.refreshToken(token);
        if(refreshToken==null){
            return CommonResult.failed("token 已经过期！");
        }
        HashMap<String, String> tokenMap = new HashMap<>(2);
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getUserInfo(Principal principal){
        if (principal == null){
            return CommonResult.unauthorized(null);
        }
        String userCode = principal.getName();
        User user = userAdminService.getUserByUserCode(userCode);
        HashMap<String, Object> data = new HashMap<>(3);
        data.put("usercode",user.getUserCode());
        data.put("menus",roleService.getMenuList(user.getId()));
        List<Role> roleList = userAdminService.getRoleList(user.getId());
        if(CollUtil.isNotEmpty(roleList)){
            List<String> roles = roleList.stream().map(Role::getRoleName).collect(Collectors.toList());
            data.put("roles",roles);
        }
        return CommonResult.success(data);
    }

    @ApiOperation(value = "登出功能")
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult logout(){
        return CommonResult.success(null);
    }

    @ApiOperation(value = "根据用户名或姓名分页获取用户列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<User>> list(@RequestParam(value = "keyword",required = false) String keyword,
                                               @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                               @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){
        List<User> list = userAdminService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "获取指定用户信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<User> getItem(@PathVariable Long userId){
        User user = userAdminService.getItem(userId);
        if(user==null){
            return CommonResult.failed("未找到指定用户");
        }
        return CommonResult.success(user);
    }

    @ApiOperation(value = "修改指定用户信息")
    @RequestMapping(value = "/udpate/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long userId,@RequestBody User user){
        int count = userAdminService.update(userId,user);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "修改指定用户密码")
    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@Validated @RequestBody UpdateUserPasswordParam param){
        int status = userAdminService.updatePassword(param);
        if(status>0){
            return CommonResult.success(status);
        }else if (status == -1) {
            return CommonResult.failed("提交参数不合法");
        } else if (status == -2) {
            return CommonResult.failed("找不到该用户");
        } else if (status == -3) {
            return CommonResult.failed("旧密码错误");
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "删除指定用户信息")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        int count = userAdminService.delete(id);
        if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改帐号状态")
    @RequestMapping(value = "/updateStatus/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateStatus(@PathVariable Long id,@RequestParam(value = "status") Integer status) {
        User user = new User();
        user.setStatus(status);
        int count = userAdminService.update(id,user);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("给用户分配角色")
    @RequestMapping(value = "/role/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateRole(@RequestParam("adminId") Long adminId,
                                   @RequestParam("roleIds") List<Long> roleIds) {
        int count = userAdminService.updateRole(adminId, roleIds);
        if (count >= 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取指定用户的角色")
    @RequestMapping(value = "/role/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Role>> getRoleList(@PathVariable Long adminId) {
        List<Role> roleList = userAdminService.getRoleList(adminId);
        return CommonResult.success(roleList);
    }

}
