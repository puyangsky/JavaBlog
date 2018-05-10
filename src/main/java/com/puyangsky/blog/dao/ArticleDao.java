package com.puyangsky.blog.dao;

import com.puyangsky.blog.model.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午4:48
 */
@Repository
public interface ArticleDao {
    List<Article> selectByPrimaryKey(int id);

    List<Article> selectByTitle(String title);

    List<Article> selectByPage(@Param("begin") int begin,
                               @Param("num") int num);

    List<Article> selectByTime(int num);

    int deleteByPrimaryKey(int id);

    int insert(Article article);
}
