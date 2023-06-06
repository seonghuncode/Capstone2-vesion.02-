package com.ysh.capstoneTest1.usr.controller;


import com.ysh.capstoneTest1.restTest.Client.RestTemplateService;
import com.ysh.capstoneTest1.usr.service.UserService;
import com.ysh.capstoneTest1.vo.JoinResponse;
import com.ysh.capstoneTest1.vo.LoginResponse;
import com.ysh.capstoneTest1.vo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UsrController {

    //외부 서버와 통신하기 위해 필요
//    private final RestTemplateService restTemplateService;
//
//    public UsrController(RestTemplateService restTemplateService) {
//        this.restTemplateService = restTemplateService;
//    }
    private final UserService userService;

    public UsrController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/doLogin")
    @ResponseBody
    public String doLogin(String loginId, String loginPw) {
//        String loginId = "1761013";
//        String loginPw = "1761013@pcu.ac.kr";

        //로그인 성공시 club_id, user_id, access_token, access_token_end_at에 대한 정보를 갖는다
        //LoginResponse loginResponse = restTemplateService.login(loginId, loginPw);
        LoginResponse loginResponse = userService.login(loginId, loginPw);

        //System.out.println(loginResponse.getMessage());
        
        String message = "";
        if(loginId.trim().length() == 0){
            message = "<script>alert('학번을 입력해 주세요.');location.href='login';</script>";
        }else if(loginPw.trim().length() == 0){
            message = "<script>alert('비밀번호를 입력해 주세요.');location.href='login';</script>";
        }
        else if(loginResponse.getMessage().equals("success")){
            message = "<script>alert('로그인 성공');location.href='notification';</script>";
        }else if(loginResponse.getMessage().equals("fail")){
            message = "<script>alert('아이디 비밀번호가 일치 하지 않습니다.');location.href='login';</script>";
        }


        return message;

    }



    @RequestMapping("/join")
    public String join(){
        return "join";
    }

    @RequestMapping("/doJoin")
    @ResponseBody
    public String doJoin(int clubCode, String name, String email, int departmentCode, int studentId, String phoneNumber, String address, String sex, boolean project, boolean cctv, String birthday){

        System.out.println("=========================");
        System.out.println(clubCode);
        System.out.println(name);
        System.out.println(email);
        System.out.println(departmentCode);
        System.out.println(studentId);
        System.out.println(phoneNumber);
        System.out.println(address);
        System.out.println(sex);
        System.out.println(project);
        System.out.println(cctv);
        System.out.println(birthday);
        System.out.println("=========================");




        //JoinResponse joinResponse = userService.join(clubCode, name, email, departmentCode, studentId, phoneNumber, address, sex,project, cctv);
        String joinResponse = userService.join(birthday, clubCode, name, email, departmentCode, studentId, phoneNumber, address, sex,project, cctv);

        return "join";
    }

    @RequestMapping("/myInfo")
    public String myInfo(){
        return "myInfo";
    }


}
