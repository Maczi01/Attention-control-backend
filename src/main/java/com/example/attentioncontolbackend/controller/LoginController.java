package com.example.attentioncontolbackend.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {

    @PostMapping("/api/login")
    public String login(@RequestBody User user) {
        long l = System.currentTimeMillis();
        return Jwts.builder()
                .setSubject(user.getEmail())
                .claim("roles", "admin")
                .setIssuedAt(new Date(l))
                .setExpiration(new Date(l + 20000))
                .signWith(SignatureAlgorithm.HS512, user.getPassword())
                .compact();
    }


}
