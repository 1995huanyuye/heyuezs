package com.heyue.serivce;

import com.heyue.dto.SpaceTemplateAgg;
import com.heyue.model.SpaceItem;

import java.util.List;

public interface SpaceModelCacheService {
    void delSpaceItem(Long id);

    void setSpaceItem(SpaceTemplateAgg vo);

    SpaceTemplateAgg getSpaceItemData(Long id);

    List<SpaceItem> getAll(Long id);

    void setAll(List<SpaceItem> list,Long category_id);

    void delAll(Long category_id);
}
