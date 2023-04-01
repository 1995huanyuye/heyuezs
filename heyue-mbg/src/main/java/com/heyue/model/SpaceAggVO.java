package com.heyue.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *空间模板参数
 */
@Getter
@Setter
public class SpaceAggVO {
    private SpaceItem item ;
    private List<SpaceItemParam> itemParams;
    private List<SpaceItemConfig> itemConfigs;

}
