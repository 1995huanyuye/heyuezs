package com.heyue.mapper;

import com.heyue.model.BudgetModel;
import com.heyue.model.BudgetModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BudgetModelMapper {
    long countByExample(BudgetModelExample example);

    int deleteByExample(BudgetModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BudgetModel row);

    int insertSelective(BudgetModel row);

    List<BudgetModel> selectByExample(BudgetModelExample example);

    BudgetModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") BudgetModel row, @Param("example") BudgetModelExample example);

    int updateByExample(@Param("row") BudgetModel row, @Param("example") BudgetModelExample example);

    int updateByPrimaryKeySelective(BudgetModel row);

    int updateByPrimaryKey(BudgetModel row);
}