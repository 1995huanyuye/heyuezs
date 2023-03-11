package com.heyue.mapper;

import com.heyue.model.BasicCategory;
import com.heyue.model.BasicCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicCategoryMapper {
    long countByExample(BasicCategoryExample example);

    int deleteByExample(BasicCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasicCategory row);

    int insertSelective(BasicCategory row);

    List<BasicCategory> selectByExample(BasicCategoryExample example);

    BasicCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") BasicCategory row, @Param("example") BasicCategoryExample example);

    int updateByExample(@Param("row") BasicCategory row, @Param("example") BasicCategoryExample example);

    int updateByPrimaryKeySelective(BasicCategory row);

    int updateByPrimaryKey(BasicCategory row);
}