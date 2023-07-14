package com.blue.corner.exception;

import com.blue.corner.constant.CodeEnum;

public class SqlException extends RuntimeException {

    private final Integer code;
    private final String massage;

    public SqlException(String massage) {
        this.massage = massage;
        this.code = CodeEnum.FAIL.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public String getMassage() {
        return massage;
    }
}
