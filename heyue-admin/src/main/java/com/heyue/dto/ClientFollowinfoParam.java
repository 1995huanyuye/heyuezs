package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientFollowinfoParam {
    @ApiModelProperty(value = "跟单业务部门",position = 0)
    private String followDept;

    @ApiModelProperty(value = "跟单人员",position = 1)
    private String userId;
}
