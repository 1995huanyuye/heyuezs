package com.heyue.serivce.impl;

import com.heyue.mapper.RoleMapper;
import com.heyue.model.Role;
import com.heyue.model.UserMenu;
import com.heyue.model.UserResource;
import com.heyue.serivce.RoleService;
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

    @Override
    public int create(Role role) {
        return 0;
    }

    @Override
    public int update(Long id, Role role) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public List<Role> list() {
        return null;
    }

    @Override
    public List<Role> list(String keyword, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<UserMenu> getMenuList(Long administratorId) {
        return null;
    }

    @Override
    public List<UserMenu> listMenu(Long roleId) {
        return null;
    }

    @Override
    public List<UserResource> listResource(Long roleId) {
        return null;
    }

    @Override
    public int allocMenu(Long roleId, List<Long> menuIds) {
        return 0;
    }

    @Override
    public int allocResource(Long roleId, List<Long> resourceIds) {
        return 0;
    }
}
