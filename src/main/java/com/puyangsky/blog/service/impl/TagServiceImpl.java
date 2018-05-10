package com.puyangsky.blog.service.impl;

import com.puyangsky.blog.dao.TagDao;
import com.puyangsky.blog.model.Tag;
import com.puyangsky.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/5/9 上午12:38
 */

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDao tagDao;

    @Override
    public boolean insertTag(Tag tag) {
        return tagDao.insert(tag) == 1;
    }

    @Override
    public boolean deleteTag(String tagName) {
        return tagDao.deleteTagByName(tagName) == 1;
    }

    @Override
    public List<Tag> getAllTags() {
        return tagDao.selectAllTags();
    }
}
