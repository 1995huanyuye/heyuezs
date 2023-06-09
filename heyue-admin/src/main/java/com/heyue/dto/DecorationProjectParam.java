package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DecorationProjectParam {
    @ApiModelProperty(value = "项目名称",position = 0)
    private String projectName;

    @ApiModelProperty(value = "项目说明",position = 1)
    private String note;

    @ApiModelProperty(value = "项目类型",position = 2)
    private Integer projectType;
}
