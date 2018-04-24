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
    private Timestamp publishTime;
    private long clickNum;

    public Article() {
    }

    public Article(long id, String title, String content, String author, Timestamp publishTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishTime = publishTime;
    }

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

    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }
}
