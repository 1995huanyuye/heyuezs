package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpaceItemAddParam {
    @ApiModelProperty(value = "空间分类id",position = 0)
    private Long categoryId;

    @ApiModelProperty(value = "空间名称",position = 1)
    private String spaceItemName;

    @ApiModelProperty(value = "空间编码",position = 2)
    private String spaceItemCode;

    @ApiModelProperty(value = "移入限制 0：不限制 1：套内空间 2：套外空间",position = 3)
    private Integer limit;

    @ApiModelProperty(value = "空间类型 0：清单空间 1：套餐空间 2：整装（基装包）3：整装（材料包）4：套餐包（新）",position = 4)
    private Integer spaceType;

    @ApiModelProperty(value = "备注说明",position = 5)
    private String note;

    @ApiModelProperty(value = "排序值",position = 6)
    private Integer sort;
}
