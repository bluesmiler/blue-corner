package com.blue.corner.model;

import lombok.Data;

@Data
public class Video {
    private String id;
    private String name;
    private String videoUrl;
    private String coverUrl;
    private String type;
    private Boolean isFree;
    private Integer pointNeed;
    private String authorBelong;
}
