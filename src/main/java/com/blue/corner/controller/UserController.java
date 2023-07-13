package com.blue.corner.controller;

import com.blue.corner.model.User;
import com.blue.corner.service.UserService;
import com.blue.corner.util.TokenUtil;
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
    public String login(@RequestBody User user) {
        User login = userService.login(user);
        Integer status = login.getStatus();
        switch (status) {
            case 1 -> {
                String s = TokenUtil.saveUser(login);
                if (s != null) {
                    return s;
                }
                return "Hi! " + login.getNickname() + ". Do not login again.";
            }
            case 0 -> {
                return "Account closed.";
            }
            case -1 -> {
                return "The account status is abnormal. Contact the administrator.";
            }
            default -> {
                return null;
            }
        }
    }

    @DeleteMapping("/logout")
    public String Logout(HttpServletRequest request) {
        return TokenUtil.deleteUser(request);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.register(user);
        TokenUtil.saveUser(user);
        return "Welcome aboard！" + user.getNickname();
    }
}
