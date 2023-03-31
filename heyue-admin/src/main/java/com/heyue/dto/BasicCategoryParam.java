package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicCategoryParam {
    @ApiModelProperty(value = "基装定额类别名称",position = 0)
    private String basicCategoryName;

    @ApiModelProperty(value = "基装定额类别编码",position = 1)
    private String basicCategoryCode;

    @ApiModelProperty(value = "上级节点",position = 2)
    private Long parentId;

    @ApiModelProperty(value = "是否根节点",position = 3)
    private String isroot;
}
