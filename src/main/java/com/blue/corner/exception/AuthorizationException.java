package com.blue.corner.exception;

import com.blue.corner.constant.CodeEnum;

public class AuthorizationException extends RuntimeException {

    private final Integer code;
    private final String massage;

    public AuthorizationException(String massage) {
        this.massage = massage;
        this.code = CodeEnum.NO_AUTHORIZATION.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public String getMassage() {
        return massage;
    }
}
