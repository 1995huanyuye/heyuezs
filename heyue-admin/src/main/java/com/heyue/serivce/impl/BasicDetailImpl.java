package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.github.pagehelper.PageHelper;
import com.heyue.dao.BasicDetailDao;
import com.heyue.dao.ItemCtrlDao;
import com.heyue.dto.BasicDetailParam;
import com.heyue.dto.ItemVOParm;
import com.heyue.mapper.BasicCategoryMapper;
import com.heyue.mapper.BasicDetailMapper;
import com.heyue.model.*;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.BasicDetailCacheService;
import com.heyue.serivce.BasicDetailService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicDetailImpl implements BasicDetailService {
    @Autowired
    private BasicDetailMapper basicDetailMapper;

    @Autowired
    private BasicCategoryMapper basicCategoryMapper;

    @Autowired
    private BasicDetailDao basicDetailDao;

    @Autowired
    private ItemCtrlDao itemCtrlDao;


    @Override
    public List<BasicDetail> listAll(Long catedory_id) {
        List<BasicDetail> list = new ArrayList<>(8);
        List<BasicDetail> all = getCacheService().getAll(catedory_id);
        if(CollUtil.isNotEmpty(all)){
            return all;
        }
        BasicCategoryExample basicCategoryExample = new BasicCategoryExample();
        basicCategoryExample.createCriteria().andParentIdEqualTo(catedory_id);
        List<BasicCategory> basicCategoryList = basicCategoryMapper.selectByExample(basicCategoryExample);
        if(CollUtil.isNotEmpty(basicCategoryList)){
            List<Long> ids = new ArrayList<>(8);
            ids.add(catedory_id);
            for (BasicCategory category : basicCategoryList) {
                ids.add(category.getId());
            }
            BasicDetailExample basicDetailExample = new BasicDetailExample();
            basicDetailExample.createCriteria().andCategoryIdIn(ids);
            basicDetailExample.setOrderByClause("id");
            list = basicDetailMapper.selectByExample(basicDetailExample);
            getCacheService().setAll(list,catedory_id);
        }else{
            BasicDetailExample basicDetailExample = new BasicDetailExample();
            basicDetailExample.createCriteria().andCategoryIdEqualTo(catedory_id);
            basicDetailExample.setOrderByClause("id");
            list = basicDetailMapper.selectByExample(basicDetailExample);
            getCacheService().setAll(list,catedory_id);
        }
        return list;
    }

    @Override
    public BasicDetail getItem(Long id) {
        BasicDetail basicDetail = getCacheService().getBasicDetail(id);
        if(basicDetail!=null){
            return basicDetail;
        }
        BasicDetail detail = basicDetailMapper.selectByPrimaryKey(id);
        if (detail!=null){
            getCacheService().setBasicDetail(detail);
        }
        return detail;
    }

    @Override
    public int addBasicDetail(BasicDetailParam param,Long category_id) {
        BasicDetail detail = new BasicDetail();
        BeanUtils.copyProperties(param,detail);
        //项目编码不允许重复
        BasicDetailExample basicDetailExample = new BasicDetailExample();
        basicDetailExample.createCriteria().andDetailCodeEqualTo(param.getDetailCode());
        List<BasicDetail> detailList = basicDetailMapper.selectByExample(basicDetailExample);
        if(CollUtil.isNotEmpty(detailList)){
            return -1;
        }
        detail.setId(PKeyGenerator.generator());
        detail.setCategoryId(category_id);
        //添加基装定额后删除缓存
        getCacheService().delAll(category_id);
        return basicDetailMapper.insert(detail);
    }

    @Override
    public int updateBasicDetail(BasicDetail detail) {
        BasicDetailExample basicDetailExample = new BasicDetailExample();
        basicDetailExample.createCriteria().andDetailCodeEqualTo(detail.getDetailCode());
        List<BasicDetail> detailList = basicDetailMapper.selectByExample(basicDetailExample);
        if(CollUtil.isEmpty(detailList)){
            return -1;
        }
        getCacheService().delAll(detail.getCategoryId());
        int count = basicDetailMapper.updateByPrimaryKey(detail);
        return count;
    }

    @Override
    public int deleteBasicDetail(Long id) {
        BasicDetail detail = loadBasicDetailById(id);
        getCacheService().delBasicDetail(id);
        //当前类别下的缓存删掉
        getCacheService().delAll(detail.getCategoryId());
        //当前类别上级分类的缓存删掉
        BasicCategory category = basicCategoryMapper.selectByPrimaryKey(detail.getCategoryId());
        if(category!=null&&category.getParentId()!=0L){
            getCacheService().delAll(category.getParentId());
        }
        return basicDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public BasicDetail loadBasicDetailById(Long id) {
        return getItem(id);
    }

    @Override
    public BasicDetailCacheService getCacheService() {
        return SpringUtil.getBean(BasicDetailCacheService.class);
    }

    @Override
    public List<ItemVO> listBasicAll() {
        List<ItemVO> itemVOS = itemCtrlDao.listBasicAll();
        return itemVOS;
    }

    @Override
    public void insertBasic(ItemVOParm item) {
        ItemVO itemVO = new ItemVO();
        BeanUtils.copyProperties(item,itemVO);
        itemVO.setId(PKeyGenerator.generator());
        itemCtrlDao.insertBasic(itemVO);
    }

    @Override
    public void updateBasic(List<ItemVO> list) {
        for (ItemVO itemVO : list) {
            itemCtrlDao.updateBasic(itemVO);
        }
    }
}
