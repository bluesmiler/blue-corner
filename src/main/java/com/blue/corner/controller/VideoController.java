package com.blue.corner.controller;

import com.blue.corner.model.dto.VideoDTO;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/video")
public class VideoController {

    @PostMapping("/upload")
    public void upload(VideoDTO videoDTO) throws IOException {
        MultipartFile video = videoDTO.getVideo();
        String path = "C:\\Users\\29793\\Workspace\\blue\\blue-corner\\src\\main\\resource\\static\\";
        File file = new File(path+videoDTO.getName());
        video.transferTo(file);
        System.out.println(videoDTO);
    }
}
