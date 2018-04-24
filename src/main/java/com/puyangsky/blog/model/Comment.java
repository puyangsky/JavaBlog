package com.puyangsky.blog.model;

import java.sql.Timestamp;

/**
 * Author:      puyangsky
 * Date:        2018/4/19 上午1:36
 */
public class Comment {
    private int id;
    private String commentAuthor;
    private String commentContent;
    private Timestamp commentPublishTime;

    // if commentToId is Null, it means
    private int commentToId;

}
