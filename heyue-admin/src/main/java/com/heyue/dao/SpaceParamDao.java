package com.heyue.dao;

import com.heyue.model.SpaceItem;
import com.heyue.model.SpaceItemParam;
import com.heyue.model.SpaceParam;

import java.util.List;

public interface SpaceParamDao {
   int addSpaceParam(SpaceParam param);
   int batchAddSpaceItemParam(List<SpaceItemParam> list);
   void delSpaceParam(Long spaceParamId);
   void delSpaceParamByItemId(Long spaceItemId);
   void updateSpaceParam(SpaceParam param);
   void updateSpaceItem(SpaceItem spaceItem);
   List<SpaceParam> listSpaceParam();


}
