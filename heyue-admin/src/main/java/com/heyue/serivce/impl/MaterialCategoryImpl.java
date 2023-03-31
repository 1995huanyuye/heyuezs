package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dto.MaterialCategoryParam;
import com.heyue.mapper.MaterialCategoryMapper;
import com.heyue.model.MaterialCategory;
import com.heyue.model.MaterialCategoryExample;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.MaterialCategoryCacheService;
import com.heyue.serivce.MaterialCategoryService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialCategoryImpl implements MaterialCategoryService {

    @Autowired
    private MaterialCategoryMapper mapper;
    @Override
    public List<MaterialCategory> listAll() {
        //取缓存中的目录
        List<MaterialCategory> all = getCacheService().getAll();
        if(CollUtil.isNotEmpty(all)){
            return all;
        }
        //查库
        List<MaterialCategory> list = mapper.selectByExample(new MaterialCategoryExample());
        if(CollUtil.isNotEmpty(list)){
            getCacheService().setAll(list);
        }
        return list;
    }

    @Override
    public MaterialCategory queryCategory(Long category_id) {
        //查缓存
        MaterialCategory materialCategory = getCacheService().getMaterialCategory(category_id);
        if(materialCategory!=null){
            return materialCategory;
        }
        MaterialCategory category = mapper.selectByPrimaryKey(category_id);
        if(category!=null){
            getCacheService().setMaterialCategory(category);
        }
        return category;
    }

    @Override
    public int addMaterialCategory(MaterialCategoryParam param) {
        //目录编码不允许重复
        MaterialCategoryExample materialCategoryExample = new MaterialCategoryExample();
        materialCategoryExample.createCriteria().andMaterialCategoryCodeEqualTo(param.getMaterialCategoryCode());
        List<MaterialCategory> list = mapper.selectByExample(materialCategoryExample);
        if(CollUtil.isNotEmpty(list)){
            return -1;
        }
        MaterialCategory category = new MaterialCategory();
        BeanUtils.copyProperties(param,category);
        category.setId(PKeyGenerator.generator());
        //插入数据后删掉整个目录缓存
        getCacheService().delAll();
        return mapper.insert(category);
    }

    @Override
    public int updateMaterialCategory(MaterialCategory category) {
        getCacheService().delMaterialCategory(category.getId());
        getCacheService().delAll();
        int count = mapper.updateByPrimaryKey(category);
        getCacheService().setMaterialCategory(category);
        return count;
    }

    @Override
    public int deleteMaterialCategory(Long id) {
        getCacheService().delMaterialCategory(id);
        getCacheService().delAll();
        int count = mapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public MaterialCategory loadCategoryById(Long category_id) {
        return queryCategory(category_id);
    }

    @Override
    public MaterialCategoryCacheService getCacheService() {
        return SpringUtil.getBean(MaterialCategoryCacheService.class);
    }
}
