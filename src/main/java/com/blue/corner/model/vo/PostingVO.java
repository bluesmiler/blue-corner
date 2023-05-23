package com.blue.corner.model.vo;

import lombok.Data;
import java.util.List;

@Data
public class PostingVO {
    private Integer id;
    private String videoBelong;
    private List<CommentVO> commentList;
}
