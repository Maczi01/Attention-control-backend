package com.example.attentioncontolbackend.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
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
