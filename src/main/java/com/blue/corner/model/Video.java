package com.blue.corner.model;

import lombok.Data;

import java.util.List;

@Data
public class Video {
    private Integer id;
    private String name;
    private List<String> tags;
    private String path;
    private Integer authorId;
}
