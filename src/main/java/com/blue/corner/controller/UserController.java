package com.blue.corner.controller;

import com.blue.corner.common.Result;
import com.blue.corner.model.User;
import com.blue.corner.service.LoginService;
import com.blue.corner.service.impl.UserLoginService;
import com.blue.corner.utils.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource(type = UserLoginService.class)
    private LoginService loginService;

    @RequestMapping("/login")
    public Result login(User user) {
        if (loginService.login(user.getUsername(), user.getPassword())) {
            return ResultUtil.success();
        } else {
            return ResultUtil.fail();
        }
    }
}
