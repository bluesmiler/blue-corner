package com.blue.corner.util;

import com.blue.corner.model.User;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenUtil {

    private static final Map<String, User> livingUsers = new HashMap<>();
    private static final String token = "Authorization";

    public static String saveUser(User user) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        livingUsers.put(uuid, user);
        return uuid;
    }

    public static String deleteUser(HttpServletRequest request) {
        String header = request.getHeader(token);
        String nickname = livingUsers.get(header).getNickname();
        livingUsers.remove(header);
        return nickname;
    }
}
