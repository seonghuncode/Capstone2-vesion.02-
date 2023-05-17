package com.ysh.capstoneTest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test1(){
        return "test1";
    }


    @RequestMapping("/")
    public String index(){
        return "notification";
    }

    @RequestMapping("/rules")
    public String generic(){
        return "rules";
    }

    @RequestMapping("/organizationalChart")
    public String elements(){
        return "organizationalChart";
    }



}
