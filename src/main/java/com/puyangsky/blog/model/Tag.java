package com.puyangsky.blog.model;

/**
 * Author:      puyangsky
 * Date:        2018/4/19 上午1:36
 */
public class Tag {
    private int id;
    private String name;
    private int articleNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArticleNum() {
        return articleNum;
    }

    public void setArticleNum(int articleNum) {
        this.articleNum = articleNum;
    }
}
