package com.ysh.capstoneTest1.usr.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrController {

    //외부 서버와 통신하기 위해 필요



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
