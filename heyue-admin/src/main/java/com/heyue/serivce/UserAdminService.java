package com.heyue.serivce;

import com.heyue.dto.UpdateUserPasswordParam;
import com.heyue.dto.UserParam;
import com.heyue.model.Role;
import com.heyue.model.User;
import com.heyue.model.UserResource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台用户管理Service
 */
public interface UserAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    User getUserByUserCode(String usercode);

    /**
     * 注册功能
     */
    User register(UserParam umsAdminParam);

    /**
     * 登录功能
     * @param usercode 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String usercode,String password);

    /**
     * 刷新token的功能
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     */
    User getItem(Long id);

    /**
     * 根据用户名或昵称分页查询用户
     */
    List<User> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用户信息
     */
    int update(Long id, User user);

    /**
     * 删除指定用户
     */
    int delete(Long id);

    /**
     * 修改用户角色关系
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * 获取用户对应角色
     */
    List<Role> getRoleList(Long userId);


    /**
     * 获取指定用户的可访问资源
     */
    List<UserResource> getResourceList(Long adminId);

    /**
     * 修改密码
     */
    int updatePassword(UpdateUserPasswordParam updatePasswordParam);

    /**
     * 获取用户信息
     */
    UserDetails loadUserByUserCode(String usercode);

    /**
     * 获取缓存服务
     */
    UserCacheService getCacheService();


}
