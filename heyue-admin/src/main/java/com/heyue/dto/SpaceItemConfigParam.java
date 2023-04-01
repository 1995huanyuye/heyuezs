package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpaceItemConfigParam {
    @ApiModelProperty(value = "空间id",position = 0)
    private Long spaceItemId;

    @ApiModelProperty(value = "关联基装或者材料目录id",position = 1)
    private Long spaceConfigId;

    @ApiModelProperty(value = "0：基装 1：材料",position = 2)
    private Integer type;

    @ApiModelProperty(value = "项目说明",position = 3)
    private String note;

    @ApiModelProperty(value = "排序",position = 4)
    private Integer sort;
}
