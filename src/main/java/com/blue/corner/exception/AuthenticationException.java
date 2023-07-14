package com.blue.corner.exception;

import com.blue.corner.constant.CodeEnum;

public class AuthenticationException extends RuntimeException {

    private final Integer code;
    private final String massage;

    public AuthenticationException(String massage) {
        this.massage = massage;
        this.code = CodeEnum.FAIL_TO_AUTHENTICATION.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public String getMassage() {
        return massage;
    }
}
