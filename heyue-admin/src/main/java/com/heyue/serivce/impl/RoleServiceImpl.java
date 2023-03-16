package com.heyue.serivce.impl;

import com.heyue.mapper.RoleMapper;
import com.heyue.model.Role;
import com.heyue.serivce.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public int addRole(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public int deleteRole(Long id) {
        return roleMapper.deleteByPrimaryKey(id);
    }
}
