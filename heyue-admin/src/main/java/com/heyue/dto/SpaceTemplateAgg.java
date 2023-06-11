package com.heyue.dto;

import com.heyue.model.DecorationProject;
import com.heyue.model.SpaceItemConfig;
import com.heyue.model.SpaceItemParam;
import com.heyue.model.SpaceParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SpaceTemplateAgg {
    @ApiModelProperty(value = "主键（新增时不传）",position = 0)
    private Long id;
    @ApiModelProperty(value = "空间名称",position = 1)
    private String spaceItemName;
    @ApiModelProperty(value = " 1=套餐模式 2=自由整装 3=清单模式",position = 2)
    private Integer spaceType;
    @ApiModelProperty(value = "备注说明",position = 3)
    private String note;
    @ApiModelProperty(value= "测量信息",position = 4)
    private List<SpaceItemParam> paramList ;
    @ApiModelProperty(value= "装修项目",position = 5)
    private List<SpaceItemConfig> itemConfigList;
}
