package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 修改用户名密码参数
 */
@Getter
@Setter
public class UpdateUserPasswordParam {
    @ApiModelProperty(value = "用户名", required = true)
    private String userCode;
    @ApiModelProperty(value = "旧密码", required = true)
    private String oldPassword;
    @ApiModelProperty(value = "新密码", required = true)
    private String newPassword;
}
