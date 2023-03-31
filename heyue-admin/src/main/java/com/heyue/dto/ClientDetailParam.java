package com.heyue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClientDetailParam {
    @ApiModelProperty(value = "报价类型",position = 0)
    private String quotationType;

    @ApiModelProperty(value = "装修类型",position = 1)
    private String decorationType;

    @ApiModelProperty(value = "交房状态",position = 2)
    private Integer deliveryStatus;

    @ApiModelProperty(value = "交房时间",position = 3)
    private Date deliveryTime;

    @ApiModelProperty(value = "预计开工日期",position = 4)
    private Date beginTime;

    @ApiModelProperty(value = "合同工期",position = 5)
    private Integer timeLimit;

    @ApiModelProperty(value = "性别",position = 6)
    private Integer sex;

    @ApiModelProperty(value = "客户生日",position = 7)
    private Date clientBirthday;

    @ApiModelProperty(value = "现居地址",position = 8)
    private String clientAddress;

    @ApiModelProperty(value = "约定交底日期",position = 9)
    private Date endTime;

    @ApiModelProperty(value = "录入人",position = 10)
    private Long modifyer;

    @ApiModelProperty(value = "是否公开",position = 11)
    private Integer ispublic;

    @ApiModelProperty(value = "客户分类",position = 12)
    private Integer type;
}
