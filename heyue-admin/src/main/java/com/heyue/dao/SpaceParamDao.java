package com.heyue.dao;

import com.heyue.model.SpaceParam;

import java.util.List;

public interface SpaceParamDao {
   int addSpaceParam(SpaceParam param);
   void delSpaceParam(Long spaceParamId);
   void updateSpaceParam(Long spaceParamId,String num);
   List<SpaceParam> listSpaceParam();

}
