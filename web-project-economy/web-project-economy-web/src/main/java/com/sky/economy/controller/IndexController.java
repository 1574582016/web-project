package com.sky.economy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ThinkPad on 2018/10/6.
 */
@Controller
public class IndexController {

//    @RequestMapping("/")
//    public String login(){
//        return "/login";
//    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
