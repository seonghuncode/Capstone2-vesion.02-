package com.ysh.capstoneTest1.usr.controller;


import com.ysh.capstoneTest1.restTest.Client.RestTemplateService;
import com.ysh.capstoneTest1.vo.LoginResponse;
import com.ysh.capstoneTest1.vo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrController {

    //외부 서버와 통신하기 위해 필요
    private final RestTemplateService restTemplateService;

    public UsrController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/doLogin")
    @ResponseBody
    public LoginResponse doLogin() {
        String loginId = "1761013";
        String loginPw = "1761013@pcu.ac.kr";
        return restTemplateService.login(loginId, loginPw);
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
