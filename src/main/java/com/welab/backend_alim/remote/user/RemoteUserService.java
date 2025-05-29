package com.welab.backend_alim.remote.user;

import com.welab.backend_alim.remote.user.dto.UserUserInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "backend-user", path="/backend/user/v1")
public interface RemoteUserService {
    @GetMapping(value = "/hello")
    public String callUserHello();

    @GetMapping(value = "/info")
    public UserUserInfoDto.Response userInfo(@RequestParam("userId") String userId);

    @PostMapping(value = "/postInfo")
    public UserUserInfoDto.Response userPostInfo(@RequestBody UserUserInfoDto.Request request);
}