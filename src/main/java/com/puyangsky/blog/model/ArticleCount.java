package com.puyangsky.blog.model;

import java.sql.Timestamp;

/**
 * Author:      puyangsky
 * Date:        2018/5/13 下午4:48
 */
public class ArticleCount {
    private long count;
    private String month;

    public long getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public ArticleCount(long count, String month) {
        this.count = count;
        this.month = month;
    }
}
