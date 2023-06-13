package com.ysh.capstoneTest1.page;


import com.ysh.capstoneTest1.usr.service.PagesService;
import com.ysh.capstoneTest1.usr.service.SideBarService;
import com.ysh.capstoneTest1.usr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class pagesController {

    @Autowired
    private UserService userService;

    @Autowired
    private SideBarService sideBarService;

    @Autowired
    private PagesService pagesService;


    //메인페이지
    @RequestMapping("/mainPage")
    public String mainPage(HttpServletRequest request, Model model) throws  Exception{

        //최근 로그인 정보에 대해 통신 하고 받아오는 부분------------------------------------
        List<Map<String, Object>> data = sideBarService.recentLoginInfo(request) ;
        model.addAttribute("sidebarData", data);

//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(data);

        //생일 정보를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> data2 = sideBarService.getBirthdayInfo(request) ;
        model.addAttribute("getBirthdayInfo", data2);

        //비상 연락망을 가지고 오는 부분---------------------------------------------------
        Map<String, Object> emergencyInfo = sideBarService.emergencyInfo(request);
//        System.out.println("/////////////////////////");
//        System.out.println(emergencyInfo);
        model.addAttribute("emergencyInfo", emergencyInfo);

        //현재 로그인 하면서 세션에 저장된 관리자 권한을 넘겨주는 부분
        HttpSession session = request.getSession();
        String authority = (String) session.getAttribute("authority");
        model.addAttribute("authority", authority);
//        System.out.println(authority);


        //토큰이 만료 되었다면 현재 페이지 재로딩 하는 부분
            Map<String, Object> resultMap = data.get(0); // 첫 번째 맵을 가져옴
            if (resultMap.containsKey("token_expire")) {
                Object resultValue = resultMap.get("token_expire");
                if (resultValue instanceof String) {
                    String result = (String) resultValue;
                    // result 변수에 해당 값이 저장됨
//                    System.out.println("Result: " + result);
                    if(result.equals("token_expire")){
//                        System.out.println(result);
                        return "redirect:/mainPage";
                    }
                }
            }
        return "mainPage";
    }

    @RequestMapping("/notification")
    public String notification(HttpServletRequest request, Model model) throws  Exception{


        //최근 로그인 정보에 대해 통신 하고 받아오는 부분------------------------------------
        List<Map<String, Object>> data = sideBarService.recentLoginInfo(request) ;
        model.addAttribute("sidebarData", data);

//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(data);

        //생일 정보를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> data2 = sideBarService.getBirthdayInfo(request) ;
        model.addAttribute("getBirthdayInfo", data2);

        //비상 연락망을 가지고 오는 부분---------------------------------------------------
        Map<String, Object> emergencyInfo = sideBarService.emergencyInfo(request);
//        System.out.println("/////////////////////////");
//        System.out.println(emergencyInfo);
        model.addAttribute("emergencyInfo", emergencyInfo);

        //현재 로그인 하면서 세션에 저장된 관리자 권한을 넘겨주는 부분
        HttpSession session = request.getSession();
        String authority = (String) session.getAttribute("authority");
        model.addAttribute("authority", authority);


        //토큰이 만료 되었다면 현재 페이지 재로딩 하는 부분
        Map<String, Object> resultMap = data.get(0); // 첫 번째 맵을 가져옴
        if (resultMap.containsKey("token_expire")) {
            Object resultValue = resultMap.get("token_expire");
            if (resultValue instanceof String) {
                String result = (String) resultValue;
                // result 변수에 해당 값이 저장됨
//                    System.out.println("Result: " + result);
                if(result.equals("token_expire")){
//                        System.out.println(result);
                    return "redirect:/mainPage";
                }
            }
        }

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
    public String rules(HttpServletRequest request, Model model) throws  Exception{

        //최근 로그인 정보에 대해 통신 하고 받아오는 부분------------------------------------
        List<Map<String, Object>> data = sideBarService.recentLoginInfo(request) ;
        model.addAttribute("sidebarData", data);

//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(data);

        //생일 정보를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> data2 = sideBarService.getBirthdayInfo(request) ;
        model.addAttribute("getBirthdayInfo", data2);

        //비상 연락망을 가지고 오는 부분---------------------------------------------------
        Map<String, Object> emergencyInfo = sideBarService.emergencyInfo(request);
//        System.out.println("/////////////////////////");
//        System.out.println(emergencyInfo);
        model.addAttribute("emergencyInfo", emergencyInfo);

        //현재 로그인 하면서 세션에 저장된 관리자 권한을 넘겨주는 부분
        HttpSession session = request.getSession();
        String authority = (String) session.getAttribute("authority");
        model.addAttribute("authority", authority);


        //토큰이 만료 되었다면 현재 페이지 재로딩 하는 부분
        Map<String, Object> resultMap = data.get(0); // 첫 번째 맵을 가져옴
        if (resultMap.containsKey("token_expire")) {
            Object resultValue = resultMap.get("token_expire");
            if (resultValue instanceof String) {
                String result = (String) resultValue;
                // result 변수에 해당 값이 저장됨
//                    System.out.println("Result: " + result);
                if(result.equals("token_expire")){
//                        System.out.println(result);
                    return "redirect:/mainPage";
                }
            }
        }


        return "rules";
    }

    @RequestMapping("/ruleModify")
    public String ruleModify(){
        return "ruleModify";
    }

    @RequestMapping("/organizationalChart")
    public String elements(HttpServletRequest request, Model model) throws  Exception{

        //최근 로그인 정보에 대해 통신 하고 받아오는 부분------------------------------------
        List<Map<String, Object>> data = sideBarService.recentLoginInfo(request) ;
        model.addAttribute("sidebarData", data);

//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(data);

        //생일 정보를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> data2 = sideBarService.getBirthdayInfo(request) ;
        model.addAttribute("getBirthdayInfo", data2);

        //비상 연락망을 가지고 오는 부분---------------------------------------------------
        Map<String, Object> emergencyInfo = sideBarService.emergencyInfo(request);
//        System.out.println("/////////////////////////");
//        System.out.println(emergencyInfo);
        model.addAttribute("emergencyInfo", emergencyInfo);

        //현재 로그인 하면서 세션에 저장된 관리자 권한을 넘겨주는 부분
        HttpSession session = request.getSession();
        String authority = (String) session.getAttribute("authority");
        model.addAttribute("authority", authority);


        //토큰이 만료 되었다면 현재 페이지 재로딩 하는 부분
        Map<String, Object> resultMap = data.get(0); // 첫 번째 맵을 가져옴
        if (resultMap.containsKey("token_expire")) {
            Object resultValue = resultMap.get("token_expire");
            if (resultValue instanceof String) {
                String result = (String) resultValue;
                // result 변수에 해당 값이 저장됨
//                    System.out.println("Result: " + result);
                if(result.equals("token_expire")){
//                        System.out.println(result);
                    return "redirect:/mainPage";
                }
            }
        }


        //조직도에 대한 내용 외부 서버 에서 불러오기
        List<Map<String, Object>> oraganization = pagesService.getOrganizationChart(request) ;
        System.out.println(data2);
        model.addAttribute("oraganization", oraganization);


        return "organizationalChart";
    }

    @RequestMapping("/referenceUI")
    public String referenceUI(){
        return "referenceUI";
    }

    @RequestMapping("/moneyHistory")
    public String moneyHistory(HttpServletRequest request, Model model) throws  Exception{

        //최근 로그인 정보에 대해 통신 하고 받아오는 부분------------------------------------
        List<Map<String, Object>> data = sideBarService.recentLoginInfo(request) ;
        model.addAttribute("sidebarData", data);

//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(data);

        //생일 정보를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> data2 = sideBarService.getBirthdayInfo(request) ;
        model.addAttribute("getBirthdayInfo", data2);

        //비상 연락망을 가지고 오는 부분---------------------------------------------------
        Map<String, Object> emergencyInfo = sideBarService.emergencyInfo(request);
//        System.out.println("/////////////////////////");
//        System.out.println(emergencyInfo);
        model.addAttribute("emergencyInfo", emergencyInfo);

        //현재 로그인 하면서 세션에 저장된 관리자 권한을 넘겨주는 부분
        HttpSession session = request.getSession();
        String authority = (String) session.getAttribute("authority");
        model.addAttribute("authority", authority);


        //토큰이 만료 되었다면 현재 페이지 재로딩 하는 부분
        Map<String, Object> resultMap = data.get(0); // 첫 번째 맵을 가져옴
        if (resultMap.containsKey("token_expire")) {
            Object resultValue = resultMap.get("token_expire");
            if (resultValue instanceof String) {
                String result = (String) resultValue;
                // result 변수에 해당 값이 저장됨
//                    System.out.println("Result: " + result);
                if(result.equals("token_expire")){
//                        System.out.println(result);
                    return "redirect:/mainPage";
                }
            }
        }


        return "moneyHistory";
    }


//    //조직도에 대한 정보를 받아오는 부분
//    @RequestMapping("/test/getOrganizationChart")
//    @ResponseBody
//    public String getOrganizationChart(HttpServletRequest request) throws Exception {
//        List<Map<String, Object>> data2 = pagesService.getOrganizationChart(request) ;
//        System.out.println(data2);
//
//
//        return "sds";
//    }



}
