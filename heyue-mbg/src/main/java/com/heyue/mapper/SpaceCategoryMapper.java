package com.heyue.mapper;

import com.heyue.model.SpaceCategory;
import com.heyue.model.SpaceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceCategoryMapper {
    long countByExample(SpaceCategoryExample example);

    int deleteByExample(SpaceCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpaceCategory row);

    int insertSelective(SpaceCategory row);

    List<SpaceCategory> selectByExample(SpaceCategoryExample example);

    SpaceCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SpaceCategory row, @Param("example") SpaceCategoryExample example);

    int updateByExample(@Param("row") SpaceCategory row, @Param("example") SpaceCategoryExample example);

    int updateByPrimaryKeySelective(SpaceCategory row);

    int updateByPrimaryKey(SpaceCategory row);
}