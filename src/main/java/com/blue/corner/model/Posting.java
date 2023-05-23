package com.blue.corner.model;

import lombok.Data;
import java.util.List;

@Data
public class Posting {
    private Integer id;
    private String videoBelong;
    private List<Comment> commentList;
}
