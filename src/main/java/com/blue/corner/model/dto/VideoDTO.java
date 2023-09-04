package com.blue.corner.model.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class VideoDTO {
    private String name;
    private List<String> tags;
    private String path;
    private Integer authorId;
    private MultipartFile video;
}
