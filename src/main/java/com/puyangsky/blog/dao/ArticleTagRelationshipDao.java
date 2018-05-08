package com.puyangsky.blog.dao;

import com.puyangsky.blog.model.ArticleTagRelationship;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/5/8 下午8:50
 */
@Repository
public interface ArticleTagRelationshipDao {

    int insertArticleTagRelationship(ArticleTagRelationship articleTagRelationship);

    int deleteArticleTagRelationship(int articleId, int tagId);

    List<String> getTagNamesByArticleId(int articleId);

}
