package com.heyue.mapper;

import com.heyue.model.SpaceInfo;
import com.heyue.model.SpaceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceInfoMapper {
    long countByExample(SpaceInfoExample example);

    int deleteByExample(SpaceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpaceInfo row);

    int insertSelective(SpaceInfo row);

    List<SpaceInfo> selectByExample(SpaceInfoExample example);

    SpaceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SpaceInfo row, @Param("example") SpaceInfoExample example);

    int updateByExample(@Param("row") SpaceInfo row, @Param("example") SpaceInfoExample example);

    int updateByPrimaryKeySelective(SpaceInfo row);

    int updateByPrimaryKey(SpaceInfo row);
}