package com.heyue.dto;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.heyue.util.RoundUpConverter;
import com.heyue.util.UnitConverter;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaterialDetailParam {
    @ApiModelProperty(value = "定额名称",position = 0)
    private String materialNumber;
    @ApiModelProperty(value = "定额分类",position = 1)
    private String materialClassification;
    @ApiModelProperty(value = "材料类型",position = 2)
    private String materialType;
    @ApiModelProperty(value = "定额编号",position = 3)
    private String materialCode;
    @ApiModelProperty(value = "计量单位",position = 4)
    private Integer unit;
    @ApiModelProperty(value = "计价数量向上取整",position = 5)
    private Integer roundUp;
    @ApiModelProperty(value = "材料成本",position = 6)
    private String materialCost;
    @ApiModelProperty(value = "材料售价",position = 7)
    private String materialPrice;
    @ApiModelProperty(value = "材料损耗率",position = 8)
    private String materialWastageRate;
    @ApiModelProperty(value = "品牌",position = 9)
    private String brand;
    @ApiModelProperty(value = "型号",position = 10)
    private String modelNumber;
    @ApiModelProperty(value = "规格",position = 11)
    private String specification;
    @ApiModelProperty(value = "颜色",position = 12)
    private String color;
    @ApiModelProperty(value = "供应商",position = 13)
    private String supplier;
    @ApiModelProperty(value = "工程阶段",position = 14)
    private Integer engineeringStage;
    @ApiModelProperty(value = "施工类型",position = 15)
    private Integer constructionType;
    @ApiModelProperty(value = "施工工艺、材料说明",position = 16)
    private String materialDescription;
    @ApiModelProperty(value = "图片",position = 17)
    private String image;
    @ApiModelProperty(value = "上架状态",position = 18)
    private String shelfStatus;
    @ApiModelProperty(value = "排序",position = 19)
    private Integer sort;
}
