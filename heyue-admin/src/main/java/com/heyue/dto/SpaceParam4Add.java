package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpaceParam4Add {
    @ApiModelProperty(value = "参数名称",position = 0)
    private String paramName;

    @ApiModelProperty(value = "参数代码",position = 1)
    private String paramCode;

    @ApiModelProperty(value = "单位",position = 2)
    private String unit;
}
