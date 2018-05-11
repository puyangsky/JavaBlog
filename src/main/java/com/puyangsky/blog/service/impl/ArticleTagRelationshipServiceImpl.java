package com.puyangsky.blog.service.impl;

import com.puyangsky.blog.dao.ArticleTagRelationshipDao;
import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.model.ArticleTagRelationship;
import com.puyangsky.blog.model.Tag;
import com.puyangsky.blog.service.ArticleTagRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/5/9 上午1:37
 */

@Service
public class ArticleTagRelationshipServiceImpl implements ArticleTagRelationshipService {

    @Autowired
    private ArticleTagRelationshipDao articleTagRelationshipDao;

    @Override
    public boolean insert(ArticleTagRelationship articleTagRelationship) {
        return articleTagRelationshipDao.insertArticleTagRelationship(articleTagRelationship) == 1;
    }

    @Override
    public boolean delete(int articleId, int tagId) {
        return articleTagRelationshipDao.deleteArticleTagRelationship(articleId, tagId) == 1;
    }

    @Override
    public List<Tag> getTagNamesByArticleId(int articleId) {
        return articleTagRelationshipDao.selectTagNamesByArticleId(articleId);
    }
}
