package com.welab.backend_alim.remote.user.dto;

import lombok.*;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class UserUserInfoDto {

    @Getter
    @Setter
    public static class Request {
        private String userId;
    }

    @Getter
    @Setter
    public static class Response {
        private String userId;
        private String userName;
        private String phoneNumber;
    }
}
