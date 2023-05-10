package com.heyue.mapper;

import com.heyue.model.BasicDetail;
import com.heyue.model.BasicDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicDetailMapper {
    long countByExample(BasicDetailExample example);

    int deleteByExample(BasicDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasicDetail row);

    int insertSelective(BasicDetail row);

    List<BasicDetail> selectByExample(BasicDetailExample example);

    BasicDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") BasicDetail row, @Param("example") BasicDetailExample example);

    int updateByExample(@Param("row") BasicDetail row, @Param("example") BasicDetailExample example);

    int updateByPrimaryKeySelective(BasicDetail row);

    int updateByPrimaryKey(BasicDetail row);
}