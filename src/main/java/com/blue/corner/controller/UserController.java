package com.blue.corner.controller;

import com.blue.corner.common.Result;
import com.blue.corner.constant.CodeEnum;
import com.blue.corner.exception.AuthenticationException;
import com.blue.corner.exception.SqlException;
import com.blue.corner.model.User;
import com.blue.corner.service.UserService;
import com.blue.corner.util.TokenManager;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        User login = userService.login(user);
        String token = TokenManager.saveUser(login);
        return new Result<>().setData(token);
    }

    @DeleteMapping("/logout")
    public Result Logout(HttpServletRequest request) {
        String nickname = TokenManager.deleteUser(request);
        return new Result<>().setMassage("Goodbye! " + nickname);
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        userService.register(user);
        TokenManager.saveUser(user);
        return new Result<>().setMassage("Welcome aboard!" + user.getNickname());
    }
}
