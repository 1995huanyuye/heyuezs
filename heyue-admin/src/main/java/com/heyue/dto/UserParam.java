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

    @ApiModelProperty(value = "用户名" ,required = true)
    private String userCode;

    @ApiModelProperty(value = "用户姓名",required = true)
    private String userName;

    @ApiModelProperty(value = "性别")
    private Integer sex;

    @ApiModelProperty(value = "手机号码",required = true)
    private String phoneNumber;

    @ApiModelProperty(value = "用户密码",required = true)
    private String password;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;
}
