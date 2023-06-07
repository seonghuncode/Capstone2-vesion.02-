package com.ysh.capstoneTest1.usr.service;


import com.ysh.capstoneTest1.vo.JoinResponse;
import com.ysh.capstoneTest1.vo.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.print.attribute.standard.JobName;
import java.net.URI;

@Slf4j
@Service
public class UserService {

    // https오류를 무시 하기 위한 코드 - 원래는 보안상 인증키를 추가해주는 것이 좋다
    private com.ysh.capstoneTest1.restTest.ignoreHttps ignoreHttps;



    //로그인 통신
    public LoginResponse login(String loginId, String loginPw) { // userJoin이라는 리턴 받을 class를 만들어 주어야 된다

        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
                .path("/api/login")
                .queryParam("id", loginId)
                .queryParam("password", loginPw)
                .encode()
                .build()
                .toUri();
        System.out.println(uri.toString());
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
            System.out.println(result);

            user.setClub_id(result.getClub_id());
            user.setUser_id(result.getUser_id());
            user.setAccess_token(result.getAccess_token());
            user.setAccess_token_end_at(result.getAccess_token_end_at());
            user.setMessage("success");
        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
//            System.out.println("Failure:");
            System.out.println(errorResponseBody);
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






    //회원가입 통신
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

            System.out.println("responseBody1" + requestBody);

            HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

            // HTTP POST 요청 보내기
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

            // HTTP 응답 결과 가져오기
            String responseBody = response.getBody();

            System.out.println("responseBody" + responseBody);

            //성공할 경우
            result = "success";

        } catch (HttpClientErrorException ex) {
            // 실패 응답 처리
            String errorResponseBody = ex.getResponseBodyAsString();
            System.out.println("error" + errorResponseBody);
            result = "fail";
        }




        return result;

    }



}
