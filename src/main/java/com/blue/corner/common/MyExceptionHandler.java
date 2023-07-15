package com.blue.corner.common;

import com.blue.corner.exception.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler({AuthenticationException.class, AuthorizationException.class, ParamException.class, SqlException.class})
    public Result handleAuthenticationException(BaseException e) {

        return new Result<>()
                .setCode(e.getCode())
                .setMassage(e.getMassage());
    }
}
