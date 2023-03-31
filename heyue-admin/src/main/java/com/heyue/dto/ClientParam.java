package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientParam {
    @ApiModelProperty(value = "业主姓名",position = 0)
    private String clientName;

    @ApiModelProperty(value = "电话",position = 1)
    private String telephone;

    @ApiModelProperty(value = "客户来源",position = 2)
    private Integer clientResource;

    @ApiModelProperty(value = "提供者",position = 3)
    private Long provider;

    @ApiModelProperty(value = "备用电话",position = 4)
    private String vote;

    @ApiModelProperty(value = "所在楼盘",position = 5)
    private String location;

    @ApiModelProperty(value = "项目名称",position = 6)
    private String projectName;

    @ApiModelProperty(value = "项目地址",position = 7)
    private String projectAddress;

    @ApiModelProperty(value = "套内面积",position = 8)
    private Float inArea;

    @ApiModelProperty(value = "面积",position = 9)
    private Float area;

    @ApiModelProperty(value = "房屋户型",position = 10)
    private String type;

    @ApiModelProperty(value = "客户备注",position = 11)
    private String note;
}
