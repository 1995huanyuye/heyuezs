package com.heyue.mapper;

import com.heyue.model.MaterialCategory;
import com.heyue.model.MaterialCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialCategoryMapper {
    long countByExample(MaterialCategoryExample example);

    int deleteByExample(MaterialCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MaterialCategory row);

    int insertSelective(MaterialCategory row);

    List<MaterialCategory> selectByExample(MaterialCategoryExample example);

    MaterialCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") MaterialCategory row, @Param("example") MaterialCategoryExample example);

    int updateByExample(@Param("row") MaterialCategory row, @Param("example") MaterialCategoryExample example);

    int updateByPrimaryKeySelective(MaterialCategory row);

    int updateByPrimaryKey(MaterialCategory row);
}