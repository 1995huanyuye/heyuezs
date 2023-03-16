package com.heyue.serivce;

import com.heyue.model.Role;

public interface RoleService {

    /**
     * 添加角色
     */
    int addRole(Role role);

    /**
     * 更新角色信息
     */
    int updateRole(Role role);
    /**
     * 删除角色
     */
    int deleteRole(Long id);
}
