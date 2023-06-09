package com.heyue.mapper;

import com.heyue.model.DecorationProject;
import com.heyue.model.DecorationProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DecorationProjectMapper {
    long countByExample(DecorationProjectExample example);

    int deleteByExample(DecorationProjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DecorationProject row);

    int insertSelective(DecorationProject row);

    List<DecorationProject> selectByExample(DecorationProjectExample example);

    DecorationProject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") DecorationProject row, @Param("example") DecorationProjectExample example);

    int updateByExample(@Param("row") DecorationProject row, @Param("example") DecorationProjectExample example);

    int updateByPrimaryKeySelective(DecorationProject row);

    int updateByPrimaryKey(DecorationProject row);
}