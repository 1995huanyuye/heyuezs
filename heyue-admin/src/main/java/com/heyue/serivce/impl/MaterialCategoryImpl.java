package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dto.MaterialCategoryParam;
import com.heyue.dto.MaterialCategoryUpdateParam;
import com.heyue.mapper.MaterialCategoryMapper;
import com.heyue.mapper.MaterialDetailMapper;
import com.heyue.model.MaterialCategory;
import com.heyue.model.MaterialCategoryExample;
import com.heyue.model.MaterialDetail;
import com.heyue.model.MaterialDetailExample;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.MaterialCategoryCacheService;
import com.heyue.serivce.MaterialCategoryService;
import com.heyue.util.PKeyGenerator;
import com.heyue.util.ProduceNumUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialCategoryImpl implements MaterialCategoryService {

    @Autowired
    private MaterialCategoryMapper mapper;
    @Autowired
    private MaterialDetailMapper detailMapper;
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
        //生成编码
        MaterialCategory category = new MaterialCategory();
        BeanUtils.copyProperties(param,category);
        category.setId(PKeyGenerator.generator());
        category.setMaterialCategoryCode(ProduceNumUtil.getCode("M"));
        //插入数据后删掉整个目录缓存
        getCacheService().delAll();
        return mapper.insert(category);
    }

    @Override
    public int updateMaterialCategory(MaterialCategoryUpdateParam category) {
        getCacheService().delMaterialCategory(category.getId());
        getCacheService().delAll();
        MaterialCategory vo = mapper.selectByPrimaryKey(category.getId());
        vo.setMaterialCategoryName(category.getMaterialCategoryName());
        int count = mapper.updateByPrimaryKey(vo);
        getCacheService().setMaterialCategory(vo);
        return count;
    }

    @Override
    public int deleteMaterialCategory(Long id) {
        MaterialDetailExample materialDetailExample = new MaterialDetailExample();
        materialDetailExample.createCriteria().andCategoryIdEqualTo(id);
        List<MaterialDetail> materialDetailList = detailMapper.selectByExample(materialDetailExample);
        if(materialDetailList.size()!=0){
            return -1;
        }
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
