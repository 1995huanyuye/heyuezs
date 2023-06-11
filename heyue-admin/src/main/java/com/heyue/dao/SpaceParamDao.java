package com.heyue.dao;

import com.heyue.model.SpaceParam;

import java.util.List;

public interface SpaceParamDao {
   int addSpaceParam(SpaceParam param);
   void delSpaceParam(Long spaceParamId);
   void updateSpaceParam(SpaceParam param);
   List<SpaceParam> listSpaceParam();

}
