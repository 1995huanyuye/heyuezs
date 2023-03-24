package com.heyue.serivce.impl;

import com.heyue.mapper.BudgetModelMapper;
import com.heyue.model.BudgetModel;
import com.heyue.model.BudgetModelExample;
import com.heyue.serivce.BudgetModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetModelImpl implements BudgetModelService {
    @Autowired
    private BudgetModelMapper mapper;
    @Override
    public List<BudgetModel> listAll() {
        return mapper.selectByExample(new BudgetModelExample());
    }

    @Override
    public int addBudgetModel(BudgetModel model) {
        return mapper.insert(model);
    }

    @Override
    public int updateBudgetModel(BudgetModel model) {
        return mapper.updateByPrimaryKey(model);
    }

    @Override
    public int deleteBudgetModel(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
