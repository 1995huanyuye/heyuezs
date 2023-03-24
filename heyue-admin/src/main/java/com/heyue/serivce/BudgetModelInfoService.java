package com.heyue.serivce;

import com.heyue.model.BudgetModelInfo;

import java.util.List;

public interface BudgetModelInfoService {
    /**
     * 新增空间模板
     */
    int addBudgetModelInfo(BudgetModelInfo info);
    /**
     * 更新空间模板信息
     */
    int updateBudgetModelInfo(BudgetModelInfo info);
    /**
     * 删除空间模板
     */
    int deleteBudgetModelInfo(Long id);
}
