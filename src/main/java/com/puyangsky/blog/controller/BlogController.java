package com.puyangsky.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * Author:      puyangsky
 * Date:        2018/4/15 下午12:02
 */

@Controller
public class BlogController {

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
}
