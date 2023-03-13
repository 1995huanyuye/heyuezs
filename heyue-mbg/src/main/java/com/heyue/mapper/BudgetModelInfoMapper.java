package com.heyue.mapper;

import com.heyue.model.BudgetModelInfo;
import com.heyue.model.BudgetModelInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BudgetModelInfoMapper {
    long countByExample(BudgetModelInfoExample example);

    int deleteByExample(BudgetModelInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BudgetModelInfo row);

    int insertSelective(BudgetModelInfo row);

    List<BudgetModelInfo> selectByExample(BudgetModelInfoExample example);

    BudgetModelInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") BudgetModelInfo row, @Param("example") BudgetModelInfoExample example);

    int updateByExample(@Param("row") BudgetModelInfo row, @Param("example") BudgetModelInfoExample example);

    int updateByPrimaryKeySelective(BudgetModelInfo row);

    int updateByPrimaryKey(BudgetModelInfo row);
}