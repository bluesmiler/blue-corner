package com.blue.corner.model;

import lombok.Data;

@Data
public class Like {
    private Integer userId;
    private String articleId;
    private Integer status;
}
