package com.heyue.serivce;

import com.heyue.model.User;

import java.util.List;

public interface UserService {
    /**
     * 获取所有用户
     */
    List<User> listAll();

    /**
     * 添加用户
     */
    int addUser(User user);

    /**
     * 更新用户信息
     */
    int updateUser(User user);
    /**
     * 删除用户
     */
    int deleteUser(Long id);
}
