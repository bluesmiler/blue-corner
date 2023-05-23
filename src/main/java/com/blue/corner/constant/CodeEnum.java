package com.blue.corner.constant;

public enum CodeEnum {

    SUCCESS(200L), FAIL(400L),NOT_ALLOW(403L),SYS_ERROR(404L);

    CodeEnum(Long code) {
        this.code = code;
    }

    private final Long code;

    public Long getCode() {
        return code;
    }
}
