package com.heyue.serivce.impl;

import com.heyue.mapper.BudgetModelInfoMapper;
import com.heyue.model.BudgetModelInfo;
import com.heyue.serivce.BudgetModelInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetModelInfoImpl implements BudgetModelInfoService {
    @Autowired
    private BudgetModelInfoMapper mapper;
    @Override
    public int addBudgetModelInfo(BudgetModelInfo info) {
        return mapper.insert(info);
    }

    @Override
    public int updateBudgetModelInfo(BudgetModelInfo info) {
        return mapper.updateByPrimaryKey(info);
    }

    @Override
    public int deleteBudgetModelInfo(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
