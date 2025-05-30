package com.welab.backend_alim.api.backend;

import com.welab.backend_alim.domain.dto.SendSmsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Slf4j
@RestController
@RequestMapping(value="/backend/alim/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class BackendAlimController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "알림 백엔드 서비스가 호출되었습니다.";
    }

    @PostMapping(value = "/sms")
    public SendSmsDto.Response sendSms(@RequestBody SendSmsDto.Request request) {
        log.info("회원가입을 축하드립니다. sendSms: userId={}", request.getUserId());
        SendSmsDto.Response response = new SendSmsDto.Response();
        response.setResult("OK");
        return response;
    }
}
