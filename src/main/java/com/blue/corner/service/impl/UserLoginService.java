package com.blue.corner.service.impl;

import com.blue.corner.mapper.UserMapper;
import com.blue.corner.model.User;
import com.blue.corner.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserLoginService implements LoginService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Boolean login(String username, String password) {
        User result = userMapper.queryUserByUP(username, password);
        return result != null;
    }
}
