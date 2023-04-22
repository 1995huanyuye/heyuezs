package com.heyue.controller;

import cn.hutool.core.collection.CollUtil;
import com.heyue.api.CommonPage;
import com.heyue.api.CommonResult;
import com.heyue.dto.LoginDto;
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
@CrossOrigin
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
    public CommonResult<LoginDto> login(@Validated @RequestBody UserLoginParam param){
        LoginDto dto = userAdminService.login(param.getUserCode(), param.getPassword());
        if(dto==null){
            return CommonResult.validateFailed("用户名或密码错误");
        }
        return CommonResult.success(dto);
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
    @RequestMapping(value = "/{user_id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<User> getItem(@PathVariable Long user_id){
        User user = userAdminService.getItem(user_id);
        if(user==null){
            return CommonResult.failed("未找到指定用户");
        }
        return CommonResult.success(user);
    }

    @ApiOperation(value = "修改指定用户信息")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody User user){
        int count = userAdminService.update(user);
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
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("user_id") Long user_id) {
        int count = userAdminService.delete(user_id);
        if (count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("给用户分配角色")
    @RequestMapping(value = "/role/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateRole(@RequestParam("user_id") Long user_id,
                                   @RequestParam("roleIds") List<Long> roleIds) {
        int count = userAdminService.updateRole(user_id, roleIds);
        if (count >= 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取指定用户的角色")
    @RequestMapping(value = "/role/getrolelist", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Role>> getRoleList(@RequestParam("user_id") Long user_id) {
        List<Role> roleList = userAdminService.getRoleList(user_id);
        return CommonResult.success(roleList);
    }

}
