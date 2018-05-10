package com.puyangsky.blog.dao;

import com.puyangsky.blog.model.Tag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/5/8 下午8:50
 */
@Repository
public interface TagDao {
    int insert(Tag tag);
    int deleteTagByName(String name);
    int updateTagByName(@Param("oldName") String oldName,
                        @Param("newName") String newName);
    List<Tag> selectAllTags();
}
