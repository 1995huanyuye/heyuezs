package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dto.BasicCategoryParam;
import com.heyue.mapper.BasicCategoryMapper;
import com.heyue.model.BasicCategory;
import com.heyue.model.BasicCategoryExample;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.BasicCategoryCacheService;
import com.heyue.serivce.BasicCategoryService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasicCategoryImpl implements BasicCategoryService {
    @Autowired
    private BasicCategoryMapper mapper;
    @Override
    public List<BasicCategory> listAll() {
        //取缓存中的目录
        List<BasicCategory> all = getCacheService().getAll();
        if(CollUtil.isNotEmpty(all)){
            return all;
        }
        //查库
        List<BasicCategory> list = mapper.selectByExample(new BasicCategoryExample());
        if(CollUtil.isNotEmpty(list)){
            getCacheService().setAll(list);
        }
        return list;
    }

    @Override
    public BasicCategory queryCategory(Long category_id) {
        //查缓存
        BasicCategory basicCategory = getCacheService().getBasicCategory(category_id);
        if(basicCategory!=null){
            return basicCategory;
        }
        BasicCategory category = mapper.selectByPrimaryKey(category_id);
        if(category!=null){
            getCacheService().setBasicCategory(category);
        }
        return category;
    }

    @Override
    public int addBasicCategory(BasicCategoryParam param) {
        //目录编码不允许重复
        BasicCategoryExample basicCategoryExample = new BasicCategoryExample();
        basicCategoryExample.createCriteria().andBasicCategoryCodeEqualTo(param.getBasicCategoryCode());
        List<BasicCategory> list = mapper.selectByExample(basicCategoryExample);
        if(CollUtil.isNotEmpty(list)){
            return -1;
        }
        BasicCategory category = new BasicCategory();
        BeanUtils.copyProperties(param,category);
        category.setId(PKeyGenerator.generator());
        //插入数据后删掉整个目录缓存
        getCacheService().delAll();
        return mapper.insert(category);
    }

    @Override
    public int updateBasicCategory(BasicCategory category) {
        getCacheService().delBasicCategory(category.getId());
        int count = mapper.updateByPrimaryKey(category);
        getCacheService().setBasicCategory(category);
        return count;
    }

    @Override
    public int deleteBasicCategory(Long id) {
        getCacheService().delBasicCategory(id);
        getCacheService().delAll();
        int count = mapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public BasicCategory loadCategoryById(Long category_id) {
        return queryCategory(category_id);
    }

    @Override
    public BasicCategoryCacheService getCacheService() {
        return SpringUtil.getBean(BasicCategoryCacheService.class);
    }
}
