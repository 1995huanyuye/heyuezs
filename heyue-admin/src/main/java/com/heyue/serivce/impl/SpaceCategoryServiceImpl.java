package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dto.SpaceCategoryParam;
import com.heyue.mapper.SpaceCategoryMapper;
import com.heyue.model.SpaceCategory;
import com.heyue.model.SpaceCategoryExample;
import com.heyue.serivce.SpaceCategoryService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class SpaceCategoryServiceImpl implements SpaceCategoryService {
    @Autowired
    private SpaceCategoryMapper spaceCategoryMapper;
    @Override
    public List<SpaceCategory> listAll() {
        SpaceCategoryExample spaceCategoryExample = new SpaceCategoryExample();
        return spaceCategoryMapper.selectByExample(spaceCategoryExample);
    }

    @Override
    public SpaceCategory queryCategory(Long category_id) {
        return spaceCategoryMapper.selectByPrimaryKey(category_id);
    }

    @Override
    public int addSpaceCategory(SpaceCategoryParam param) {
        SpaceCategory spaceCategory = new SpaceCategory();
        BeanUtils.copyProperties(param,spaceCategory);
        SpaceCategoryExample spaceCategoryExample = new SpaceCategoryExample();
        spaceCategoryExample.createCriteria().andCategoryCodeEqualTo(param.getCategoryCode());
        List<SpaceCategory> spaceCategoryList = spaceCategoryMapper.selectByExample(spaceCategoryExample);
        if(CollUtil.isNotEmpty(spaceCategoryList)){
            return -1;
        }
        spaceCategory.setId(PKeyGenerator.generator());
        spaceCategory.setCreationtime(new Date());
        int count = spaceCategoryMapper.insert(spaceCategory);
        return count;
    }

    @Override
    public int updateSpaceCategory(SpaceCategory category) {
        return spaceCategoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public int deleteSpaceCategory(Long category_id) {
        return spaceCategoryMapper.deleteByPrimaryKey(category_id);
    }
}
