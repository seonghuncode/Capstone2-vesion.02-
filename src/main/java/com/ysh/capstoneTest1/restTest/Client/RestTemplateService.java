package com.ysh.capstoneTest1.restTest.Client;

//Service!!!

import com.ysh.capstoneTest1.restTest.ignoreHttps;
import com.ysh.capstoneTest1.vo.LoginResponse;
import com.ysh.capstoneTest1.vo.Result;
import com.ysh.capstoneTest1.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class RestTemplateService {

    // The method init(KeyManager[], TrustManager[], SecureRandom) ==> https로 요청을 할
    // 경우 key값을 설정해 주는 설정을 해주어야 한다.
    // 원인은 사설 인증서의 경우에 신뢰하는 인증 기관 목록(keystore)에 없어서 발생한다.
    // ------------------------------------------------------------------------------
    // https오류를 무시 하기 위한 코드 - 원래는 보안상 인증키를 추가해주는 것이 좋다
    private com.ysh.capstoneTest1.restTest.ignoreHttps ignoreHttps;

    // http://localhost/api/server/hello
    // response
    public UserResponse hello() {
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:8086").path("/api/server/hello")
                .queryParam("name", "steve").queryParam("age", 13).encode().build().toUri();
        System.out.println(uri.toString());

        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri, String.class);
        // json 형태로 받자!
        ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);
//        UserResponse result = restTemplate.getForObject(uri, UserResponse.class);

        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());

        return result.getBody();
    }

//	// 준석 서버로 get방식으로 로그인 요청 203.250.133.144:8080/userJoin / string 으로 "true" ,
//	// "false"로 반환
//	// api.add_resource(userJoin, "/userJoin/<'string:id'>/<'string:pw'>")
//	// request객체에 body붙여서 보내면 response를 보내준다
//	public userJoin login() { // userJoin이라는 리턴 받을 class를 만들어 주어야 된다
//		URI uri = UriComponentsBuilder.fromUriString("http://203.250.133.144:8080").path("/userJoin/{id}/{pw}")
////				.queryParam("id", "steve")
////				.queryParam("pw", "df")
//				.encode().build().expand("123", "123").toUri();
//		System.out.println(uri.toString());
//
//		login req = new login();
//		req.setLoginId("admin");
//		req.setLoginPw("admin");
//
//		RestTemplate restTemplate = new RestTemplate();
////        String result = restTemplate.getForObject(uri, String.class);
//		// json 형태로 받자!
//		ResponseEntity<userJoin> result = restTemplate.getForEntity(uri, userJoin.class);
////        UserResponse result = restTemplate.getForObject(uri, UserResponse.class);
//
//		System.out.println(result.getStatusCode());
//		System.out.println(result.getBody());
//
//		return result.getBody();
//	}

    // post 구현
    public UserResponse post() {
        // http://localhost:9090/api/server/user/{userId}/name/{userName}

        URI uri = UriComponentsBuilder.fromUriString("http://localhost:8081")
                .path("/api/server/user/{userId}/name/{userName}").encode().build().expand(11, "steve") // uri
                // :http://localhost:8081/api/server/user/11/name/steve
                .toUri();

        System.out.println("uri :" + uri);

        // http body -> object -> object mapper -> json -> rest template -> http body
        // json
        UserRequest req = new UserRequest();
        req.setName("dsg");
        req.setAge(10);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.postForEntity(uri, req, UserResponse.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());

        return response.getBody();
    }

