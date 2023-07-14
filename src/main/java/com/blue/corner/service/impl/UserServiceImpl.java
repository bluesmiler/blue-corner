package com.blue.corner.service.impl;

import com.blue.corner.exception.AuthenticationException;
import com.blue.corner.exception.SqlException;
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
        Integer status;
        User account;
        try {
            account = userMapper.getUserByUP(user.getUsername(), user.getPassword());
            status = account.getStatus();
        } catch (RuntimeException e) {
            throw new SqlException("Account is not exit! You can register one.");
        }
        if (status == 0) {
            throw new AuthenticationException("Account closed.");
        } else if (status == -1) {
            throw new AuthenticationException("The account status is abnormal. Contact the administrator.");
        }
        return account;
    }

    public void register(User user) {
        try {
            userMapper.addUser(user);
        } catch (RuntimeException e) {
            throw new SqlException("Account is already exit!");
        }
    }

}
