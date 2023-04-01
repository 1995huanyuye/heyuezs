package com.heyue.mapper;

import com.heyue.model.SpaceItemConfig;
import com.heyue.model.SpaceItemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceItemConfigMapper {
    long countByExample(SpaceItemConfigExample example);

    int deleteByExample(SpaceItemConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpaceItemConfig row);

    int insertSelective(SpaceItemConfig row);

    List<SpaceItemConfig> selectByExample(SpaceItemConfigExample example);

    SpaceItemConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SpaceItemConfig row, @Param("example") SpaceItemConfigExample example);

    int updateByExample(@Param("row") SpaceItemConfig row, @Param("example") SpaceItemConfigExample example);

    int updateByPrimaryKeySelective(SpaceItemConfig row);

    int updateByPrimaryKey(SpaceItemConfig row);
}