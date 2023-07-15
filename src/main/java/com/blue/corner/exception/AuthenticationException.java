package com.blue.corner.exception;

import com.blue.corner.constant.CodeEnum;

public class AuthenticationException extends BaseException {

    public AuthenticationException(String massage) {
        super(CodeEnum.FAIL_TO_AUTHENTICATION.getCode(), massage);
    }
}
