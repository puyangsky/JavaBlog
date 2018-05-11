package com.puyangsky.blog.service.impl;

import com.puyangsky.blog.dao.ArticleDao;
import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午4:49
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> getArticlesByTitle(String title) {
        return articleDao.selectByTitle(title);
    }

    @Override
    public List<Article> getArticles(int page, int pageNum) {
        int begin = (page - 1) * pageNum;
        return articleDao.selectByPage(begin, pageNum);
    }

    @Override
    public Article getArticleById(int id) {
        List<Article> articles = articleDao.selectByPrimaryKey(id);
        if (articles != null && articles.size() > 0) {
            return articles.get(0);
        }
        return null;
    }

    @Override
    public boolean insertArticle(Article article) {
        return articleDao.insert(article) == 1;
    }

    @Override
    public List<Article> getLatestArticles(int num) {
        return null;
    }

    @Override
    public List<Article> getArticlesByTagName(String tagName) {
        return articleDao.selectArticlesByTagName(tagName);
    }
}
