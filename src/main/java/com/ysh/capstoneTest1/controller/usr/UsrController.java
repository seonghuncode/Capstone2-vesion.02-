package com.ysh.capstoneTest1.controller.usr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
