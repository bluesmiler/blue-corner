package com.blue.corner.model.VO;

import com.blue.corner.model.Article;
import com.blue.corner.model.User;
import lombok.Data;

@Data
public class ArticleVO {
    private String title;
    private String content;
    private String authorAccount;
    private String authorName;
    private Integer likeNumber;

    public ArticleVO(Article article, User author) {
        this.title = article.getTitle();
        this.content = article.getContent();
        this.authorAccount = author.getUsername();
        this.authorName = author.getNickname();
    }
}
