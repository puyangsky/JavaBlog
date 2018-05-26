package com.puyangsky.blog.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.model.User;
import com.puyangsky.blog.service.ArticleService;
import com.puyangsky.blog.service.ArticleTagRelationshipService;
import com.puyangsky.blog.service.UserService;
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

    @Resource
    private UserService userService;

    @Resource
    private ArticleTagRelationshipService articleTagRelationshipService;

    @GetMapping("/article/{title}")
    public String getArticle(@PathVariable String title) {
        List<Article> articles = articleService.getArticlesByTitle(title);
        return JSON.toJSONString(articles);
    }

    @DeleteMapping("/article/{title}")
    public String deleteArticle(@PathVariable String title) {
        boolean delete = articleService.deleteArticleByTitle(title);
        JSONObject result = new JSONObject();
        result.put("result", delete);
        return result.toJSONString();
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
//        System.out.println("Get params:" + JSON.toJSONString(article)
//                + ", result:" + result.toJSONString());
        return result.toJSONString();
    }

    @GetMapping("/articles")
    public String getArticlesByTagName(@RequestParam(value = "tagName") String tagName) {
        List<Article> articles = articleService.getArticlesByTagName(tagName);
        return JSON.toJSONString(articles);
    }

    @PostMapping(value = "/auth", consumes = "application/json")
    public String authUser(@RequestBody User user) {
        boolean authenticated = userService.authUser(user.getUsername(), user.getPassword());
        JSONObject result = new JSONObject();
        result.put("authenticated", authenticated);
        return result.toJSONString();
    }
}
