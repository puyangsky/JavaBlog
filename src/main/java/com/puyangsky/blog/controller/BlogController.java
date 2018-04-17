package com.puyangsky.blog.controller;

import com.alibaba.fastjson.JSON;
import com.puyangsky.blog.model.Article;
import com.puyangsky.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午12:02
 */

@Controller
public class BlogController {

    @Resource
    private ArticleService articleService;

    @RequestMapping("/demo")
    public String demo() {
        return "Welcome to Puyangsky's Blog";
    }

    @RequestMapping("/test")
    public ModelAndView test(@RequestParam(name = "name")String name) {
       ModelAndView mv = new ModelAndView("views/test");
       mv.addObject("name", name);
       return mv;
    }

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "Fuck");
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model) {
//        model.addAttribute("name", "Fuck");
        return "views/index";
    }

    @RequestMapping("/article/{title}")
    public String getArticle(@PathVariable String title) {
        List<Article> articles = articleService.getArticlesByTitle(title);
        return JSON.toJSONString(articles);
    }
}
