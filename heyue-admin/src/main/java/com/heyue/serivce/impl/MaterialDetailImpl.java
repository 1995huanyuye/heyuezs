package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dto.MaterialDetailParam;
import com.heyue.mapper.MaterialCategoryMapper;
import com.heyue.mapper.MaterialDetailMapper;
import com.heyue.model.MaterialCategory;
import com.heyue.model.MaterialCategoryExample;
import com.heyue.model.MaterialDetail;
import com.heyue.model.MaterialDetailExample;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.MaterialDetailCacheService;
import com.heyue.serivce.MaterialDetailService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialDetailImpl implements MaterialDetailService {
    @Autowired
    private MaterialDetailMapper materialDetailMapper;
    @Autowired
    private MaterialCategoryMapper materialCategoryMapper;


    @Override
    public List<MaterialDetail> listAll(Long catedory_id, String isHaveParent) {
        List<MaterialDetail> list = new ArrayList<>(8);
        if("Y".equals(isHaveParent.toUpperCase())){
            List<MaterialDetail> all = getCacheService().getAll(catedory_id);
            if(CollUtil.isNotEmpty(all)){
                return all;
            }
            MaterialDetailExample materialDetailExample = new MaterialDetailExample();
            materialDetailExample.createCriteria().andCategoryIdEqualTo(catedory_id);
            list = materialDetailMapper.selectByExample(materialDetailExample);
            getCacheService().setAll(list,catedory_id);
        }else {
            List<MaterialDetail> all = getCacheService().getAll(catedory_id);
            if(CollUtil.isNotEmpty(all)){
                return all;
            }
            MaterialCategoryExample materialCategoryExample = new MaterialCategoryExample();
            materialCategoryExample.createCriteria().andParentIdEqualTo(catedory_id);
            List<MaterialCategory> basicCategoryList = materialCategoryMapper.selectByExample(materialCategoryExample);
            if(CollUtil.isNotEmpty(basicCategoryList)){
                List<Long> ids = new ArrayList<>(8);
                for (MaterialCategory category : basicCategoryList) {
                    ids.add(category.getId());
                }
                MaterialDetailExample materialDetailExample = new MaterialDetailExample();
                materialDetailExample.createCriteria().andCategoryIdIn(ids);
                list = materialDetailMapper.selectByExample(materialDetailExample);
                getCacheService().setAll(list,catedory_id);
            }
        }
        return list;
    }

    @Override
    public MaterialDetail getItem(Long id) {
        MaterialDetail materialDetail = getCacheService().getMaterialDetail(id);
        if(materialDetail!=null){
            return materialDetail;
        }
        MaterialDetail detail = materialDetailMapper.selectByPrimaryKey(id);
        if (detail!=null){
            getCacheService().setMaterialDetail(detail);
        }
        return detail;
    }

    @Override
    public int addMaterialDetail(MaterialDetailParam param, Long category_id) {
        MaterialDetail detail = new MaterialDetail();
        BeanUtils.copyProperties(param,detail);
        //项目编码不允许重复
        MaterialDetailExample materialDetailExample = new MaterialDetailExample();
        materialDetailExample.createCriteria().andMaterialNumberEqualTo(param.getMaterialNumber());
        List<MaterialDetail> materialDetailList = materialDetailMapper.selectByExample(materialDetailExample);
        if(CollUtil.isNotEmpty(materialDetailList)){
            return -1;
        }
        detail.setId(PKeyGenerator.generator());
        detail.setCategoryId(category_id);
        //添加基装定额后删除缓存
        getCacheService().delAll(category_id);
        return materialDetailMapper.insert(detail);
    }


    @Override
    public int updateMaterialDetail(MaterialDetail detail) {
        MaterialDetailExample materialDetailExample = new MaterialDetailExample();
        materialDetailExample.createCriteria().andMaterialNumberEqualTo(detail.getMaterialNumber());
        List<MaterialDetail> materialDetailList = materialDetailMapper.selectByExample(materialDetailExample);
        if(CollUtil.isEmpty(materialDetailList)){
            return -1;
        }
        getCacheService().delAll(detail.getCategoryId());
        int count = materialDetailMapper.updateByPrimaryKey(detail);
        return count;
    }

    @Override
    public int deleteMaterialDetail(Long id) {
        MaterialDetail detail = loadMaterialDetailById(id);
        getCacheService().delMaterialDetail(id);
        //当前类别下的缓存删掉
        getCacheService().delAll(detail.getCategoryId());
        //当前类别上级分类的缓存删掉
        MaterialCategory category = materialCategoryMapper.selectByPrimaryKey(detail.getCategoryId());
        if(category.getParentId()!=0L){
            getCacheService().getAll(category.getParentId());
        }
        return materialDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public MaterialDetail loadMaterialDetailById(Long id) {
        return getItem(id);
    }

    @Override
    public MaterialDetailCacheService getCacheService() {
        return SpringUtil.getBean(MaterialDetailCacheService.class);
    }
}