//	public Object test() {
//		URI uri = UriComponentsBuilder.fromUriString("http://localhost:8081")
//				.path("/api/server/machine/member/doLogin?loginId={loginId}&loginPw={loginPw}").encode().build()
//				.expand("admin", "admin") // 파라미터로 넘겨줄 값
//				.toUri();
//
//		System.out.println("uri :" + uri);
//
//		// http body -> object -> object mapper -> json -> rest template -> http body
//		// json
////         UserRequest req = new UserRequest();
////    	 Member req = new Member();
//		login req = new login();
//		req.setLoginId("admin");
//		req.setLoginPw("admin");
//
//		// req.setLoginId("dsg"); //원하는 요청 값
//
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Object> response = restTemplate.postForEntity(uri, req, Object.class); // 리턴받고 싶은 객체.class가 온다
//		// uri에 req object를 보내서 응답은 UserResponse.class타입으로 받을 것이다!!
//
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getHeaders());
//		System.out.println(response.getBody());
//
//		return response.getBody();
//
//	}

    // restTemplage exchange 구현
    public ResponseEntity exchange() {
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:8081").path("/api/server/{path}/header").encode()
                .build().expand("user").toUri();
        log.info("uri : {}", uri);

        UserRequest req = new UserRequest();
        req.setName("dsg");
        req.setAge(27);

        RequestEntity<UserRequest> request = RequestEntity.post(uri).contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "my-header").body(req);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.exchange(request, new ParameterizedTypeReference<>() {
        });
        log.info("{}", response.getStatusCode());
        log.info("{}", response.getHeaders());
        log.info("{}", response.getBody());

        return response;
    }

    // restTemplage naver 구현 item 빈값으로 나옴
    public ResponseEntity naver() {
        URI uri = UriComponentsBuilder.fromUriString("https://openapi.naver.com").path("/v1/search/local.json")
                .queryParam("query", "%EC%A3%BC%EC%8B%9D").queryParam("display", "10").queryParam("start", "1")
                .queryParam("sort", "random").encode().build().toUri();
        log.info("uri : {}", uri);

        RequestEntity<Void> req = RequestEntity.get(uri).header("X-Naver-Client-Id", "Zi3o1uQftp59zuIqEAz4")
                .header("X-Naver-Client-Secret", "iy6YKSWpLM").build();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(req, new ParameterizedTypeReference<>() {
        });
        log.info("{}", response.getStatusCode());
        log.info("{}", response.getHeaders());
        log.info("{}", response.getBody());

        return response;
    }



    //==================================================================================================================
//    // https인증 무시 하는 코드를 선언하여 먼저 연결전 실행 시켜야 한다.
//		ignoreHttps.ignore();
//    ignoreHttps.ignore();



//    //로그인 통신
//	public LoginResponse login(String loginId, String loginPw) { // userJoin이라는 리턴 받을 class를 만들어 주어야 된다
//
//        URI uri = UriComponentsBuilder.fromUriString("http://13.209.55.246:80")
//                .path("/api/login")
//                .queryParam("id", loginId)
//                .queryParam("password", loginPw)
//                .encode()
//                .build()
//                .toUri();
//        System.out.println(uri.toString());
//        //encode() : usl응 인코딩 하는 용도
//
////        //LoginResponse :  응답 데이터를 매핑할 목적
////        RestTemplate restTemplate = new RestTemplate();
////        //RestTemplate로 GET요청을 보낼때  ResponseEntity<LoginResponse>로 받는다
////        ResponseEntity<LoginResponse> response = restTemplate.getForEntity(uri, LoginResponse.class);
////        // response.getBody()를 통해 응답 데이터를 LoginResponse객체로 맵핑
////        LoginResponse result = response.getBody();
////
////        System.out.println(response.getStatusCode());
////        System.out.println(result.getAccess_token());
////        System.out.println(result.getClub_id());
////        System.out.println(result.getUser_id());
////        System.out.println(result.getAccess_token_end_at());
//
//
//        LoginResponse user = new LoginResponse();
//        try {
//            RestTemplate restTemplate = new RestTemplate();
//            // HTTP GET 요청 보내기
//            ResponseEntity<LoginResponse> response = restTemplate.getForEntity(uri, LoginResponse.class);
//            LoginResponse result = response.getBody();
//            // 성공 응답 처리
////            System.out.println("Success:");
////            System.out.println(result);
//
//            user.setClub_id(result.getClub_id());
//            user.setUser_id(result.getUser_id());
//            user.setAccess_token(result.getAccess_token());
//            user.setAccess_token_end_at(result.getAccess_token_end_at());
//            user.setMessage("success");
//        } catch (HttpClientErrorException ex) {
//            // 실패 응답 처리
//            String errorResponseBody = ex.getResponseBodyAsString();
////            System.out.println("Failure:");
////            System.out.println(errorResponseBody);
//            user.setMessage("fail");
//        }
//
//
//
//        // User 객체 생성 및 필요한 값 설정, user은 따로 LoginResponse를 사용하지 않고 LoginResponse에 들어있는 필드를 넣고 필요에 다라 추가적인 필드를 넣고
//        //사용해도 된다 현재는 같은 클래스를 사용했지만
//        //원래는 클래스를 직접 만들어 LoginResponse 클래스와 상호작용해서 해당 객체를 생성하고 반환하는 용도
////        LoginResponse user = new LoginResponse();
////        user.setClub_id(result.getClub_id());
////        user.setUser_id(result.getUser_id());
////        user.setAccess_token(result.getAccess_token());
////        user.setAccess_token_end_at(result.getAccess_token_end_at());
//
//        return user;
//
//	}






}