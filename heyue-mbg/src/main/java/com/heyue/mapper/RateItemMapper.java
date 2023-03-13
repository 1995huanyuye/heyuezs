package com.heyue.mapper;

import com.heyue.model.RateItem;
import com.heyue.model.RateItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RateItemMapper {
    long countByExample(RateItemExample example);

    int deleteByExample(RateItemExample example);

    int insert(RateItem row);

    int insertSelective(RateItem row);

    List<RateItem> selectByExample(RateItemExample example);

    int updateByExampleSelective(@Param("row") RateItem row, @Param("example") RateItemExample example);

    int updateByExample(@Param("row") RateItem row, @Param("example") RateItemExample example);
}