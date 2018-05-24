package com.puyangsky.blog.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.model.ArticleCount;
import com.puyangsky.blog.model.ArticleTagRelationship;
import com.puyangsky.blog.model.Tag;
import com.puyangsky.blog.service.ArticleService;
import com.puyangsky.blog.service.ArticleTagRelationshipService;
import com.puyangsky.blog.service.TagService;
import com.puyangsky.blog.service.UserService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午12:02
 */

@Controller
public class BlogController {

    @Resource
    private ArticleService articleService;

    @Resource
    private ArticleTagRelationshipService articleTagRelationshipService;

    @Resource
    private UserService userService;

    @Resource
    private TagService tagService;

    @RequestMapping("/edit")
    public String edit() {
        return "editor";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String index(@RequestParam(value = "page", required = false) Object page,
                        @RequestParam(value = "pageNum", required = false) Object pageNum,
                        Model model) {
        if (pageNum == null) {
            pageNum = 10;
        }
        if (page == null) {
            page = 1;
        }
        int pageInt = Integer.valueOf(page.toString());
        int pageNumInt = Integer.valueOf(pageNum.toString());
        int pages = articleService.getPages(pageNumInt);
        if (pageInt > pages) {
            pageInt = pages;
        }
        List<Article> articles = articleService.getArticles(pageInt, pageNumInt);
        List<Tag> tags = tagService.getAllTags();
        List<ArticleCount> articleCounts = articleService.getArticleCountByMonth();
        model.addAttribute("articles", articles);
        model.addAttribute("tags", tags);
        model.addAttribute("articleCounts", articleCounts);
        List<Integer> pageList = IntStream.rangeClosed(1, pages).boxed().collect(Collectors.toList());
        model.addAttribute("pages", pageList);
        model.addAttribute("curPage", pageInt);
        return "index";
    }

    @RequestMapping("/article/{articleId}")
    public String article(@PathVariable(value = "articleId") int articleId,
                          Model model) {
        Article article = articleService.getArticleById(articleId);
        model.addAttribute("article", article);
        List<Tag> tags = tagService.getAllTags();
        model.addAttribute("tags", tags);
        List<ArticleCount> articleCounts = articleService.getArticleCountByMonth();
        model.addAttribute("articleCounts", articleCounts);
        return "main";
    }

    @RequestMapping("/article")
    public String getArticlesByTag(@RequestParam(value = "tagName", required = false) String tagName,
                                   @RequestParam(value = "month", required = false) String month,
                                   Model model) {
        List<Tag> tags = tagService.getAllTags();
        model.addAttribute("tags", tags);
        if (!StringUtils.isEmpty(tagName)) {
            List<Article> articles = articleService.getArticlesByTagName(tagName);
            model.addAttribute("articles", articles);
        }
        if (!StringUtils.isEmpty(month)) {
            List<Article> articles = articleService.getArticlesByMonth(month);
            model.addAttribute("articles", articles);
        }
        List<ArticleCount> articleCounts = articleService.getArticleCountByMonth();
        model.addAttribute("articleCounts", articleCounts);
        return "index";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
