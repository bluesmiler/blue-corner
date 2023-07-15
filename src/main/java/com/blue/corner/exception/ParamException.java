package com.blue.corner.exception;

import com.blue.corner.constant.CodeEnum;

public class ParamException extends BaseException{

    public ParamException(String massage) {
        super(CodeEnum.FAIL.getCode(), massage);
    }
}
