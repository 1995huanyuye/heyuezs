package com.heyue.serivce.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.heyue.mapper.UserResourceMapper;
import com.heyue.model.UserResource;
import com.heyue.model.UserResourceExample;
import com.heyue.serivce.UserCacheService;
import com.heyue.serivce.UserResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserResourceServiceImpl implements UserResourceService {
    @Autowired
    private UserResourceMapper resourceMapper;
    @Autowired
    private UserCacheService cacheService;

    @Override
    public int create(UserResource userResource) {
        userResource.setCreateTime(new Date());
        return resourceMapper.insert(userResource);
    }

    @Override
    public int update(Long id, UserResource userResource) {
        userResource.setId(id);
        int count = resourceMapper.updateByPrimaryKeySelective(userResource);
        cacheService.delResourceListByResource(id);
        return count;
    }

    @Override
    public UserResource getItem(Long id) {
        return resourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(Long id) {
        int count = resourceMapper.deleteByPrimaryKey(id);
        cacheService.delResourceListByResource(id);
        return count;
    }

    @Override
    public List<UserResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        UserResourceExample userResourceExample = new UserResourceExample();
        UserResourceExample.Criteria criteria = userResourceExample.createCriteria();
        if (categoryId!=null){
            criteria.andCategoryIdEqualTo(categoryId);
        }
        if(StrUtil.isNotEmpty(nameKeyword)){
            criteria.andNameLike("%"+nameKeyword+"%");
        }
        if (StrUtil.isNotEmpty(urlKeyword)){
            criteria.andUrlLike("%"+urlKeyword+"%");
        }
        return resourceMapper.selectByExample(userResourceExample);
    }

    @Override
    public List<UserResource> listAll() {
        return resourceMapper.selectByExample(new UserResourceExample());
    }
}
