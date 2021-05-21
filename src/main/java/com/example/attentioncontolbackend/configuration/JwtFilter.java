package com.example.attentioncontolbackend.configuration;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class JwtFilter implements javax.servlet.Filter {

    @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String authorization = httpServletRequest.getHeader("Authorization");

        if(httpServletRequest == null || !authorization.startsWith("Bearer ")){
            throw new ServletException("Wrong");
        } else{
            String token = authorization.substring(7);
            Claims claims = Jwts.parser().setSigningKey("xxx").parseClaimsJws(token).getBody();
            request.setAttribute("claims", claims);
        }

    chain.doFilter(request, response);

        }
}
