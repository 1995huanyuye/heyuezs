package com.heyue.mapper;

import com.heyue.model.BasicCategoryDetail;
import com.heyue.model.BasicCategoryDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicCategoryDetailMapper {
    long countByExample(BasicCategoryDetailExample example);

    int deleteByExample(BasicCategoryDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasicCategoryDetail row);

    int insertSelective(BasicCategoryDetail row);

    List<BasicCategoryDetail> selectByExampleWithBLOBs(BasicCategoryDetailExample example);

    List<BasicCategoryDetail> selectByExample(BasicCategoryDetailExample example);

    BasicCategoryDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") BasicCategoryDetail row, @Param("example") BasicCategoryDetailExample example);

    int updateByExampleWithBLOBs(@Param("row") BasicCategoryDetail row, @Param("example") BasicCategoryDetailExample example);

    int updateByExample(@Param("row") BasicCategoryDetail row, @Param("example") BasicCategoryDetailExample example);

    int updateByPrimaryKeySelective(BasicCategoryDetail row);

    int updateByPrimaryKeyWithBLOBs(BasicCategoryDetail row);

    int updateByPrimaryKey(BasicCategoryDetail row);
}