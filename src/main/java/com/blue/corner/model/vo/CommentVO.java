package com.blue.corner.model.vo;

import lombok.Data;

import java.util.Date;

@Data
public class CommentVO {
    private Integer id;
    private Integer postingBelong;
    private String userBelong;
    private String content;
    private Date createTime;
    private Integer likeNumber;
    private Integer dislikeNumber;
    private Boolean isTop;
}
