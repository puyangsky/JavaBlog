package com.puyangsky.blog.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:      puyangsky
 * Date:        2018/4/18 上午12:13
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Resource
    private ArticleService articleService;

    @GetMapping("/article/{title}")
    public String getArticle(@PathVariable String title) {
        List<Article> articles = articleService.getArticlesByTitle(title);
        return JSON.toJSONString(articles);
    }

    @GetMapping("/article")
    public String getArticles(@RequestParam(value = "page") int page,
                              @RequestParam(value = "pageNum") int pageNum) {
        List<Article> articles = articleService.getArticles(pageNum, page);
        return JSON.toJSONString(articles);
    }

    @PostMapping(value = "/article", consumes = "application/json")
    public String addArticle(@RequestBody Article article) {
        JSONObject result = new JSONObject();
        result.put("result", articleService.insertArticle(article));
        return result.toJSONString();
    }
}
