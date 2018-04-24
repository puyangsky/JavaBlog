package com.puyangsky.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午12:02
 */

@Controller
public class BlogController {

    @RequestMapping("/test")
    public String demo() {
        return "Welcome to Puyangsky's Blog";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String index() {
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
