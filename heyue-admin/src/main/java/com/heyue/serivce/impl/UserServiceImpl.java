package com.heyue.serivce.impl;

import com.heyue.mapper.UserMapper;
import com.heyue.model.User;
import com.heyue.model.UserExample;
import com.heyue.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> listAll() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return  userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
