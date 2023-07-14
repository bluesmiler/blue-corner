package com.blue.corner.service.impl;

import com.blue.corner.exception.SqlException;
import com.blue.corner.mapper.ArticleMapper;
import com.blue.corner.model.Article;
import com.blue.corner.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public void addArticle(Article article) {
        try {
            articleMapper.addArticle(article);
        }catch (RuntimeException e){
            throw new SqlException("Do not publish duplicate articles!");
        }
    }
}
