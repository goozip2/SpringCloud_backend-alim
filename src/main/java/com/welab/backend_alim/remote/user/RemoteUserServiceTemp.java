//package com.welab.backend_alim.remote.user;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//@RequiredArgsConstructor
//public class RemoteUserServiceTemp {
//    private final RestTemplate restTemplate;
//
//    public String callUserHello() {
//        // ip 주소 대신 서비스명 사용 (application-loca.yml 파일에 작성됨)
//        //return restTemplate.getForObject("http://user-service/backend/user/v1/hello", String.class);
//        return restTemplate.getForObject("http://backend-user/backend/user/v1/hello", String.class);
//    }
//}
