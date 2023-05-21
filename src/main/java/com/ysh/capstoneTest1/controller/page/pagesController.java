package com.ysh.capstoneTest1.controller.page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pagesController {

    @RequestMapping("/notification")
    public String notification(){
        return "notification";
    }

    @RequestMapping("/notificationModify")
    public String notificationModify(){
        return "notificationModify";
    }

    @RequestMapping("/notificationAdd")
    public String notificationAdd(){
        return "notificationAdd";
    }

    @RequestMapping("/rules")
    public String generic(){
        return "rules";
    }

    @RequestMapping("/organizationalChart")
    public String elements(){
        return "organizationalChart";
    }

    @RequestMapping("/referenceUI")
    public String referenceUI(){
        return "referenceUI";
    }

    @RequestMapping("/moneyHistory")
    public String moneyHistory(){
        return "moneyHistory";
    }


}
