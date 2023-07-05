package com.blue.corner.mapper;

import com.blue.corner.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id, username, password, nickname from user" +
            " where username=#{username} and password=#{password}")
    User getUserByUP(String username, String password);
}
