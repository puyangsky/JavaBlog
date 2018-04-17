package com.puyangsky.blog.controller;

import com.alibaba.fastjson.JSON;
import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/4/18 上午12:13
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

    @Resource
    private ArticleService articleService;

    @GetMapping("/article/{title}")
    public String getArticle(@PathVariable String title) {
        List<Article> articles = articleService.getArticlesByTitle(title);
        return JSON.toJSONString(articles);
    }
}
