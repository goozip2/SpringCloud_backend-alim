package com.welab.backend_alim.api.open;

import com.welab.backend_alim.remote.user.RemoteUserService;
import com.welab.backend_alim.remote.user.dto.UserUserInfoDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/alim/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class AlimController {
    private final RemoteUserService remoteUserService;

    @GetMapping(value = "/hello")
    public String test() {
        return remoteUserService.callUserHello();
    }

    @GetMapping(value = "/info")
    public UserUserInfoDto.Response userInfo(@RequestParam("userId") String userId) {
        UserUserInfoDto.Response response = remoteUserService.userInfo(userId);
        return response;
    }

    @PostMapping(value = "/postInfo")
    public UserUserInfoDto.Response userPostInfo(@RequestBody UserUserInfoDto.Request request) {
        UserUserInfoDto.Response response = remoteUserService.userPostInfo(request);
        return response;
    }
}
