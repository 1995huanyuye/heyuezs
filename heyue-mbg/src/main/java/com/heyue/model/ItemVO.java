package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ItemVO implements Serializable {
    private Long id;
    @ApiModelProperty(value = "字段中文")
    private String column_names;
    @ApiModelProperty(value = "字段")
    private String column_code;

    @ApiModelProperty(value = "是否显示")
    private Integer isshow;

    @ApiModelProperty(value = "排序")
    private Integer sort;

}
