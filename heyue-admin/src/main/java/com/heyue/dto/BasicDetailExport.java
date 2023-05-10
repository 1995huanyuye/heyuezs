package com.heyue.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BasicDetailExport {
    @ExcelProperty("定额名称")
    @ColumnWidth(value = 20)
    private String detailName;

    @ExcelProperty("定额分类")
    @ColumnWidth(value = 20)
    private String detailType;

    @ExcelProperty("定额编号")
    @ColumnWidth(value = 20)
    private String detailCode;

    @ExcelProperty("计价单位")
    @ColumnWidth(value = 20)
    private Integer unit;

    @ExcelProperty("计价数量向上取整")
    @ColumnWidth(value = 20)
    private Integer roundUp;

    @ExcelProperty("人工成本")
    @ColumnWidth(value = 20)
    private Double laborCost;

    @ExcelProperty("辅料成本")
    @ColumnWidth(value = 20)
    private Double auxiliaryMaterialCost;

    @ExcelProperty("人工售价")
    @ColumnWidth(value = 20)
    private Double laborPrice;

    @ExcelProperty("辅料售价")
    @ColumnWidth(value = 20)
    private Double accessoriesPrice;

    @ExcelProperty("辅材损耗率")
    @ColumnWidth(value = 20)
    private Double auxiliaryMaterialLossRate;

    @ExcelProperty("工程阶段")
    @ColumnWidth(value = 20)
    private Integer engineeringStage;

    @ExcelProperty("施工类型")
    @ColumnWidth(value = 20)
    private Integer constructionType;

    @ExcelProperty("施工工艺、材料说明")
    @ColumnWidth(value = 20)
    private String materialDescription;

    @ExcelProperty("上下架状态")
    @ColumnWidth(value = 20)
    private Integer shelfStatus;

    @ExcelProperty("排序")
    @ColumnWidth(value = 20)
    private Integer sort;

}
