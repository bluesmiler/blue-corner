package com.blue.corner.controller;

import com.blue.corner.model.Article;
import com.blue.corner.model.User;
import com.blue.corner.model.VO.ArticleVO;
import com.blue.corner.service.ArticleService;
import com.blue.corner.service.UserService;
import com.blue.corner.util.IDGenerator;
import com.blue.corner.util.TokenUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @PostMapping("/upload")
    public String upload(HttpServletRequest request, @RequestBody Article article) {
        User user = TokenUtil.getUser(request);
        String articleID = IDGenerator.getArticleID(user);
        article.setId(articleID);
        article.setAuthorId(user.getId());

        articleService.addArticle(article);
        return new ArticleVO(article, user).toString();
    }

    @PostMapping("/doLike")
    public void doLike(){

    }
}
