package com.blue.corner.controller;

import com.blue.corner.model.Article;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @PostMapping("/upload")
    public String upload(@RequestBody Article article) {

        return article.toString();
    }
}
