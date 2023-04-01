package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpaceItemParam4Add {
    @ApiModelProperty(value = "参数id",position = 0)
    private Long spaceParamId;

    @ApiModelProperty(value = "空间主键",position = 1)
    private Long spaceItemId;

    @ApiModelProperty(value = "数值",position = 2)
    private Float value;
}
