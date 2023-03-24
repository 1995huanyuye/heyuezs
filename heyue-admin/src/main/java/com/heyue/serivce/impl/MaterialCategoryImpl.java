package com.heyue.serivce.impl;

import com.heyue.mapper.MaterialCategoryMapper;
import com.heyue.model.MaterialCategory;
import com.heyue.model.MaterialCategoryExample;
import com.heyue.serivce.MaterialCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialCategoryImpl implements MaterialCategoryService {

    @Autowired
    private MaterialCategoryMapper mapper;
    @Override
    public List<MaterialCategory> listAll() {
        return mapper.selectByExample(new MaterialCategoryExample());
    }

    @Override
    public int addMaterialCategory(MaterialCategory category) {
        return mapper.insert(category);
    }

    @Override
    public int updateMaterialCategory(MaterialCategory category) {
        return mapper.updateByPrimaryKey(category);
    }

    @Override
    public int deleteMaterialCategory(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
