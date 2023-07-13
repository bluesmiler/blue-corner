package com.blue.corner.util;

import com.blue.corner.model.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

@Slf4j
public class TokenUtil {

    private static final Map<String, User> livingUsers = new HashMap<>();
    private static final String token = "Authorization";

    public static String saveUser(User user) {
        if (isHaveUser(user)) {
            return null;
        }
        String uuid = UUID.randomUUID().toString().replace("-", "");
        livingUsers.put(uuid, user);
        return uuid;
    }

    public static User getUser(HttpServletRequest request) {
        return livingUsers.get(request.getHeader(token));
    }

    public static Boolean isHaveUser(User user) {
        for (User u : livingUsers.values()) {
            if (u == user) {
                return true;
            }
        }
        return false;
    }

    public static String deleteUser(HttpServletRequest request) {
        String nickname = null;
        try {
            String header = request.getHeader(token);
            nickname = livingUsers.get(header).getNickname();
            livingUsers.remove(header);
        } catch (Exception e) {
            log.error(e.getMessage());
            return "No user living！";
        }
        return "Goodbye！"+nickname;
    }
}
