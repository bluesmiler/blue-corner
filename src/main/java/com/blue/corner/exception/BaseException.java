package com.blue.corner.exception;

public class BaseException extends RuntimeException {

    private final Integer code;
    private final String massage;

    public BaseException(Integer code, String massage) {
        this.code = code;
        this.massage = massage;
    }

    public Integer getCode() {
        return code;
    }

    public String getMassage() {
        return massage;
    }
}
