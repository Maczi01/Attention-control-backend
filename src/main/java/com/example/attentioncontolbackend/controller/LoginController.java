package com.example.attentioncontolbackend.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class LoginController {

//    @Autowired

//    @Autowired
//    @Qualifier("authenticationManagerBean")
//    private AuthenticationManager authenticationManager;

    private final AuthenticationManager authenticationManager;

    @Autowired
    public LoginController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Value("${jwt.secret-key}")
    private String secretKey;

    @PostMapping(value = "/login")
    public String createAuthenticationToken(@RequestBody User user) throws Exception {
        try {
            Authentication authenticate = authenticationManager
                    .authenticate(
                            new UsernamePasswordAuthenticationToken(
                                    user.getEmail(), user.getPassword()
                            )
                    );


            System.out.println( "Principal" + authenticate.getPrincipal());



            Claims claims = Jwts.claims().setSubject(user.getEmail());
            claims.put("userEmail", user.getEmail() + "");
            claims.put("role", "ADMIN");
            String xxx = Jwts.builder()
                    .setClaims(claims)
                    .signWith(SignatureAlgorithm.HS512, secretKey)
                    .compact();
            System.out.println("Gottcha!");
            return xxx;
        } catch (Exception e) {
            System.out.println("Nope");
            return "nope";
        }
    }


//
//    @PostMapping(value = "/login")
//    public String createAuthenticationToken(@RequestBody User user) throws Exception {
//        Claims claims = Jwts.claims().setSubject(user.getEmail());
//        claims.put("userEmail", user.getEmail() + "");
//        claims.put("role", "ADMIN");
//        String xxx = Jwts.builder()
//                .setClaims(claims)
//                .signWith(SignatureAlgorithm.HS512, "xxx")
//                .compact();
//        System.out.println("Gottcha!");
//        return xxx;
//    }
//
//
//
//        JSONObject jsonObject = new JSONObject();
//        try {
//            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
//            if (authentication.isAuthenticated()) {
//                String email = user.getEmail();
//                jsonObject.put("name", authentication.getName());
//                jsonObject.put("authorities", authentication.getAuthorities());
//                jsonObject.put("token", tokenProvider.createToken(email, "ADMIN"));
//                return new ResponseEntity<String>(jsonObject.toString(), HttpStatus.OK);
//            }
//        } catch (JSONException e) {
//            try {
//                jsonObject.put("exception", e.getMessage());
//            } catch (JSONException e1) {
//                e1.printStackTrace();
//            }
//            return new ResponseEntity<String>(jsonObject.toString(), HttpStatus.UNAUTHORIZED);
//        }
//        return null;
}

//    private void authenticate(String username, String password) throws Exception {
//        Objects.requireNonNull(username);
//        Objects.requireNonNull(password);
//
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//        } catch (DisabledException e) {
//            throw new Exception("USER_DISABLED", e);
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        }
//    }


//        long l = System.currentTimeMillis();
//        System.out.println(user);
//        return Jwts.builder()
//                .setSubject(user.getEmail())
//                .claim("roles", "user")
//                .setIssuedAt(new Date(l))
//                .setExpiration(new Date(l + 50000))
//                .signWith(SignatureAlgorithm.HS512, user.getPassword())
//                .compact();



