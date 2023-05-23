package com.blue.corner.model;

import lombok.Data;

@Data
public class Relation {
    private Integer id;
    private String primaryUserId;
    private String secondaryUserId;
    /**
     * fans or attention; 0 mean fans, 1 mean attention
     */
    private Integer relationType;
}
