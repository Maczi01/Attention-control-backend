package com.example.attentioncontolbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;

//@RestController
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RequestMapping("/api")
public class LoginController {

//    @Autowired

    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;



//    @PostMapping(value = "/login")
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody User user) throws Exception {
//        Claims claims = Jwts.claims().setSubject(user.getEmail());
//        claims.put("userEmail", user.getEmail() + "");
//        claims.put("role", "ADMIN");
//        String xxx = Jwts.builder()
//                .setClaims(claims)
//                .signWith(SignatureAlgorithm.HS512, "xxx")
//                .compact();
//
//        return new ResponseEntity<String>(xxx, HttpStatus.ACCEPTED);

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



