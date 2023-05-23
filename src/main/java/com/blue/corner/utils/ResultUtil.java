package com.blue.corner.utils;

import com.blue.corner.common.Result;
import com.blue.corner.constant.CodeEnum;

public class ResultUtil {
    public static Result success() {
        Result result = new Result();
        result.setIsSuccess(true);
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setTimestamp(TimeUtil.getTimestamp());
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setIsSuccess(true);
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setTimestamp(TimeUtil.getTimestamp());
        result.setData(data);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setIsSuccess(false);
        result.setCode(CodeEnum.FAIL.getCode());
        result.setTimestamp(TimeUtil.getTimestamp());
        return result;
    }

    public static Result fail(String message) {
        Result result = new Result();
        result.setIsSuccess(false);
        result.setCode(CodeEnum.FAIL.getCode());
        result.setTimestamp(TimeUtil.getTimestamp());
        result.setErrorMsg(message);
        return result;
    }
}
