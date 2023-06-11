package com.ysh.capstoneTest1.usr.controller;


import com.ysh.capstoneTest1.restTest.Client.RestTemplateService;
import com.ysh.capstoneTest1.usr.service.UserService;
import com.ysh.capstoneTest1.vo.JoinResponse;
import com.ysh.capstoneTest1.vo.LoginResponse;
import com.ysh.capstoneTest1.vo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
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
    public String login() {
        return "login";
    }

    @GetMapping("/doLogin")
    @ResponseBody
    public String doLogin(String loginId, String loginPw, HttpServletRequest request, Model model) throws Exception {
//        String loginId = "1761013";
//        String loginPw = "1761013@pcu.ac.kr";

        //로그인 성공시 club_id, user_id, access_token, access_token_end_at에 대한 정보를 갖는다
        //LoginResponse loginResponse = restTemplateService.login(loginId, loginPw);
        LoginResponse loginResponse = userService.login(loginId, loginPw, request, model);

        //System.out.println(loginResponse.getMessage());

        String message = "";
        if (loginId.trim().length() == 0) {
            message = "<script>alert('학번을 입력해 주세요.');location.href='login';</script>";
        } else if (loginPw.trim().length() == 0) {
            message = "<script>alert('비밀번호를 입력해 주세요.');location.href='login';</script>";
        } else if (loginResponse.getMessage().equals("success")) {
            message = "<script>alert('로그인 성공');location.href='mainPage';</script>";
        } else if (loginResponse.getMessage().equals("fail")) {
            message = "<script>alert('아이디 비밀번호가 일치 하지 않습니다.');location.href='login';</script>";
        }

        //System.out.println("loginResponse" + loginResponse);

        return message;

    }


    @RequestMapping("/findId")
    public String findId() {
        return "findId";
    }

    @RequestMapping("/doFindId")
    @ResponseBody
    public String doFindId(@RequestParam(value = "clubCode", defaultValue = "0") int clubCode, String name, String email) {

        String message = "";

        if (clubCode == 0) {
            message = "<script>alert('동아리 코드를 입력해 주세요.');location.href='findId';</script>";
            return message;
        } else if (name.trim().length() == 0) {
            message = "<script>alert('이름을 입력해 주세요.');location.href='findId';</script>";
            return message;
        } else if (email.trim().length() == 0) {
            message = "<script>alert('이메일을 입력해 주세요.');location.href='findId';</script>";
            return message;
        }


        LoginResponse result = userService.findId(clubCode, name, email);

        //System.out.println(result);

        int userId = result.getUser_id();
        int studentId = result.getStudent_id();

        if (result.getMessage().equals("success")) {
            //message = "<script>alert('회원의 아이디 : + `userId` +  <br>학번 :  + studentId +   ');location.href='login';</script>";
            message = "<script>alert('회원의 아이디: " + userId + "\\n학번: " + studentId + "');location.href='login';</script>";
        } else if (result.getMessage().equals("fail")) {
            message = "<script>alert('동아리 코드, 이름, 이메일이 일치 하지 않습니다.');location.href='findId';</script>";
        }

        return message;
    }


    @RequestMapping("/findPw")
    public String findPw() {
        return "findPw";
    }


    @RequestMapping("/doFindPw")
    @ResponseBody
    public String doFindPw(@RequestParam(value = "clubCode", defaultValue = "0") int clubCode, String name, String studentId) {

        String message = "";

        if (clubCode == 0) {
            message = "<script>alert('동아리 코드를 입력해 주세요.');location.href='findPw';</script>";
            return message;
        } else if (name.trim().length() == 0) {
            message = "<script>alert('이름을 입력해 주세요.');location.href='findPw';</script>";
            return message;
        } else if (studentId.trim().length() == 0) {
            message = "<script>alert('학번을 입력해 주세요.');location.href='findPw';</script>";
            return message;
        }


        LoginResponse result = userService.findPw(clubCode, name, studentId);

        System.out.println(result);

        int userId = result.getUser_id();
        int studentId2 = result.getStudent_id();
        String password = result.getPassword();

        if (result.getMessage().equals("success")) {
            message = "<script>alert('회원 비밀번호: " + password + "');location.href='login';</script>";
        } else if (result.getMessage().equals("fail")) {
            message = "<script>alert('동아리 코드, 이름, 학번이 일치 하지 않습니다.');location.href='findPw';</script>";
        }

        return message;

    }


    @RequestMapping("/join")
    public String join() {
        return "join";
    }

    @RequestMapping("/doJoin")
    @ResponseBody
    public String doJoin(@RequestParam(value = "clubCode", defaultValue = "0") int clubCode, String name, String email, @RequestParam(value = "departmentCode", defaultValue = "0") int departmentCode, @RequestParam(value = "studentId", defaultValue = "0") int studentId, String phoneNumber, String address, String sex, boolean project, boolean cctv, String birthday) {

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
//        System.out.println("Selected department code: " + departmentCode);

        //입력 값 예외처리-----------------------------------------------------
//        int clubCode int departmentCode, int studentId
        String message = "";

        if (clubCode == 0) {
            message = "<script>alert('동아리 코드를 입력해 주세요.');location.href='join';</script>";
            return message;
        } else if (name.trim().length() == 0) {
            message = "<script>alert('이름을 입력해 주세요.');location.href='join';</script>";
            return message;
        } else if (email.trim().length() == 0) {
            message = "<script>alert('이메일을 입력해 주세요.');location.href='join';</script>";
            return message;
        } else if (departmentCode == 0) {
            message = "<script>alert('힉과 코드를 입력해 주세요.');location.href='join';</script>";
            return message;
        } else if (studentId == 0) {
            message = "<script>alert('학번을 입력해 주세요.');location.href='join';</script>";
            return message;
        } else if (phoneNumber.trim().length() == 0) {
            message = "<script>alert('전화번호를 입력해 주세요.');location.href='join';</script>";
            return message;
        } else if (!phoneNumber.matches("[0-9]+")) {
            message = "<script>alert('전화번호는 숫자만 입력 가능 합니다.');location.href='join';</script>";
            return message;
        } else if (phoneNumber.trim().length() < 11) {
            message = "<script>alert('잘못된 전화번호 형식 입니다.');location.href='join';</script>";
            return message;
        } else if (address.trim().length() == 0) {
            message = "<script>alert('주소를 입력해 주세요.');location.href='join';</script>";
            return message;
        } else if (birthday.trim().length() == 0) {
            message = "<script>alert('날짜를 선택해 주세요.');location.href='join';</script>";
            return message;
        }


        //JoinResponse joinResponse = userService.join(clubCode, name, email, departmentCode, studentId, phoneNumber, address, sex,project, cctv);
        String joinResponse = userService.join(birthday, clubCode, name, email, departmentCode, studentId, phoneNumber, address, sex, project, cctv);

        System.out.println(joinResponse);

        if (joinResponse.equals("success")) {
            message = "<script>alert('회원가입을 완료했습니다.');location.href='login';</script>";
        } else if (joinResponse.equals("fail")) {
            message = "<script>alert('동아리 코드, 학과코드, 학번이 존재하는지 확인해 주세요.');location.href='join';</script>";
        }

        return message;
    }


    //학과 찾기 버튼클릭시 ajax로 통신을 받아서 -> 외부 서버로 부터 받은 값을 가공해서 -> 자바스크립트로 리턴 하는 순서
    //사용자가 회원가입시 동아리 코드를 입력하고 학과 찾기를 클릭했을 경우 학과코드와 학과면을 List로 받아오는 요청
    @RequestMapping(value = "/fineDepartmentCode", produces = "application/json; charset=utf8", method = {RequestMethod.GET})
    @ResponseBody
    public List<Map<String, Object>> findDepartmentCode(@RequestParam int clubCode) {

        List<Map<String, Object>> result = userService.findeDepartmentCode(clubCode);
//      System.out.println(result);


        return result;

    }


    //이메일 중복에 대한 내용을 체크 하는 부분
    @RequestMapping(value = "/checkDuplicationEmail", produces = "application/json; charset=utf8", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> checkDuplicationEmail(@RequestParam(value = "clubCode", defaultValue = "0") int clubCode, @RequestParam String email) {

        //이메일 중복 여부를 통신해서 값을 받아온다(success : 중복된 값 없음 , fail : 이미 존재하는 이멩리)
        Map<String, Object> result = userService.checkDuplicationEmail(clubCode, email);
//      System.out.println(result);
        return result;
    }


    //학번이 이미 존재하는 학번인지 확인하는 로직--------------------------------------------------------------------------------------------------------
    @RequestMapping(value = "/checkDuplicationStudentId", produces = "application/json; charset=utf8", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> checkDuplicationStudentId(@RequestParam(value = "clubCode", defaultValue = "0") int clubCode, @RequestParam String studentId) {

        //이메일 중복 여부를 통신해서 값을 받아온다(success : 중복된 값 없음 , fail : 이미 존재하는 이멩리)
        Map<String, Object> result = userService.checkDuplicationStudentId(clubCode, studentId);
//      System.out.println(result);
        return result;
    }


    @RequestMapping("/myInfo")
    public String myInfo() {
        return "myInfo";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(HttpServletRequest request) {

        HttpSession session = request.getSession(false);

//        String token = (String)session.getAttribute("token");
//        int club_id = (int)session.getAttribute("club_id");
//        int user_id = (int)session.getAttribute("user_id");

        String message = "";

        //세션을 삭제
        if (session != null) {
            session.invalidate();
            message = "<script>alert('로그아웃 되었습니다.');location.href='login';</script>";
            return message;
        } else {
            message = "<script>alert('이미 로그아웃 되었습니다.');location.href='login';</script>";
            return message;
        }


    }


    //세션이 만료되면 토큰을 재발급 받아주는 로직
    @RequestMapping("/refreshToken")
    @ResponseBody
    public void refreshToken(HttpServletRequest request) {
        userService.refreshToken(request);
    }


//    //최근 회원 접속 정보 테스트()
//    @RequestMapping("/test/refreshToken")
//    public String Test(HttpServletRequest request, Model model) {
//
//        List<Map<String, Object>> test = userService.recentLoginInfo(request);
//        System.out.println(test);
//
//        model.addAttribute("test123", test);
//
//        return "notification.html";
//    }


}
