package com.blue.corner.mapper;

import com.blue.corner.model.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    void addArticle(Article article);
}
