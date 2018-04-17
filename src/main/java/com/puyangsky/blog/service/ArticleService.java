package com.puyangsky.blog.service;

import com.puyangsky.blog.model.Article;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午4:49
 */
@Service
public interface ArticleService {
    List<Article> getArticlesByTitle(String title);
    boolean insertArticle(Article article);
}
