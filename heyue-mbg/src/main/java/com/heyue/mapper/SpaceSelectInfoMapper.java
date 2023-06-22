package com.heyue.mapper;

import com.heyue.model.SpaceSelectInfo;
import com.heyue.model.SpaceSelectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceSelectInfoMapper {
    long countByExample(SpaceSelectInfoExample example);

    int deleteByExample(SpaceSelectInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpaceSelectInfo row);

    int insertSelective(SpaceSelectInfo row);

    List<SpaceSelectInfo> selectByExample(SpaceSelectInfoExample example);

    SpaceSelectInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SpaceSelectInfo row, @Param("example") SpaceSelectInfoExample example);

    int updateByExample(@Param("row") SpaceSelectInfo row, @Param("example") SpaceSelectInfoExample example);

    int updateByPrimaryKeySelective(SpaceSelectInfo row);

    int updateByPrimaryKey(SpaceSelectInfo row);
}