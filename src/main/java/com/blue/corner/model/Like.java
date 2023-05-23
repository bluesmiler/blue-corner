package com.blue.corner.model;

import lombok.Data;

@Data
public class Like {
    private Integer id;
    private Integer commentBelong;
    private String userBelong;
    /**
     * like or dislike; 0 mean like, 1 mean dislike;
     */
    private Integer type;
}
