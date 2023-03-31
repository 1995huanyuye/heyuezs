package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ClientAggVO implements Serializable {

    @ApiModelProperty(value = "客户详细信息",position = 0)
    public Client client;
    @ApiModelProperty(value = "客户详细信息",position = 1)
    public ClientDetail clientDetail;
    @ApiModelProperty(value = "跟单信息",position = 2)
    public ClientFollowinfo clientFollowinfo;

}
