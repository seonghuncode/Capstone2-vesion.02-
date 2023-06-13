package com.ysh.capstoneTest1.usr.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@Service
public class SideBarService {

    @Autowired
    private UserService userService;


    //최근 로그인 정보를 외부 서버로 부터 불러오는 로직------------------------------------------------------------------------------------------------
    public List<Map<String, Object>> recentLoginInfo(HttpServletRequest request) throws Exception {

        HttpSession session = request.getSession();

        //세션에 있는 url에 필요한 값을 변수에 담는다
        int club_id = (int) session.getAttribute("club_id");
        int user_id = (int) session.getAttribute("user_id");
//        System.out.println("=====세션에 있는 club_id, user_id======");
//        System.out.println("club_id : " + club_id);
//        System.out.println("user_id : " + user_id);
//        System.out.println("기존 토큰 : " + session.getAttribute("token"));

        try {
            //String url = "http://13.209.55.246:80/api/clubs/1/users/4/loginInfomation";
            String url = "http://13.209.55.246:80/api/clubs/" + club_id + "/users/" + user_id + "/loginInfomation";
            String authToken = (String) session.getAttribute("token");
//            System.out.println(authToken);

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + authToken);
            headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

//            System.out.println(url.toString());

            // HTTP GET 요청 보내기(List형식으로 학과. 학과 코드를 key,value형식으로 받는다.)
            RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, URI.create(url));
            ResponseEntity<List> responseEntity = restTemplate.exchange(requestEntity, List.class);


            //resultList에 응답 받은 값을 넣는다
            List<Map<String, Object>> resultList = responseEntity.getBody();

            // resultList에 있는 값을 key와 value형식으로 json형식에 맞게 넣어준다
            for (Map<String, Object> map : resultList) {
                String name = (String) map.get("name");
                String code = (String) map.get("code");
            }
//            System.out.println("============================");
//            System.out.println(resultList);
//            System.out.println("============================");

            // 성공 응답 처리

            return resultList;

        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
            //System.out.println("Failure:");
//            System.out.println("errorResonseBody");
//            System.out.println(errorResponseBody);

            List<Map<String, Object>> resultList = new ArrayList<>();
            Map<String, Object> map = new HashMap<>();
            map.put("result", "fail");

            //만약 토큰이 만료되어 난 오류로 "Token Expire"로 오게 되면 토큰을 재발급 받는 로직을 실행시키고 요청을 다시 한다
            //에러 메세지 에서 특정 부분 message만 꺼내서 변수에 담는다.
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(errorResponseBody); //readTree에서 오류가 안나기 위해서는 throws Exception을 해주어야 된다.
            String errorMessage = jsonNode.get("message").asText();
//            System.out.println(errorMessage);

            if (errorMessage.equals("Token Expire")) {
                //토큰 재발급
//                System.out.println("토큰 말료로 인한 재발급을 진행하고 요청을 다시 보낸다");
                userService.refreshToken(request);

//                System.out.println("재발급 받고 난 후의 토큰 : " + session.getAttribute("token"));

                map.put("token_expire", "token_expire");

                // Map을 List에 추가
                resultList.add(map);

            }

            return resultList;
        }

    }


    //생일 정보를 불러오는 부분-----------------------------------------------------------------------------------------
    public List<Map<String, Object>> getBirthdayInfo(HttpServletRequest request) throws Exception {


        HttpSession session = request.getSession();

        //세션에 있는 url에 필요한 값을 변수에 담는다
        int club_id = (int) session.getAttribute("club_id");
        int user_id = (int) session.getAttribute("user_id");
//        System.out.println("=====세션에 있는 club_id, user_id======");
//        System.out.println("club_id : " + club_id);
//        System.out.println("user_id : " + user_id);
//        System.out.println("기존 토큰 : " + session.getAttribute("token"));

        try {
            String url = "http://13.209.55.246:80/api/clubs/" + club_id + "/users/" + user_id + "/recentBirthday";
            String authToken = (String) session.getAttribute("token");
//            System.out.println(authToken);

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + authToken);
            headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

//            System.out.println(url.toString());

            // HTTP GET 요청 보내기(List형식으로 학과. 학과 코드를 key,value형식으로 받는다.)
            RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, URI.create(url));
            ResponseEntity<List> responseEntity = restTemplate.exchange(requestEntity, List.class);


            //resultList에 응답 받은 값을 넣는다
            List<Map<String, Object>> resultList = responseEntity.getBody();

            // resultList에 있는 값을 key와 value형식으로 json형식에 맞게 넣어준다
            for (Map<String, Object> map : resultList) {
                String name = (String) map.get("name");
                String code = (String) map.get("code");
            }
//            System.out.println("============================");
//            System.out.println(resultList);
//            System.out.println("============================");

            // 성공 응답 처리

            return resultList;

        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
            //System.out.println("Failure:");
//            System.out.println("errorResonseBody");
//            System.out.println(errorResponseBody);

            List<Map<String, Object>> resultList = new ArrayList<>();
            Map<String, Object> map = new HashMap<>();
            map.put("result", "fail");

            //만약 토큰이 만료되어 난 오류로 "Token Expire"로 오게 되면 토큰을 재발급 받는 로직을 실행시키고 요청을 다시 한다
            //에러 메세지 에서 특정 부분 message만 꺼내서 변수에 담는다.
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(errorResponseBody); //readTree에서 오류가 안나기 위해서는 throws Exception을 해주어야 된다.
            String errorMessage = jsonNode.get("message").asText();
