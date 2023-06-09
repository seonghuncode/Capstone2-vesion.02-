package com.ysh.capstoneTest1.usr.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ysh.capstoneTest1.vo.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class UserService {

    // https오류를 무시 하기 위한 코드 - 원래는 보안상 인증키를 추가해주는 것이 좋다
    private com.ysh.capstoneTest1.restTest.ignoreHttps ignoreHttps;



    //로그인 통신----------------------------------------------------------------------------------------------------------------------------------
    public LoginResponse login(String loginId, String loginPw, HttpServletRequest request, Model model) throws Exception{ // userJoin이라는 리턴 받을 class를 만들어 주어야 된다

        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
                .path("/api/login")
                .queryParam("id", loginId)
                .queryParam("password", loginPw)
                .encode()
                .build()
                .toUri();
//        System.out.println(uri.toString());
        //encode() : usl응 인코딩 하는 용도

//        //LoginResponse :  응답 데이터를 매핑할 목적
//        RestTemplate restTemplate = new RestTemplate();
//        //RestTemplate로 GET요청을 보낼때  ResponseEntity<LoginResponse>로 받는다
//        ResponseEntity<LoginResponse> response = restTemplate.getForEntity(uri, LoginResponse.class);
//        // response.getBody()를 통해 응답 데이터를 LoginResponse객체로 맵핑
//        LoginResponse result = response.getBody();
//
//        System.out.println(response.getStatusCode());
//        System.out.println(result.getAccess_token());
//        System.out.println(result.getClub_id());
//        System.out.println(result.getUser_id());
//        System.out.println(result.getAccess_token_end_at());


        LoginResponse user = new LoginResponse();
        try {
            RestTemplate restTemplate = new RestTemplate();
            // HTTP GET 요청 보내기
            ResponseEntity<LoginResponse> response = restTemplate.getForEntity(uri, LoginResponse.class);
            LoginResponse result = response.getBody();
            // 성공 응답 처리
//            System.out.println("Success:");
            //System.out.println(result);

            user.setClub_id(result.getClub_id());
            user.setUser_id(result.getUser_id());
            user.setAccess_token(result.getAccess_token());
            user.setAccess_token_end_at(result.getAccess_token_end_at());
            user.setMessage("success");


            //세션에 토큰값 저장, club_id, user_id 저장 -> 토큰 재발급 시 필요
            HttpSession session = request.getSession();
            String token = result.getAccess_token();
            session.setAttribute("token", token);

            int club_id = result.getClub_id();
            session.setAttribute("club_id", club_id);

            int user_id = result.getUser_id();
            session.setAttribute("user_id", user_id);

            //반약 팀장 까지 수정 권한을 줄 경우 else if로 팀장일 경우도 추가
            if(result.getRank().equals("방장")){
                session.setAttribute("authority", "관리자");
            }else{
                session.setAttribute("authority", "일반회원");
            }

//            System.out.println("토큰 :  " + session.getAttribute("token"));
//            System.out.println("club_id : " + session.getAttribute("club_id"));
//            System.out.println("user_id : " + session.getAttribute("user_id"));



//            //받은 최근 IP의 형태가 List<Map<String, Object>>의 형태를 반복문을 통해 각각을 추출하는 방법(데이터 잘 들어있는지 확인 용도)
//            for (Map<String, Object> data : recentInfo) {
//                String ip = (String) data.get("ip");
//                String device = (String) data.get("device");
//                String createdAt = (String) data.get("created_at");
//
//                // 추출된 값들을 사용하여 원하는 작업을 수행
//                System.out.println("IP: " + ip);
//                System.out.println("Device: " + device);
//                System.out.println("Created At: " + createdAt);
//                System.out.println("--------");
//            }



        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
//            System.out.println("Failure:");
//            System.out.println(errorResponseBody);

            //에러 메세지 에서 특정 부분 message만 꺼내서 변수에 담는다.
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(errorResponseBody);
            String errorMessage = jsonNode.get("message").asText();
            //System.out.println(errorMessage);

            user.setMessage("fail");
        }



        // User 객체 생성 및 필요한 값 설정, user은 따로 LoginResponse를 사용하지 않고 LoginResponse에 들어있는 필드를 넣고 필요에 다라 추가적인 필드를 넣고
        //사용해도 된다 현재는 같은 클래스를 사용했지만
        //원래는 클래스를 직접 만들어 LoginResponse 클래스와 상호작용해서 해당 객체를 생성하고 반환하는 용도
//        LoginResponse user = new LoginResponse();
//        user.setClub_id(result.getClub_id());
//        user.setUser_id(result.getUser_id());
//        user.setAccess_token(result.getAccess_token());
//        user.setAccess_token_end_at(result.getAccess_token_end_at());

        return user;

    }


    //아이디 찾기에 대한 통신----------------------------------------------------------------------------------------------------------------------
    public LoginResponse findId(int clubCode, String name, String email){

        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
                .path("/api/idFind")
                .queryParam("club_code", clubCode)
                .queryParam("name", name)
                .queryParam("email", email)
                .encode()
                .build()
                .toUri();
        //System.out.println(uri.toString());

        LoginResponse user = new LoginResponse();
        try {
            RestTemplate restTemplate = new RestTemplate();
            // HTTP GET 요청 보내기
            ResponseEntity<LoginResponse> response = restTemplate.getForEntity(uri, LoginResponse.class);
            LoginResponse result = response.getBody();
            // 성공 응답 처리
//            System.out.println("Success:");
            //System.out.println(result);

//            user.setClub_code(result.getClub_code());
//            user.setName(result.getName());
//            user.setEmail(result.getEmail());
            user.setUser_id(result.getUser_id());
            user.setStudent_id(result.getStudent_id());
            user.setMessage("success");
        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
//            System.out.println("Failure:");
            //System.out.println(errorResponseBody);
            user.setMessage("fail");
        }

        return user;
    }



    //비밀번호 찾기에 대한 통신--------------------------------------------------------------------------------------------------------------------
    public LoginResponse findPw(int clubCode, String name, String studentId){

        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
                .path("/api/passwordFind")
                .queryParam("club_code", clubCode)
                .queryParam("name", name)
                .queryParam("student_id", studentId)
                .encode()
                .build()
                .toUri();
//        System.out.println(uri.toString());

        LoginResponse user = new LoginResponse();
        try {
            RestTemplate restTemplate = new RestTemplate();
            // HTTP GET 요청 보내기
            ResponseEntity<LoginResponse> response = restTemplate.getForEntity(uri, LoginResponse.class);
            LoginResponse result = response.getBody();
            // 성공 응답 처리
//            System.out.println("Success:");
//            System.out.println(result);


            user.setUser_id(result.getUser_id());
            user.setStudent_id(result.getStudent_id());
            user.setPassword(result.getPassword());
            user.setMessage("success");
        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
//            System.out.println("Failure:");
//            System.out.println(errorResponseBody);
            user.setMessage("fail");
        }

        return user;
    }






    //회원가입 통신------------------------------------------------------------------------------------------------------------------------------------
    public String join(String birthday, int clubCode, String name, String email, int departmentCode, int studentId, String phoneNumber, String address, String sex, boolean project, boolean cctv) { // userJoin이라는 리턴 받을 class를 만들어 주어야 된다

        //리턴할 결과값
        String result;

        //핸드폰 번호를 -로 구분해서 바꾸어 준다----------------------------
        StringBuilder formattedNumber = new StringBuilder();

        formattedNumber.append(phoneNumber.substring(0, 3)); // "010"
        formattedNumber.append("-");
        formattedNumber.append(phoneNumber.substring(3, 7)); // "9206"
        formattedNumber.append("-");
        formattedNumber.append(phoneNumber.substring(7)); // "9999"

        phoneNumber = formattedNumber.toString();
        //System.out.println(phoneNumber);
        //---------------------------------------------------------------------


        try {
            RestTemplate restTemplate = new RestTemplate();

            // HTTP 요청을 보낼 URL
            String url = "http://13.209.55.246:80/api/joinMembership";

            // HTTP 요청 헤더 설정
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            // HTTP 요청 바디 설정
            String requestBody = "{\"club_code\": "+ clubCode +", \"department_code\": "+departmentCode+", \"student_id\": "+studentId+", \"name\": \""+name+"\", " +
                    "\"gender\": \""+sex+"\", \"phone\": [\""+phoneNumber+"\"], \"email\": \""+email+"\", \"address\": \""+address+"\", " +
                    "\"birthday\": \""+birthday+"\", \"cctv_consent\": "+cctv+", \"project_consent\": "+project+"}";

//            System.out.println("responseBody1" + requestBody);

            HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

            // HTTP POST 요청 보내기
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

            // HTTP 응답 결과 가져오기
            String responseBody = response.getBody();

//            System.out.println("responseBody" + responseBody);

            //성공할 경우
            result = "success";

        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
//            System.out.println("error" + errorResponseBody);
            result = "fail";
        }




        return result;

    }


    //동아리 코드를 통해 학과 코드를 찾는 통신 로직--------------------------------------------------------------------------------------------
    public List<Map<String, Object>> findeDepartmentCode(int clubCode){

        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
                .path("/api/club/departments")
                .queryParam("club_code", clubCode)
                .encode()
                .build()
                .toUri();
//        System.out.println(uri.toString());


        try {
            RestTemplate restTemplate = new RestTemplate();
            // HTTP GET 요청 보내기(List형식으로 학과. 학과 코드를 key,value형식으로 받는다.)
            ResponseEntity<List> response = restTemplate.getForEntity(uri, List.class);

            //resultList에 응답 받은 값을 넣는다
            List<Map<String, Object>> resultList = response.getBody();

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
//            System.out.println("Failure:");

            List<Map<String, Object>> resultList = new ArrayList<>();
            Map<String, Object> map = new HashMap<>();
            map.put("result", "fail");

            // Map을 List에 추가
            resultList.add(map);

            return resultList;
        }
    }



    //이메일 번호가 이미 데이터베이스에 존재하는지 체크 하는 통신 로직---------------------------------------------------------------------------------
    public Map<String, Object> checkDuplicationEmail(int clubCode, String email){

        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
                .path("/api/emailDuplicateCheck")
                .queryParam("club_code", clubCode)
                .queryParam("email", email)
                .encode()
                .build()
                .toUri();
//        System.out.println(uri.toString());


        try {
            RestTemplate restTemplate = new RestTemplate();
            // HTTP GET 요청 보내기(List형식으로 학과. 학과 코드를 key,value형식으로 받는다.)
            ResponseEntity<Map> response = restTemplate.getForEntity(uri, Map.class);

            //resultList에 응답 받은 값을 넣는다
            Map<String, Object> resultList = response.getBody();

            Map<String, Object> map = new HashMap<>();
            map.put("result", "success");

//            System.out.println("============================");
//            System.out.println(resultList);
//            System.out.println("============================");

            // 성공 응답 처리

            return resultList;

        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
            System.out.println("Failure:");
            System.out.println(errorResponseBody);

            Map<String, Object> map = new HashMap<>();
            map.put("result", "fail");

            return map;
        }
    }


    //학번이 이미 데이터베이스에 존재하는지 체크 하는 통신 로직---------------------------------------------------------------------------------
    public Map<String, Object> checkDuplicationStudentId(int clubCode, String studentId){

        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
                .path("/api/studentIdDuplicateCheck")
                .queryParam("club_code", clubCode)
                .queryParam("student_id", studentId)
                .encode()
                .build()
                .toUri();
//        System.out.println(uri.toString());


        try {
            RestTemplate restTemplate = new RestTemplate();
            // HTTP GET 요청 보내기(List형식으로 학과. 학과 코드를 key,value형식으로 받는다.)
            ResponseEntity<Map> response = restTemplate.getForEntity(uri, Map.class);

            //resultList에 응답 받은 값을 넣는다
            Map<String, Object> resultList = response.getBody();

            Map<String, Object> map = new HashMap<>();
            map.put("result", "success");

//            System.out.println("============================");
//            System.out.println(resultList);
//            System.out.println("============================");

            // 성공 응답 처리

            return resultList;

        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
//            System.out.println("Failure:");
//            System.out.println(errorResponseBody);

            Map<String, Object> map = new HashMap<>();
            map.put("result", "fail");

            return map;
        }
    }



    //재발급 받은 토큰을 리턴해주는 방법
    public void refreshToken(HttpServletRequest request){


        HttpSession session = request.getSession();

        //g현재 세션에 저장 된 정보보
       String token = (String) session.getAttribute("token");
        int club_id = (int)session.getAttribute("club_id");
        int user_id = (int)session.getAttribute("user_id");


//        System.out.println("토큰 :  " + session.getAttribute("token"));
//        System.out.println("club_id : " + session.getAttribute("club_id"));
//        System.out.println("user_id : " + session.getAttribute("user_id"));

        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
                .path("/api/token")
                .queryParam("club_id", club_id)
                .queryParam("user_id", user_id)
                .encode()
                .build()
                .toUri();

//        System.out.println(uri.toString());

        LoginResponse user = new LoginResponse();
        try {
            RestTemplate restTemplate = new RestTemplate();
            // HTTP GET 요청 보내기
            ResponseEntity<LoginResponse> response = restTemplate.getForEntity(uri, LoginResponse.class);
            LoginResponse result = response.getBody();
            // 성공 응답 처리
//            System.out.println("Success:");
//            System.out.println(result);

            user.setClub_id(result.getClub_id());
            user.setUser_id(result.getUser_id());
            user.setAccess_token(result.getAccess_token());
            user.setAccess_token_end_at(result.getAccess_token_end_at());
            user.setMessage("success");

            //세션에 기존 토큰 삭제 후 다시 저장
            //세션에 토큰값 저장, club_id, user_id 저장 -> 토큰 재발급 시 필요
            session.removeAttribute("token");
            session.removeAttribute("club_id");
            session.removeAttribute("user_id");

            token = result.getAccess_token();
            session.setAttribute("token", token);

            club_id = result.getClub_id();
            session.setAttribute("club_id", club_id);

            user_id = result.getUser_id();
            session.setAttribute("user_id", user_id);

//            System.out.println("재발급 받은 토큰1 : " + session.getAttribute("token"));


        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
//            System.out.println("Failure:");
//            System.out.println(errorResponseBody);
            user.setMessage("fail");
            
        }

    }







}
