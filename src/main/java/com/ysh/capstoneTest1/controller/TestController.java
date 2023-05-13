package com.ysh.capstoneTest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/")
    public String test1(){
        return "test1";
    }


    @RequestMapping("/index")
    public String index(){
        return "index";
    }



}
