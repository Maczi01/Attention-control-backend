package com.example.attentioncontolbackend.configuration;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Component
public class RestAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private final int expirationTime;
    private final String secret;

    public RestAuthenticationSuccessHandler() {
        this.expirationTime = 20000;
        this.secret = "xxx";
    }


    //    public RestAuthenticationSuccessHandler( int expirationTime,
//                                            String secret) {
////        public
////    } RestAuthenticationSuccessHandler(@Value("${jwt.expirationTime}") int expirationTime,
////                                            @Value("${jwt.secret}") String secret) {
//        this.expirationTime = 20000;
//        this.secret = secret;
//    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        UserDetails principal = (UserDetails) authentication.getPrincipal();
        String token = JWT.create()
                .withSubject(principal.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + expirationTime))
                .sign(Algorithm.HMAC256(secret));
        response.getOutputStream().print("{\"token\": \"" + token + "\"}");
    }
}