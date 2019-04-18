package com.nlb.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @ResponseBody
    @RequestMapping("/hello")
    public String controler1(){
        return "hello Spring Boot";
    }
}

