package com.blue.corner.service;

import com.blue.corner.model.Article;
import com.blue.corner.model.User;

public interface UserService {

    User login(User user);

    void register(User user);
}
