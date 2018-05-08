package com.puyangsky.blog.service;

import com.puyangsky.blog.model.ArticleTagRelationship;
import com.puyangsky.blog.model.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/5/9 上午12:43
 */

@Service
public interface ArticleTagRelationshipService {
    boolean insert(ArticleTagRelationship articleTagRelationship);

    boolean delete(int articleId, int tagId);

    List<Tag> getTagNamesByArticleId(int articleId);

}
