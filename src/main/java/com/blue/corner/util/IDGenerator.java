package com.blue.corner.util;

import com.blue.corner.model.User;
import java.util.Random;

public class IDGenerator {

    private static final String strAll = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private static final String numberAll = "0123456789";

    /**
     * @param author
     * @return
     * @Description 根据author生成article的id
     */
    public static String getArticleID(User author) {
        String prefix = author.getUsername() + "@";
        return prefix + getRandom(numberAll, 8);
    }

    /**
     * @param range
     * @param length
     * @return
     * @Description 生成随即长度字符串
     */
    public static String getRandom(String range, int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(range.length());
            sb.append(range.charAt(number));
        }
        return sb.toString();
    }

}
