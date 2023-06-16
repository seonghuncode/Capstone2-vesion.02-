package com.ysh.capstoneTest1.page;


import com.ysh.capstoneTest1.usr.service.PagesService;
import com.ysh.capstoneTest1.usr.service.SideBarService;
import com.ysh.capstoneTest1.usr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

        //메뉴 전체 리스트를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> menuList = sideBarService.getMenuList(request) ;
        model.addAttribute("menuList", menuList);
//        System.out.println(menuList);


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

        //메뉴 전체 리스트를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> menuList = sideBarService.getMenuList(request) ;
        model.addAttribute("menuList", menuList);


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

        //메뉴 전체 리스트를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> menuList = sideBarService.getMenuList(request) ;
        model.addAttribute("menuList", menuList);


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

        //메뉴 전체 리스트를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> menuList = sideBarService.getMenuList(request) ;
        model.addAttribute("menuList", menuList);


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

        //메뉴 전체 리스트를 가지고 오는 부분-------------------------------------------------------
        List<Map<String, Object>> menuList = sideBarService.getMenuList(request) ;
        model.addAttribute("menuList", menuList);


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


    //사용자가 메뉴 추가 아이콘을 클릭할 경우 새로운 메뉴이름과 타입을 정하는 페이지
    @RequestMapping("/doMakeNewMenu")
    public String doMakeNewMenu(){
        return "doMakeNewMenu";
    }


    //사용자가 사이드바의 메뉴 생성 아이콘을 클릭했을 경우 실행되는 로직
    @RequestMapping(value = "/makeNewMenu", produces = "application/json; charset=utf8", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> makeNewMenu(HttpServletRequest request, @RequestParam String title, @RequestParam String type) throws Exception{

        //System.out.println(title + type);

        Map<String, Object> makeNewMenu = sideBarService.makeNewMenu(request, title, type);
        //System.out.println(makeNewMenu);

        return makeNewMenu;
    }


    //사용자가 메뉴 수정 아이콘을 클릭할 경우 새로운 메뉴이름과 타입을 정하는 페이지
    @RequestMapping("/doModifyMenu")
    public String doModifyMenu(int menuId, Model model) {

        model.addAttribute("menuId", menuId);

        System.out.println(menuId);

        return "doModifyMenu";
    }


    //사용자가 메뉴 이름 수정 페이지 에서 수정 하기 버튼을 클릭했을 경우 실행 되는 로직
    @RequestMapping(value = "/modifyMenu", produces = "application/json; charset=utf8", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> modifyMenu(HttpServletRequest request, @RequestParam(value = "title", defaultValue = "0") String title, @RequestParam(value = "type", defaultValue = "0") String type, @RequestParam("menuId") String menuId) throws Exception{

        //System.out.println(title + type);
//        System.out.println(title);
//        System.out.println(type);
//        System.out.println(menuId);

//            int menu_id = Integer.parseInt(menuId);
//            System.out.println("menu_id : " + menu_id);

        int menu_id = Integer.parseInt(menuId);
//        System.out.println("menu_id : " + menu_id);

        Map<String, Object> modifyMenu = sideBarService.modifyMenu(request, title, type, menu_id);
//        System.out.println("Controller>>>>>>>>>>>>>>");
//        System.out.println(modifyMenu);

        return modifyMenu;
    }



    //사용자가 메뉴 삭제 아이콘을 클릭할 경우 새로운 메뉴이름과 타입을 정하는 페이지
    @RequestMapping("/deleteMenu")
    @ResponseBody
    public String deleteMenu(int menu_id, HttpServletRequest request) {
        //System.out.println(menu_id);
        String message = "";
        //menu_id가 값이 안들어 올 경우
        try {
            Map<String, Object> modifyMenu = sideBarService.deleteMenu(request, menu_id);
            //System.out.println(modifyMenu);

            Object result = modifyMenu.get("result");
            if (result != null && result.toString().equals("success")) {
                message = "<script>alert('메뉴명이 정상적으로 삭제 되었습니다.');location.href='mainPage';</script>";
            } else {
                message = "<script>alert('메뉴명 삭제하는데 실패 하였습니다.');location.href='mainPage';</script>";
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("deleteMenu 예외발생");
        }
        return message;
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
