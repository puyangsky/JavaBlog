package com.puyangsky.blog.dao;

import com.puyangsky.blog.model.ArticleTagRelationship;
import com.puyangsky.blog.model.Tag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/5/8 下午8:50
 */
@Repository
public interface ArticleTagRelationshipDao {

    int insertArticleTagRelationship(ArticleTagRelationship articleTagRelationship);

    int deleteArticleTagRelationship(@Param("articleId") int articleId,
                                     @Param("tagId") int tagId);

    List<Tag> selectTagNamesByArticleId(int articleId);

}
