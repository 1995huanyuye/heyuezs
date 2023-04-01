package com.heyue.serivce;

import com.heyue.dto.SpaceItemAddParam;
import com.heyue.dto.SpaceItemConfigParam;
import com.heyue.dto.SpaceItemParam4Add;
import com.heyue.model.SpaceAggVO;
import com.heyue.model.SpaceItem;
import com.heyue.model.SpaceItemConfig;
import com.heyue.model.SpaceItemParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SpaceModelService {
    /**
     * 获取分类下所有空间
     */
    List<SpaceItem> listAll(Long category_id);

    /**
     * 获取空间
     */
    @Transactional
    SpaceAggVO getItem(Long item_id);

    /**
     * 新增空间
     */
    Long addSpaceItem(SpaceItemAddParam param,Long category_id);

    /**
     * 新增配置参数
     */
    int addSpaceItemParam(SpaceItemParam4Add o,Long item_id);
    /**
     * 删除配置参数
     */
    int delSpaceItemParam(SpaceItemParam o);
    /**
     * 新增装修配置
     */
    int addSpaceItemConfig(SpaceItemConfigParam o, Long item_id);
    /**
     * 删除装修配置
     */
    int delSpaceItemConfig(SpaceItemConfig o);
    /**
     * 更新空间
     */
    int updateSpaceItem(SpaceItem item);
    /**
     * 删除空间
     */
    @Transactional
    int deleteSpaceItem(Long id,Long category_id);

    @Transactional
    SpaceAggVO loadSpaceDataById(Long id);

    SpaceModelCacheService getCacheService();
}
