package com.heyue.mapper;

import com.heyue.model.SpaceItem;
import com.heyue.model.SpaceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceItemMapper {
    long countByExample(SpaceItemExample example);

    int deleteByExample(SpaceItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpaceItem row);

    int insertSelective(SpaceItem row);

    List<SpaceItem> selectByExample(SpaceItemExample example);

    SpaceItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SpaceItem row, @Param("example") SpaceItemExample example);

    int updateByExample(@Param("row") SpaceItem row, @Param("example") SpaceItemExample example);

    int updateByPrimaryKeySelective(SpaceItem row);

    int updateByPrimaryKey(SpaceItem row);
}