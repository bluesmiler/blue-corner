package com.blue.corner.model;

import lombok.Data;

@Data
public class Article {
    private String id;
    private String title;
    private String content;
    private String authorId;
}
