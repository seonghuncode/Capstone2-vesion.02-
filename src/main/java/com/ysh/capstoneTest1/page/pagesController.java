package com.ysh.capstoneTest1.page;


import com.ysh.capstoneTest1.usr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class pagesController {

    @Autowired
    private UserService userService;


    //메인페이지
    @RequestMapping("/mainPage")
    public String mainPage(HttpServletRequest request, Model model) throws  Exception{

        List<Map<String, Object>> data = userService.recentLoginInfo(request) ;

//        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(data);

            Map<String, Object> resultMap = data.get(0); // 첫 번째 맵을 가져옴
            if (resultMap.containsKey("token_expire")) {
                Object resultValue = resultMap.get("token_expire");
                if (resultValue instanceof String) {
                    String result = (String) resultValue;
                    // result 변수에 해당 값이 저장됨
                    System.out.println("Result: " + result);
                    if(result.equals("token_expire")){
                        System.out.println(result);
                        return "redirect:/mainPage";
                    }
                }
            }


        model.addAttribute("sidebarData", data);

        return "mainPage";
    }

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
    public String rules(){
        return "rules";
    }

    @RequestMapping("/ruleModify")
    public String ruleModify(){
        return "ruleModify";
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
