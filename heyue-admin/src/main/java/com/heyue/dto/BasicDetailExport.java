package com.heyue.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BasicDetailExport {
    @ExcelProperty(value = "项目名称")
    @ColumnWidth(20)
    private String entryName;
    @ExcelProperty(value = "单位")
    @ColumnWidth(20)
    private Integer mainUnit;

    @ExcelProperty(value = "项目编码")
    @ColumnWidth(20)
    private String projectCode;

    @ExcelProperty(value = "成本价")
    @ColumnWidth(20)
    private Double costPrice;

    @ExcelProperty(value = "核算价")
    @ColumnWidth(20)
    private Double accountingPrice;

    @ExcelProperty(value = "销售价")
    @ColumnWidth(20)
    private Double salesPrice;

    @ExcelProperty(value = "最低售价")
    @ColumnWidth(20)
    private Double lowestSellingPrice;

    @ExcelProperty(value = "建议售价")
    @ColumnWidth(20)
    private Double recommendedSellingPrice;

    @ExcelProperty(value = "发包价")
    @ColumnWidth(20)
    private Double contractPrice;

    @ExcelProperty(value = "品牌")
    @ColumnWidth(20)
    private Long brandId;

    @ExcelProperty(value = "型号")
    @ColumnWidth(20)
    private Long modelId;

    @ExcelProperty(value = "规格")
    @ColumnWidth(20)
    private Long specifications;

    @ExcelProperty(value = "颜色")
    @ColumnWidth(20)
    private Long color;

    @ExcelProperty(value = "项目说明")
    @ColumnWidth(20)
    private String projectDescription;

    @ExcelProperty(value = "计价说明")
    @ColumnWidth(20)
    private String pricingInstructions;

    @ExcelProperty(value = "验收标准")
    @ColumnWidth(20)
    private String acceptanceCriteria;
}
