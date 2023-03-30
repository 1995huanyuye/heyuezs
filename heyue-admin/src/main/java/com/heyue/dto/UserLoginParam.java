package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户登录参数
 */
@Data
@EqualsAndHashCode
public class UserLoginParam {
    @ApiModelProperty(value = "用户名",required = true,position = 0)
    private String userCode;
    @ApiModelProperty(value = "密码",required = true,position = 1)
    private String password;
}
