package com.blue.corner.mapper;

import com.blue.corner.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserByUP(String username, String password);

    void addUser(User user);
}
