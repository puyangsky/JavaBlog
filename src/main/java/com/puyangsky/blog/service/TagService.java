package com.puyangsky.blog.service;

import com.puyangsky.blog.model.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/5/8 下午11:59
 */

@Service
public interface TagService {
    boolean insertTag(Tag tag);
    boolean deleteTag(String tagName);
    List<Tag> getAllTags();
}
