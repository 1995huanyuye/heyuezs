package com.heyue.mapper;

import com.heyue.model.SpaceItemParam;
import com.heyue.model.SpaceItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceItemParamMapper {
    long countByExample(SpaceItemParamExample example);

    int deleteByExample(SpaceItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpaceItemParam row);

    int insertSelective(SpaceItemParam row);

    List<SpaceItemParam> selectByExample(SpaceItemParamExample example);

    SpaceItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SpaceItemParam row, @Param("example") SpaceItemParamExample example);

    int updateByExample(@Param("row") SpaceItemParam row, @Param("example") SpaceItemParamExample example);

    int updateByPrimaryKeySelective(SpaceItemParam row);

    int updateByPrimaryKey(SpaceItemParam row);
}