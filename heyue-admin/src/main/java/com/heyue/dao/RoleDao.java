package com.heyue.dao;

import com.heyue.model.UserMenu;
import com.heyue.model.UserResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台角色管理自定义Dao
 */
public interface RoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UserMenu> getMenuList(@Param("userId") Long userId);

    /**
     * 根据角色ID获取菜单
     */
    List<UserMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据角色ID获取资源
     */
    List<UserResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
