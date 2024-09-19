package com.ams.api.service;

import com.ams.api.payload.response.VerifyUserResponse;

public interface UserService {
    VerifyUserResponse verifyUser(String header, String uri);
}
