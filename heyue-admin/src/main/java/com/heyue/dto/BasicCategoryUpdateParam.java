package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BasicCategoryUpdateParam {
    @ApiModelProperty(value = "主键",position = 0)
    private Long id;
    @ApiModelProperty(value = "基装定额类别名称",position = 1)
    private String basicCategoryName;
    @ApiModelProperty(value = "排序值",position = 2)
    private Integer sort;
}
