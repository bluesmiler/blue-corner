package com.blue.corner.common;

import com.blue.corner.constant.CodeEnum;
import com.blue.corner.exception.AuthenticationException;
import com.blue.corner.exception.SqlException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(AuthenticationException.class)
    public Result handleAuthenticationException(AuthenticationException e) {

        return new Result<>()
                .setCode(e.getCode())
                .setMassage(e.getMassage());
    }

    @ExceptionHandler(SqlException.class)
    public Result handleSqlException(SqlException e){
        return new Result<>()
                .setCode(e.getCode())
                .setMassage(e.getMassage());
    }
}
