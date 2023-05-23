package com.blue.corner.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    private Boolean isSuccess;
    private Long code;
    private String errorMsg;
    private Object data;
    private Long timestamp;
}
