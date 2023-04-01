package com.heyue.mapper;

import com.heyue.model.SpaceParam;
import com.heyue.model.SpaceParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceParamMapper {
    long countByExample(SpaceParamExample example);

    int deleteByExample(SpaceParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpaceParam row);

    int insertSelective(SpaceParam row);

    List<SpaceParam> selectByExample(SpaceParamExample example);

    SpaceParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SpaceParam row, @Param("example") SpaceParamExample example);

    int updateByExample(@Param("row") SpaceParam row, @Param("example") SpaceParamExample example);

    int updateByPrimaryKeySelective(SpaceParam row);

    int updateByPrimaryKey(SpaceParam row);
}