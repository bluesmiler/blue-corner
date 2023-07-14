package com.blue.corner.common;

import com.blue.corner.constant.CodeEnum;

public class Result<T> {

    private Integer code;
    private String massage;
    private T data;
    private Long timestamp;

    public Result() {
        this.code = CodeEnum.OK.getCode();
        this.massage = "ok";
        this.timestamp = System.currentTimeMillis();
    }

    public Integer getCode() {
        return code;
    }

    public String getMassage() {
        return massage;
    }

    public T getData() {
        return data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Result<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Result<T> setMassage(String massage) {
        this.massage = massage;
        return this;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Result<T> setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
