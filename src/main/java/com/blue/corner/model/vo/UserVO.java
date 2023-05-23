package com.blue.corner.model.vo;

import lombok.Data;

@Data
public class UserVO {
    private String nickname;
    private Boolean isAuthor;
    private Integer videoNumber;
    private Integer fansNumber;
    private Integer attentionNumber;
}
