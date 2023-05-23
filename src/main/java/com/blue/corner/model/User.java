package com.blue.corner.model;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String username;
    private String password;
    private String nickname;
    private Boolean isAuthor;
    private List<Video> videoList;
    private List<User> fansList;
    private List<User> attentionList;
}
