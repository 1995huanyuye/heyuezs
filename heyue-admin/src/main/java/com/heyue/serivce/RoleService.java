package com.heyue.serivce;

import com.heyue.model.Role;
import com.heyue.model.UserMenu;
import com.heyue.model.UserResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台角色管理Service
 */
public interface RoleService {
    /**
     * 添加角色
     */
    int create(Role role);

    /**
     * 修改角色信息
     */
    int update(Long id, Role role);

    /**
     * 批量删除角色
     */
    int delete(List<Long> ids);

    /**
     * 获取所有角色列表
     */
    List<Role> list();

    /**
     * 分页获取角色列表
     */
    List<Role> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 根据管理员ID获取对应菜单
     */
    List<UserMenu> getMenuList(Long administratorId);

    /**
     * 获取角色相关菜单
     */
    List<UserMenu> listMenu(Long roleId);

    /**
     * 获取角色相关资源
     */
    List<UserResource> listResource(Long roleId);

    /**
     * 给角色分配菜单
     */
    @Transactional
    int allocMenu(Long roleId, List<Long> menuIds);

    /**
     * 给角色分配资源
     */
    @Transactional
    int allocResource(Long roleId, List<Long> resourceIds);

}
