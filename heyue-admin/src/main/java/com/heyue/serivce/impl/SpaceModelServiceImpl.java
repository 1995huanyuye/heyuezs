package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dto.SpaceItemAddParam;
import com.heyue.dto.SpaceItemConfigParam;
import com.heyue.dto.SpaceItemParam4Add;
import com.heyue.mapper.SpaceItemConfigMapper;
import com.heyue.mapper.SpaceItemMapper;
import com.heyue.mapper.SpaceItemParamMapper;
import com.heyue.model.*;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.SpaceModelCacheService;
import com.heyue.serivce.SpaceModelService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceModelServiceImpl implements SpaceModelService {
    @Autowired
    private SpaceItemMapper spaceItemMapper;
    @Autowired
    private SpaceItemParamMapper spaceItemParamMapper;
    @Autowired
    private SpaceItemConfigMapper spaceItemConfigMapper;
    @Override
    public List<SpaceItem> listAll(Long category_id) {
        List<SpaceItem> all = getCacheService().getAll(category_id);
        if(CollUtil.isNotEmpty(all)){
            return all;
        }
        SpaceItemExample spaceItemExample = new SpaceItemExample();
        spaceItemExample.createCriteria().andCategoryIdEqualTo(category_id);
        List<SpaceItem> spaceItemList = spaceItemMapper.selectByExample(spaceItemExample);
        if(CollUtil.isNotEmpty(spaceItemList)){
            getCacheService().setAll(spaceItemList,category_id);
        }
        return spaceItemList;
    }

    @Override
    public SpaceAggVO getItem(Long item_id) {
        SpaceAggVO spaceItemData = getCacheService().getSpaceItemData(item_id);
        if(spaceItemData!=null){
            return spaceItemData;
        }
        //组装聚合对象
        SpaceAggVO spaceAggVO = new SpaceAggVO();
        SpaceItem spaceItem = spaceItemMapper.selectByPrimaryKey(item_id);
        spaceAggVO.setItem(spaceItem);
        //参数列表
        SpaceItemParamExample spaceItemParamExample = new SpaceItemParamExample();
        spaceItemParamExample.createCriteria().andSpaceItemIdEqualTo(item_id);
        List<SpaceItemParam> spaceItemParams = spaceItemParamMapper.selectByExample(spaceItemParamExample);
        if(CollUtil.isNotEmpty(spaceItemParams)){
            spaceAggVO.setItemParams(spaceItemParams);
        }
        //装修项目配置列表
        SpaceItemConfigExample spaceItemConfigExample = new SpaceItemConfigExample();
        spaceItemConfigExample.createCriteria().andSpaceItemIdEqualTo(item_id);
        List<SpaceItemConfig> spaceItemConfigs = spaceItemConfigMapper.selectByExample(spaceItemConfigExample);
        if(CollUtil.isNotEmpty(spaceItemConfigs)){
            spaceAggVO.setItemConfigs(spaceItemConfigs);
        }
        getCacheService().setSpaceItem(spaceAggVO);
        return spaceAggVO;
    }

    @Override
    public Long addSpaceItem(SpaceItemAddParam param,Long category_id) {
        SpaceItem spaceItem = new SpaceItem();
        BeanUtils.copyProperties(param,spaceItem);
        Long id = PKeyGenerator.generator();
        spaceItem.setId(id);
        spaceItem.setCategoryId(category_id);
        spaceItemMapper.insert(spaceItem);
        getCacheService().delAll(category_id);
        return id;
    }

    @Override
    public int addSpaceItemParam(SpaceItemParam4Add o, Long item_id) {
        SpaceItemParam spaceItemParam = new SpaceItemParam();
        BeanUtils.copyProperties(o,spaceItemParam);
        spaceItemParam.setId(PKeyGenerator.generator());
        spaceItemParam.setSpaceItemId(item_id);
        int count = spaceItemParamMapper.insert(spaceItemParam);
        getCacheService().delSpaceItem(item_id);
        return count;
    }

    @Override
    public int delSpaceItemParam(SpaceItemParam o) {
        getCacheService().delSpaceItem(o.getSpaceItemId());
        return  spaceItemParamMapper.deleteByPrimaryKey(o.getId());
    }

    @Override
    public int addSpaceItemConfig(SpaceItemConfigParam o, Long item_id) {
        SpaceItemConfig spaceItemConfig = new SpaceItemConfig();
        BeanUtils.copyProperties(o,spaceItemConfig);
        spaceItemConfig.setId(PKeyGenerator.generator());
        spaceItemConfig.setSpaceItemId(item_id);
        int count = spaceItemConfigMapper.insert(spaceItemConfig);
        getCacheService().delSpaceItem(item_id);
        return count;
    }

    @Override
    public int delSpaceItemConfig(SpaceItemConfig o) {
        getCacheService().delSpaceItem(o.getSpaceItemId());
        return spaceItemConfigMapper.deleteByPrimaryKey(o.getId());
    }

    @Override
    public int updateSpaceItem(SpaceItem item) {
        Long categoryId = item.getCategoryId();
        int count = spaceItemMapper.updateByPrimaryKeySelective(item);
        getCacheService().delAll(categoryId);
        return count;
    }

    @Override
    public int deleteSpaceItem(Long id,Long category_id) {
        spaceItemMapper.deleteByPrimaryKey(id);
        //删掉参数列表
        SpaceItemParamExample spaceItemParamExample = new SpaceItemParamExample();
        spaceItemParamExample.createCriteria().andSpaceItemIdEqualTo(id);
        spaceItemParamMapper.deleteByExample(spaceItemParamExample);
        //删掉装修项目配置列表
        SpaceItemConfigExample spaceItemConfigExample = new SpaceItemConfigExample();
        spaceItemConfigExample.createCriteria().andSpaceItemIdEqualTo(id);
        spaceItemConfigMapper.deleteByExample(spaceItemConfigExample);
        getCacheService().delSpaceItem(id);
        getCacheService().delAll(category_id);
        return 1;
    }

    @Override
    public SpaceAggVO loadSpaceDataById(Long id) {
        return getItem(id);
    }

    @Override
    public SpaceModelCacheService getCacheService() {
        return SpringUtil.getBean(SpaceModelCacheService.class);
    }
}