//            System.out.println(errorMessage);

            if (errorMessage.equals("Token Expire")) {
                //토큰 재발급
//                System.out.println("토큰 말료로 인한 재발급을 진행하고 요청을 다시 보낸다");
                userService.refreshToken(request);

//                System.out.println("재발급 받고 난 후의 토큰 : " + session.getAttribute("token"));

                map.put("token_expire", "token_expire");

                // Map을 List에 추가
                resultList.add(map);

            }

            return resultList;
        }
    }



    //비상연락망  정보를 불러오는 부분-----------------------------------------------------------------------------------------
    public Map<String, Object> emergencyInfo(HttpServletRequest request) throws Exception {

        HttpSession session = request.getSession();

        //세션에 있는 url에 필요한 값을 변수에 담는다
        int club_id = (int) session.getAttribute("club_id");
        int user_id = (int) session.getAttribute("user_id");
//        System.out.println("=====세션에 있는 club_id, user_id======");
//        System.out.println("club_id : " + club_id);
//        System.out.println("user_id : " + user_id);
//        System.out.println("기존 토큰 : " + session.getAttribute("token"));

        try {
            String url = "http://13.209.55.246:80/api/clubs/" + club_id + "/users/" + user_id + "/emergencyContactNetwork";
            String authToken = (String) session.getAttribute("token");
//            System.out.println(authToken);

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + authToken);
            headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

//            System.out.println(url.toString());

            // HTTP GET 요청 보내기(List형식으로 학과. 학과 코드를 key,value형식으로 받는다.)
            RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, URI.create(url));
            ResponseEntity<Map> responseEntity = restTemplate.exchange(requestEntity, Map.class);

            //resultList에 응답 받은 값을 넣는다
            Map<String, Object> resultList = responseEntity.getBody();
//            System.out.println("============================");
//            System.out.println(resultList);
//            System.out.println("============================");

            // 성공 응답 처리

            return resultList;

        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
            //System.out.println("Failure:");
//            System.out.println("errorResonseBody");
//            System.out.println(errorResponseBody);

            //List<Map<String, Object>> resultList = new ArrayList<>();
            Map<String, Object> resultList = new HashMap<>();
            resultList.put("result", "fail");

            //만약 토큰이 만료되어 난 오류로 "Token Expire"로 오게 되면 토큰을 재발급 받는 로직을 실행시키고 요청을 다시 한다
            //에러 메세지 에서 특정 부분 message만 꺼내서 변수에 담는다.
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(errorResponseBody); //readTree에서 오류가 안나기 위해서는 throws Exception을 해주어야 된다.
            String errorMessage = jsonNode.get("message").asText();
//            System.out.println(errorMessage);

            if (errorMessage.equals("Token Expire")) {
                //토큰 재발급
//                System.out.println("토큰 말료로 인한 재발급을 진행하고 요청을 다시 보낸다");
                userService.refreshToken(request);
//                System.out.println("재발급 받고 난 후의 토큰 : " + session.getAttribute("token"));
                resultList.put("token_expire", "token_expire");
            }
            return resultList;
        }
    }





    //메뉴 전체 리스트를 조회 하는 로직-----------------------------------------------------------------------------------------
    public List<Map<String, Object>> getMenuList(HttpServletRequest request) throws Exception {


        HttpSession session = request.getSession();

        //세션에 있는 url에 필요한 값을 변수에 담는다
        int club_id = (int) session.getAttribute("club_id");
        int user_id = (int) session.getAttribute("user_id");
//        System.out.println("=====세션에 있는 club_id, user_id======");
//        System.out.println("club_id : " + club_id);
//        System.out.println("user_id : " + user_id);
//        System.out.println("기존 토큰 : " + session.getAttribute("token"));

        try {
            String url = "http://13.209.55.246:80/api/clubs/" + club_id + "/users/" + user_id + "/menu";
            String authToken = (String) session.getAttribute("token");
//            System.out.println(authToken);

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + authToken);
            headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

//            System.out.println(url.toString());

            // HTTP GET 요청 보내기(List형식으로 학과. 학과 코드를 key,value형식으로 받는다.)
            RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, URI.create(url));
            ResponseEntity<List> responseEntity = restTemplate.exchange(requestEntity, List.class);


            //resultList에 응답 받은 값을 넣는다
            List<Map<String, Object>> resultList = responseEntity.getBody();

            // resultList에 있는 값을 key와 value형식으로 json형식에 맞게 넣어준다
            for (Map<String, Object> map : resultList) {
                String name = (String) map.get("name");
                String code = (String) map.get("code");
            }
//            System.out.println("============================");
//            System.out.println(resultList);
//            System.out.println("============================");

            // 성공 응답 처리

            return resultList;

        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
            //System.out.println("Failure:");
//            System.out.println("errorResonseBody");
//            System.out.println(errorResponseBody);

            List<Map<String, Object>> resultList = new ArrayList<>();
            Map<String, Object> map = new HashMap<>();
            map.put("result", "fail");

            //만약 토큰이 만료되어 난 오류로 "Token Expire"로 오게 되면 토큰을 재발급 받는 로직을 실행시키고 요청을 다시 한다
            //에러 메세지 에서 특정 부분 message만 꺼내서 변수에 담는다.
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(errorResponseBody); //readTree에서 오류가 안나기 위해서는 throws Exception을 해주어야 된다.
            String errorMessage = jsonNode.get("message").asText();
//            System.out.println(errorMessage);

            if (errorMessage.equals("Token Expire")) {
                //토큰 재발급
//                System.out.println("토큰 말료로 인한 재발급을 진행하고 요청을 다시 보낸다");
                userService.refreshToken(request);

//                System.out.println("재발급 받고 난 후의 토큰 : " + session.getAttribute("token"));

                map.put("token_expire", "token_expire");

                // Map을 List에 추가
                resultList.add(map);

            }

            return resultList;
        }
    }









}
