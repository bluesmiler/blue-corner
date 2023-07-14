package com.blue.corner.util;

import com.blue.corner.exception.AuthenticationException;
import com.blue.corner.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenManager {

    private static final Map<String, User> livingUsers = new HashMap<>();
    private static final String token = "Authentication";

    public static String saveUser(User user) {
//        isHaveUser(user);
        String uuid = UUID.randomUUID().toString().replace("-", "");
        livingUsers.put(uuid, user);
        return uuid;
    }

    public static User getUser(HttpServletRequest request) {
        String header = request.getHeader(token);
        if (header == null) {
            throw new AuthenticationException("Please login first!");
        }
        User user = livingUsers.get(header);
        if (user == null) {
            throw new AuthenticationException("Authentication has expired, try again after login!");
        }
        return user;
    }

    public static void isHaveUser(User user) {
        for (String key : livingUsers.keySet()) {
            User u = livingUsers.get(key);
            if (user.equals(u)) {
                throw new AuthenticationException("Account is already living!");
            }
        }
    }

    public static String deleteUser(HttpServletRequest request) {
        User user = getUser(request);
        livingUsers.remove(request.getHeader(token));
        return user.getNickname();
    }
}
