package com.heyue.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.heyue.util.RoundUpConverter;
import com.heyue.util.ShelfStatusConverter;
import com.heyue.util.UnitConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MaterialDetailExport {
    @ExcelProperty(value = "定额名称")
    @ColumnWidth(value = 20)
    private String materialNumber;

    @ExcelProperty(value = "定额分类")
    @ColumnWidth(value = 20)
    private String materialClassification;

    @ExcelProperty(value = "材料类型")
    @ColumnWidth(value = 20)
    private String materialType;

    @ExcelProperty(value = "定额编号")
    @ColumnWidth(value = 20)
    private String materialCode;

    @ExcelProperty(value = "计量单位",converter = UnitConverter.class)
    @ColumnWidth(value = 20)
    private Integer unit;

    @ExcelProperty(value = "计价数量向上取整",converter = RoundUpConverter.class)
    @ColumnWidth(value = 20)
    private Integer roundUp;

    @ExcelProperty(value = "材料成本")
    @ColumnWidth(value = 20)
    private String materialCost;

    @ExcelProperty(value = "材料售价")
    @ColumnWidth(value = 20)
    private String materialPrice;

    @ExcelProperty(value = "材料损耗率")
    @ColumnWidth(value = 20)
    private String materialWastageRate;

    @ExcelProperty(value = "品牌")
    @ColumnWidth(value = 20)
    private String brand;

    @ExcelProperty(value = "型号")
    @ColumnWidth(value = 20)
    private String modelNumber;

    @ExcelProperty(value = "规格")
    @ColumnWidth(value = 20)
    private String specification;

    @ExcelProperty(value = "颜色")
    @ColumnWidth(value = 20)
    private String color;

    @ExcelProperty(value = "供应商")
    @ColumnWidth(value = 20)
    private String supplier;

    @ExcelProperty(value = "工程阶段")
    @ColumnWidth(value = 20)
    private Integer engineeringStage;

    @ExcelProperty(value = "施工类型")
    @ColumnWidth(value = 20)
    private Integer constructionType;

    @ExcelProperty(value = "施工工艺、材料说明")
    @ColumnWidth(value = 20)
    private String materialDescription;

    @ExcelProperty(value = "上下架状态",converter = ShelfStatusConverter.class)
    @ColumnWidth(value = 20)
    private String shelfStatus;

    @ExcelProperty(value = "排序")
    @ColumnWidth(value = 20)
    private Integer sort;
}
