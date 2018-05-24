package com.puyangsky.blog.service;

import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.model.ArticleCount;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午4:49
 */
@Service
public interface ArticleService {
    List<Article> getArticlesByTitle(String title);
    List<Article> getArticles(int page, int pageNum);
    Article getArticleById(int id);
    boolean insertArticle(Article article);
    List<Article> getLatestArticles(int num);
    List<Article> getArticlesByTagName(String tagName);
    List<Article> getArticlesByMonth(String month);
    List<ArticleCount> getArticleCountByMonth();
    int getPages(int pageNumInt);
    boolean deleteArticleByTitle(String title);
}
