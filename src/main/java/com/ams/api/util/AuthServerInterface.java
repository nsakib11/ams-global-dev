package com.ams.api.util;

import com.ams.api.service.UserService;
import com.google.common.hash.Hashing;
import com.ams.api.payload.response.VerifyUserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static com.ams.api.util.GlobalConstant.*;

//@Component
public class AuthServerInterface {
//    private static final String[] excludedEndpoints = new String[]{"**/actuator/**"};
    /*private static final Logger logger = LoggerFactory.getLogger(AuthServerInterface.class);
    @Autowired
    UserService userService;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    public String getSha256hexUrl(String fullUrl) {
        String url = "";
        try {
            url = fullUrl.split(contextPath)[1];
            url = Hashing.sha256()
                    .hashString(url, StandardCharsets.UTF_8)
                    .toString();
        } catch (Exception e) {
            logger.error("Exception occurred during getting url by getUrl()", e);
        }
        return url;
    }

    public Boolean isUserAuthorized(String header, String uri) {
        if (Arrays.stream(excludedEndpoints)
                .anyMatch(e -> new AntPathMatcher().match(e, uri)))
            return true;
        else {
            if (header == null){
                VerifyUserResponse response = new VerifyUserResponse("Authorization information must needed.", TOKEN_NOT_FOUND_ERROR_CODE, false);
                SessionMap.setContext(KEY_MAP_USER_AUTHORIZATION_INFO, response);
                return false;
            }
            VerifyUserResponse response = userService.verifyUser(header, getSha256hexUrl(uri));
            SessionMap.setContext(KEY_MAP_USER_AUTHORIZATION_INFO, response);
            return response.getIsValidUser();
        }
    }*/

}
