package com.heyue.serivce;

import com.heyue.model.BasicDetail;
import com.heyue.model.BudgetModel;

import java.util.List;

public interface BudgetModelService {

    /**
     * 获取所有空间模板
     */
    List<BudgetModel> listAll();
    /**
     * 新增空间模板
     */
    int addBudgetModel(BudgetModel model);
    /**
     * 更新空间模板信息
     */
    int updateBudgetModel(BudgetModel model);
    /**
     * 删除空间模板
     */
    int deleteBudgetModel(Long id);
}
