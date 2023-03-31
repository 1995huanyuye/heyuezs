package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaterialCategoryParam {
    @ApiModelProperty(value = "材料定额类别名称",position = 0)
    private String materialCategoryName;

    @ApiModelProperty(value = "材料定额类别编码",position = 1)
    private String materialCategoryCode;

    @ApiModelProperty(value = "上级节点",position = 2)
    private Long parentId;

    @ApiModelProperty(value = "是否根节点",position = 3)
    private String isroot;

    @ApiModelProperty(value = "排序值",position = 4)
    private Integer sort;
}
