package com.ysh.capstoneTest1.controller.usr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/join")
    public String join(){
        return "join";
    }

    @RequestMapping("/myInfo")
    public String myInfo(){
        return "myInfo";
    }

}
