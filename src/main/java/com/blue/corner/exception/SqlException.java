package com.blue.corner.exception;

import com.blue.corner.constant.CodeEnum;

public class SqlException extends BaseException {

    public SqlException(String massage) {
        super(CodeEnum.FAIL.getCode(), massage);
    }
}
