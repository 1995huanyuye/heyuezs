package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpaceCategoryParam {
    @ApiModelProperty(value = "分类名称",position = 0)
    private String categoryName;

    @ApiModelProperty(value = "分类编码",position = 1)
    private String categoryCode;

    @ApiModelProperty(value = "空间类型 0：内部空间 1：代购空间",position = 2)
    private Integer type;

    @ApiModelProperty(value = "排序值",position = 3)
    private Integer sort;

    @ApiModelProperty(value = "最后一级才可以添加空间",position = 4)
    private String islast;
}
