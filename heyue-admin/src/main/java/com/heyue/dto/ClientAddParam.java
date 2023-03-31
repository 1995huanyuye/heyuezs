package com.heyue.dto;

import com.heyue.model.ClientDetail;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 客户参数
 */
@Getter
@Setter
public class ClientAddParam {

    @ApiModelProperty(value = "客户详细信息",position = 0)
    private ClientParam clientParam;
    @ApiModelProperty(value = "客户详细信息",position = 1)
    private ClientDetailParam detailParam;

    @ApiModelProperty(value = "跟单信息",position = 2)
    private ClientFollowinfoParam followinfoParam;

}
