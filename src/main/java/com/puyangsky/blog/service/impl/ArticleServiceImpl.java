package com.puyangsky.blog.service.impl;

import com.puyangsky.blog.dao.ArticleDao;
import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
}
