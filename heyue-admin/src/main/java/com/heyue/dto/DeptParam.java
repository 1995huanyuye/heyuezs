package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 添加部门参数
 */
@Getter
@Setter
public class DeptParam {
    @ApiModelProperty(value = "上级部门",position = 0)
    private Long parentDept;

    @ApiModelProperty(value = "部门编码",position = 1)
    private String deptCode;

    @ApiModelProperty(value = "部门名称",position = 2)
    private String deptName;
}
