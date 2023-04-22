package com.heyue.dao;

import com.heyue.model.Role;
import com.heyue.model.UserResource;
import com.heyue.model.UserRoleRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 后台用户与角色关系管理自定义Dao
 * user_role_relation
 */
public interface UserRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UserRoleRelation> userRoleRelations);

    /**
     * 获取用于所有角色
     */
    List<Role> getRoleList(@Param("user_id") Long user_id);

    /**
     * 用户编码获取角色
     */
    List<Role> getRoleListByCode(@Param("userCode") String userCode);

    /**
     * 获取用户所有可访问资源
     */
    List<UserResource> getResourceList(@Param("user_id") Long user_id);

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getUserIdList(@Param("resourceId") Long resourceId);

}
