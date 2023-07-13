package com.blue.corner.constant;

public enum ResultEnum {
    OK(200,"请求成功"),
    FAIL(400,"请求失败"),
    ERROR(500,"服务器问题");

    private Integer code;
    private String massage;
    private Long timestamp;

    ResultEnum(Integer code, String massage){
        this.code = code;
        this.massage = massage;
        timestamp = System.currentTimeMillis();
    }
}
