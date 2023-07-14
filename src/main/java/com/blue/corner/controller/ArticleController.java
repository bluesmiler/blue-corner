package com.blue.corner.controller;

import com.blue.corner.common.Result;
import com.blue.corner.model.Article;
import com.blue.corner.model.User;
import com.blue.corner.service.ArticleService;
import com.blue.corner.util.IDGenerator;
import com.blue.corner.util.TokenManager;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @PostMapping("/upload")
    public Result upload(HttpServletRequest request, @RequestBody Article article) {
        User user = TokenManager.getUser(request);
        String articleID = IDGenerator.getArticleID(user);
        article.setId(articleID);
        article.setAuthorId(user.getId());
        articleService.addArticle(article);
        return new Result<>();
    }

    @PostMapping("/doLike")
    public void doLike() {

    }
}
