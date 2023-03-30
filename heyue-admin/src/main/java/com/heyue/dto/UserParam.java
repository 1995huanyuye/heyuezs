package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户注册参数
 */
@Getter
@Setter
public class UserParam {

    @ApiModelProperty(value = "用户名" ,required = true,position = 0)
    private String userCode;

    @ApiModelProperty(value = "用户姓名",required = true,position = 1)
    private String userName;

    @ApiModelProperty(value = "性别",position = 2)
    private Integer sex;

    @ApiModelProperty(value = "手机号码",required = true,position = 3)
    private String phoneNumber;

    @ApiModelProperty(value = "用户密码",required = true,position = 4)
    private String password;

    @ApiModelProperty(value = "用户账号",position = 5)
    private String userAccount;
}
