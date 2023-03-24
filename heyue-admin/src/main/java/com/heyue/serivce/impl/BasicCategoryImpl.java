package com.heyue.serivce.impl;

import com.heyue.mapper.BasicCategoryMapper;
import com.heyue.model.BasicCategory;
import com.heyue.model.BasicCategoryExample;
import com.heyue.serivce.BasicCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasicCategoryImpl implements BasicCategoryService {
    @Autowired
    private BasicCategoryMapper mapper;
    @Override
    public List<BasicCategory> listAll() {
        return mapper.selectByExample(new BasicCategoryExample());
    }

    @Override
    public int addBasicCategory(BasicCategory category) {
        return mapper.insert(category);
    }

    @Override
    public int updateBasicCategory(BasicCategory category) {
        return mapper.updateByPrimaryKey(category);
    }

    @Override
    public int deleteBasicCategory(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
