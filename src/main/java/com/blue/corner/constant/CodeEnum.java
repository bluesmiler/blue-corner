package com.blue.corner.constant;

public enum CodeEnum {
    OK(20000),
    FAIL(40000),
    FAIL_TO_AUTHENTICATION(40001),
    NO_AUTHORIZATION(40003),
    ERROR(50000);

    private final Integer code;

    CodeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
