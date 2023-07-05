package com.blue.corner.service.impl;

import com.blue.corner.mapper.UserMapper;
import com.blue.corner.model.User;
import com.blue.corner.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.getUserByUP(user.getUsername(), user.getPassword());
    }
}
