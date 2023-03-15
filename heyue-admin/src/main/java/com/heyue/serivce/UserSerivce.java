package com.heyue.serivce;

import com.heyue.model.User;

import java.util.List;

public interface UserSerivce {
    /**
     * 获取所有用户
     */
    List<User> listAll();

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);
}
