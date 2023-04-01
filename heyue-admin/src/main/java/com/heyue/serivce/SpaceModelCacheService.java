package com.heyue.serivce;

import com.heyue.model.SpaceAggVO;
import com.heyue.model.SpaceItem;

import java.util.List;

public interface SpaceModelCacheService {
    void delSpaceItem(Long id);

    void setSpaceItem(SpaceAggVO vo);

    SpaceAggVO getSpaceItemData(Long id);

    List<SpaceItem> getAll(Long id);

    void setAll(List<SpaceItem> list,Long category_id);

    void delAll(Long category_id);
}
