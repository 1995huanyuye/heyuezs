package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dao.DecorationProjectDao;
import com.heyue.dao.SpaceParamDao;
import com.heyue.dto.DecorationProjectParam;
import com.heyue.dto.SpaceItemConfigParam;
import com.heyue.dto.SpaceParam4Add;
import com.heyue.dto.SpaceTemplateAgg;
import com.heyue.mapper.SpaceItemConfigMapper;
import com.heyue.mapper.SpaceItemMapper;
import com.heyue.mapper.SpaceItemParamMapper;
import com.heyue.mapper.SpaceSelectInfoMapper;
import com.heyue.model.*;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.SpaceModelCacheService;
import com.heyue.serivce.SpaceModelService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private DecorationProjectDao decorationProjectDao;
    @Autowired
    private SpaceSelectInfoMapper spaceSelectInfoMapper;

    @Override
    public List<SpaceItem> listAll(Long category_id) {
        SpaceItemExample spaceItemExample = new SpaceItemExample();
        spaceItemExample.createCriteria().andCategoryIdEqualTo(category_id);
        List<SpaceItem> spaceItemList = spaceItemMapper.selectByExample(spaceItemExample);
        return spaceItemList;
    }

    @Override
    public SpaceTemplateAgg getItem(Long item_id) {
        SpaceTemplateAgg spaceItemData = getCacheService().getSpaceItemData(item_id);
        if(spaceItemData!=null){
            return spaceItemData;
        }
        //组装聚合对象
        SpaceTemplateAgg spaceAggVO = new SpaceTemplateAgg();
        SpaceItem spaceItem = spaceItemMapper.selectByPrimaryKey(item_id);
        spaceAggVO.setId(spaceItem.getId());
        spaceAggVO.setNote(spaceItem.getNote());
        spaceAggVO.setSpaceType(spaceItem.getSpaceType());
        spaceAggVO.setSpaceItemName(spaceItem.getSpaceItemName());
        //参数列表
        SpaceItemParamExample spaceItemParamExample = new SpaceItemParamExample();
        spaceItemParamExample.createCriteria().andSpaceItemIdEqualTo(item_id);
        List<SpaceItemParam> spaceItemParams = spaceItemParamMapper.selectByExample(spaceItemParamExample);
        if(CollUtil.isNotEmpty(spaceItemParams)){
            spaceAggVO.setParamList(spaceItemParams);
        }
        //装修项目配置列表
        SpaceItemConfigExample spaceItemConfigExample = new SpaceItemConfigExample();
        spaceItemConfigExample.createCriteria().andSpaceItemIdEqualTo(item_id);
        List<SpaceItemConfig> spaceItemConfigs = spaceItemConfigMapper.selectByExample(spaceItemConfigExample);
        if(CollUtil.isNotEmpty(spaceItemConfigs)){
            spaceAggVO.setItemConfigList(spaceItemConfigs);
        }
        getCacheService().setSpaceItem(spaceAggVO);
        return spaceAggVO;
    }

    @Override
    public Long addSpaceItem(SpaceTemplateAgg agg, Long category_id) {
        //空间模板
        Long spaceItemId = PKeyGenerator.generator();
        SpaceItem spaceItem = new SpaceItem();
        spaceItem.setId(spaceItemId);
        spaceItem.setCategoryId(category_id);
        spaceItem.setSpaceItemName(agg.getSpaceItemName());
        spaceItem.setSpaceType(agg.getSpaceType());
        spaceItem.setNote(agg.getNote());
        //测量数据
        List<SpaceItemParam> paramList = agg.getParamList();
        for (SpaceItemParam spaceItemParam : paramList) {
            spaceItemParam.setId(PKeyGenerator.generator());
            spaceItemParam.setSpaceItemId(spaceItemId);
        }
        //装修项目
        List<SpaceItemConfig> spaceItemConfigs = agg.getItemConfigList();
        for (SpaceItemConfig spaceItemConfig : spaceItemConfigs) {
            spaceItemConfig.setId(PKeyGenerator.generator());
            spaceItemConfig.setSpaceItemId(spaceItemId);
        }
        spaceItemMapper.insert(spaceItem);
        spaceParamDao.batchAddSpaceItemParam(paramList);
        decorationProjectDao.batchAddSpaceItemConfig(spaceItemConfigs);
        return 0L;
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
    public void updateSpaceParam(SpaceParam param) {
        spaceParamDao.updateSpaceParam(param);
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
    public int updateSpaceItem(SpaceTemplateAgg agg) {
        try {
            Long spaceItemId = agg.getId();
            //更新表头
            SpaceItem spaceItem = new SpaceItem();
            spaceItem.setId(spaceItemId);
            spaceItem.setSpaceItemName(agg.getSpaceItemName());
            spaceItem.setNote(agg.getNote());
            //删除参数和装修配置后
            spaceParamDao.delSpaceParamByItemId(spaceItemId);
            decorationProjectDao.delDecorationParamByItemId(spaceItemId);
            //重新插入
            //测量数据
            List<SpaceItemParam> paramList = agg.getParamList();
            for (SpaceItemParam spaceItemParam : paramList) {
                spaceItemParam.setId(PKeyGenerator.generator());
                spaceItemParam.setSpaceItemId(spaceItemId);
            }
            List<SpaceItemConfig> itemConfigList = agg.getItemConfigList();
            for (SpaceItemConfig spaceItemConfig : itemConfigList) {
                spaceItemConfig.setId(PKeyGenerator.generator());
                spaceItemConfig.setSpaceItemId(spaceItemId);
            }
            spaceParamDao.updateSpaceItem(spaceItem);
            spaceParamDao.batchAddSpaceItemParam(paramList);
            decorationProjectDao.batchAddSpaceItemConfig(itemConfigList);
        }catch (Exception e){
            throw  e;
        }
        getCacheService().delSpaceItem(agg.getId());
        return 0;
    }

    @Override
    public int deleteSpaceItem(Long id) {
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
        return 1;
    }

    @Override
    public SpaceTemplateAgg loadSpaceDataById(Long id) {
        return getItem(id);
    }

    @Override
    public SpaceModelCacheService getCacheService() {
        return SpringUtil.getBean(SpaceModelCacheService.class);
    }

    @Override
    public int addDecorationParam(DecorationProjectParam param) {
        DecorationProject decorationProject = new DecorationProject();
        BeanUtils.copyProperties(param,decorationProject);
        decorationProject.setId(PKeyGenerator.generator());
        decorationProjectDao.addDecorationParam(decorationProject);
        return 0;
    }

    @Override
    public void delDecorationParam(Long id) {
        decorationProjectDao.delDecorationParam(id);
    }

    @Override
    public int updateDecorationParam(DecorationProject vo) {
        return decorationProjectDao.updateDecorationParam(vo);
    }

    @Override
    public List<DecorationProject> listDecorationParam(Integer projectType) {
        return decorationProjectDao.listDecorationParam(projectType);
    }

    @Override
    public void moveIntoConfig(Long id, int type) {
        SpaceSelectInfo spaceSelectInfo = new SpaceSelectInfo();
        spaceSelectInfo.setId(PKeyGenerator.generator());
        spaceSelectInfo.setSelectedId(id);
        spaceSelectInfo.setType(type);
        spaceSelectInfo.setIsselected(1);
        spaceSelectInfoMapper.insertSelective(spaceSelectInfo);
    }

    @Override
    public void removeConfig(Long id) {
        spaceSelectInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<SpaceSelectInfo> selectConfig(Long spaceId) {
        SpaceSelectInfoExample spaceSelectInfoExample = new SpaceSelectInfoExample();
        spaceSelectInfoExample.createCriteria().andSpaceItemIdEqualTo(spaceId);
        List<SpaceSelectInfo> spaceSelectInfos = spaceSelectInfoMapper.selectByExample(spaceSelectInfoExample);
        return spaceSelectInfos;
    }

    @Override
    public List<SpaceItemConfig> querySpaceItemConfig(Long spaceItemId) {
        List<SpaceItemConfig> spaceItemConfigs = decorationProjectDao.querySpaceItemConfig(spaceItemId);
        for (SpaceItemConfig spaceItemConfig : spaceItemConfigs) {
            Long id = spaceItemConfig.getId();
            int count = decorationProjectDao.selectCountBySpaceItemConfigId(id);
            spaceItemConfig.setNum(count);
        }
        return spaceItemConfigs;
    }

    @Override
    public void updateSpaceItemConfig(SpaceItemConfig param) {
        decorationProjectDao.updateSpaceItemConfig(param);
    }


}
