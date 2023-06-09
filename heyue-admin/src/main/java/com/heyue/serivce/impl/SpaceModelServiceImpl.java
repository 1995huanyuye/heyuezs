package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dao.SpaceParamDao;
import com.heyue.dto.SpaceItemAddParam;
import com.heyue.dto.SpaceItemConfigParam;
import com.heyue.dto.SpaceParam4Add;
import com.heyue.mapper.SpaceItemConfigMapper;
import com.heyue.mapper.SpaceItemMapper;
import com.heyue.mapper.SpaceItemParamMapper;
import com.heyue.mapper.SpaceParamMapper;
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
    @Autowired
    private SpaceParamDao spaceParamDao;
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
    public int addSpaceParam(SpaceParam4Add o) {
        SpaceParam param = new SpaceParam();
        BeanUtils.copyProperties(o,param);
        param.setId(PKeyGenerator.generator());
        spaceParamDao.addSpaceParam(param);
        return 0;
    }

    @Override
    public int delSpaceParam(Long spaceParamId) {
        spaceParamDao.delSpaceParam(spaceParamId);
        return 0;
    }

    @Override
    public void updateSpaceParam(Long spaceParamId, String num) {
        spaceParamDao.updateSpaceParam(spaceParamId,num);
    }

    @Override
    public List<SpaceParam> listSpaceParam() {
        return  spaceParamDao.listSpaceParam();
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
