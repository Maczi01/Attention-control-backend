package com.example.attentioncontolbackend.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.setAuthenticationManager(authenticationManager);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws
            IOException, ServletException, IOException {

        Claims claims = new DefaultClaims();
        HashMap<String, Object> responseBody = new HashMap<>();

        String username = ((UserDetails) authResult.getPrincipal()).getUsername();

        List<String> authorities = authResult.getAuthorities().stream()
                .map(role -> role.getAuthority())
                .collect(Collectors.toList());
        claims.put("authorities", authorities);

        String token = JwtTokenService.generateToken(username, claims);
        System.out.println("Token token token" + token);
        responseBody.put("token", token);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        new ObjectMapper().writeValue(response.getWriter(), responseBody);
    }
}
