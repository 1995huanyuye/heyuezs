package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicDetailParam {
    @ApiModelProperty(value = "项目名称",position = 0)
    private String entryName;

    @ApiModelProperty(value = "项目编码",position = 1)
    private String projectCode;

    @ApiModelProperty(value = "工程阶段",position = 2)
    private String engineeringStage;

    @ApiModelProperty(value = "施工类型",position = 3)
    private String constructionType;

    @ApiModelProperty(value = "成本价",position = 4)
    private Double costPrice;

    @ApiModelProperty(value = "核算价",position = 5)
    private Double accountingPrice;

    @ApiModelProperty(value = "销售价",position = 6)
    private Double salesPrice;

    @ApiModelProperty(value = "最低售价",position = 7)
    private Double lowestSellingPrice;

    @ApiModelProperty(value = "建议售价",position = 8)
    private Double recommendedSellingPrice;

    @ApiModelProperty(value = "发包价",position = 9)
    private Double contractPrice;

    @ApiModelProperty(value = "主单位（枚举展示）",position = 10)
    private Integer mainUnit;

    @ApiModelProperty(value = "副单位（枚举展示）",position = 11)
    private Integer deputyUnit;

    @ApiModelProperty(value = "品牌",position = 12)
    private Long brandId;

    @ApiModelProperty(value = "型号",position = 13)
    private Long modelId;

    @ApiModelProperty(value = "规格",position = 14)
    private Long specifications;

    @ApiModelProperty(value = "颜色",position = 15)
    private Long color;

    @ApiModelProperty(value = "公式",position = 16)
    private String formula;

    @ApiModelProperty(value = "是否移入明细",position = 17)
    private String moveDetails;

    @ApiModelProperty(value = "上架状态",position = 18)
    private String shelfStatus;

    @ApiModelProperty(value = "漏项提醒",position = 19)
    private String remind;

    @ApiModelProperty(value = "是否向上取整",position = 20)
    private String roundUp;

    @ApiModelProperty(value = "项目说明",position = 21)
    private String projectDescription;

    @ApiModelProperty(value = "计价说明",position =22)
    private String pricingInstructions;

    @ApiModelProperty(value = "验收标准",position = 23)
    private String acceptanceCriteria;

    @ApiModelProperty(value = "上传图片",position = 24)
    private byte[] image;
}
