package com.blue.corner.controller;

import com.blue.corner.model.User;
import com.blue.corner.service.UserService;
import com.blue.corner.util.TokenUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        User login = userService.login(user);
        return TokenUtil.saveUser(login);
    }

    @RequestMapping("/logout")
    public String Logout(HttpServletRequest request){
        String nickname = TokenUtil.deleteUser(request);
        return "Goodbye!"+nickname;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return null;
    }
}
