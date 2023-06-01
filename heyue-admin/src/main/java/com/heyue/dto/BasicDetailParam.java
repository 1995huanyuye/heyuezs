package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicDetailParam {
    @ApiModelProperty(value = "定额分类",position = 0)
    private String detailType;

    @ApiModelProperty(value = "定额名称",position = 1)
    private String detailName;

    @ApiModelProperty(value = "定额编号",position = 2)
    private String detailCode;

    @ApiModelProperty(value = "计价单位",position = 3)
    private Integer unit;

    @ApiModelProperty(value = "计价数量向上取整",position = 3)
    private Integer roundUp;

    @ApiModelProperty(value = "人工成本",position = 4)
    private String laborCost;

    @ApiModelProperty(value = "辅料成本",position = 5)
    private String auxiliaryMaterialCost;

    @ApiModelProperty(value = "人工售价",position = 6)
    private String laborPrice;

    @ApiModelProperty(value = "辅料售价",position = 7)
    private String accessoriesPrice;

    @ApiModelProperty(value = "辅材损耗率",position = 8)
    private String auxiliaryMaterialLossRate;

    @ApiModelProperty(value = "工程阶段",position = 9)
    private Integer engineeringStage;

    @ApiModelProperty(value = "施工类型",position = 10)
    private Integer constructionType;

    @ApiModelProperty(value = "施工工艺、材料说明",position = 11)
    private String materialDescription;

    @ApiModelProperty(value = "图片",position = 12)
    private String image;

    @ApiModelProperty(value = "上架状态",position = 13)
    private Integer shelfStatus;

    @ApiModelProperty(value = "排序",position = 14)
    private Integer sort;

}
