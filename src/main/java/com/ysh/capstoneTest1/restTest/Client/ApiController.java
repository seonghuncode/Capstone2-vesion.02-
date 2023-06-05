package com.ysh.capstoneTest1.restTest.Client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {


    private final RestTemplateService restTemplateService;

    public ApiController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    // get메서드 구현
//    @GetMapping("/hello")
//    public UserResponse getHello() {
//        return restTemplateService.hello();
//    }

//	//post 구현
//	@GetMapping("/hello")
//    public UserResponse postHello() {
//        return restTemplateService.post();
//
//	}


    //restTemplate exchange구현
    @GetMapping("/hello")
    public UserResponse getHello() {
        return restTemplateService.hello();
    }

    @GetMapping("/post")
    public UserResponse post() {
        return restTemplateService.post();
    }

    @GetMapping("/exchange")
    public ResponseEntity exchange() {
        return restTemplateService.exchange();
    }

    //restTemplage naver 구현 items 빈값으로 나옴
    @GetMapping("/naver")
    public ResponseEntity naver() {
        return restTemplateService.naver();
    }

//	 @GetMapping("/test")
//	 public Object test() {
//		 return restTemplateService.test();
//	 }




}