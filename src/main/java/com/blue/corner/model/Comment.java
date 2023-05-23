package com.blue.corner.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Comment {
    private Integer id;
    private Integer postingBelong;
    private String userBelong;
    private String content;
    private Date createTime;
    private List<Like> likeList;
    private Boolean isTop;
}
