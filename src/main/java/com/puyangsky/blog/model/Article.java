package com.puyangsky.blog.model;

import java.sql.Timestamp;

/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午4:48
 */

public class Article {
    private long id;
    private String title;
    private String content;
    private String author;
    private Timestamp publish_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Timestamp publish_time) {
        this.publish_time = publish_time;
    }

    public Article() {
    }

    public Article(long id, String title, String content, String author, Timestamp publish_time) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.publish_time = publish_time;
    }
}
