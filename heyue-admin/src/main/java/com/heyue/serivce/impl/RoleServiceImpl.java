package com.heyue.serivce.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.heyue.dao.RoleDao;
import com.heyue.mapper.RoleMapper;
import com.heyue.mapper.UserRoleMenuRelationMapper;
import com.heyue.mapper.UserRoleResourceRelationMapper;
import com.heyue.model.*;
import com.heyue.serivce.RoleService;
import com.heyue.serivce.UserCacheService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 后台角色管理Service实现类
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserRoleMenuRelationMapper userRoleMenuRelationMapper;
    @Autowired
    private UserRoleResourceRelationMapper userRoleResourceRelationMapper;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserCacheService cacheService;



    @Override
    public int create(Role role) {
        role.setId(PKeyGenerator.generator());
        return roleMapper.insert(role);
    }

    @Override
    public int update(Long id, Role role) {
        role.setId(id);
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public int delete(List<Long> ids) {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andIdIn(ids);
        int count = roleMapper.deleteByExample(roleExample);
        cacheService.delResourceListByRoleIds(ids);
        return count;
    }

    @Override
    public List<Role> list() {
        return roleMapper.selectByExample(new RoleExample());
    }

    @Override
    public List<Role> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        RoleExample roleExample = new RoleExample();
        if(StrUtil.isEmpty(keyword)){
            roleExample.createCriteria().andRoleNameLike("%"+keyword+"%");
        }
        return roleMapper.selectByExample(roleExample);
    }

    @Override
    public List<UserMenu> getMenuList(Long administratorId) {
        return roleDao.getMenuList(administratorId);
    }

    @Override
    public List<UserMenu> listMenu(Long roleId) {
        return roleDao.getMenuListByRoleId(roleId);
    }

    @Override
    public List<UserResource> listResource(Long roleId) {
        return roleDao.getResourceListByRoleId(roleId);
    }

    @Override
    public int allocMenu(Long roleId, List<Long> menuIds) {
        //删除原有关系
        UserRoleMenuRelationExample userRoleMenuRelationExample = new UserRoleMenuRelationExample();
        userRoleMenuRelationExample.createCriteria().andRoleIdEqualTo(roleId);
        userRoleMenuRelationMapper.deleteByExample(userRoleMenuRelationExample);
        //批量插入新关系
        for (Long menuId : menuIds) {
            UserRoleMenuRelation userRoleMenuRelation = new UserRoleMenuRelation();
            userRoleMenuRelation.setId(PKeyGenerator.generator());
            userRoleMenuRelation.setRoleId(roleId);
            userRoleMenuRelation.setMenuId(menuId);
            userRoleMenuRelationMapper.insert(userRoleMenuRelation);
        }
        return menuIds.size();
    }

    @Override
    public int allocResource(Long roleId, List<Long> resourceIds) {
        //删除原有资源
        UserRoleResourceRelationExample userRoleResourceRelationExample = new UserRoleResourceRelationExample();
        userRoleResourceRelationExample.createCriteria().andRoleIdEqualTo(roleId);
        userRoleResourceRelationMapper.deleteByExample(userRoleResourceRelationExample);
        //批量插入新资源
        for (Long resourceId : resourceIds) {
            UserRoleResourceRelation userRoleResourceRelation = new UserRoleResourceRelation();
            userRoleResourceRelation.setId(PKeyGenerator.generator());
            userRoleResourceRelation.setResourceId(resourceId);
            userRoleResourceRelation.setRoleId(roleId);
        }
        cacheService.delResourceListByRole(roleId);
        return 0;
    }
}
