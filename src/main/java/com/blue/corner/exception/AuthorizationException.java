package com.blue.corner.exception;

import com.blue.corner.constant.CodeEnum;

public class AuthorizationException extends BaseException {

    public AuthorizationException(String massage) {
        super(CodeEnum.NO_AUTHORIZATION.getCode(), massage);
    }
}
