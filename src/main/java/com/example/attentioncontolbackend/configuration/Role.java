package com.example.attentioncontolbackend.configuration;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

    public static final String USER_ADMIN = "USER_ADMIN";
    public static final String AUTHOR_ADMIN = "AUTHOR_ADMIN";
    public static final String ADMIN = "ADMIN";

    private String authority;

    public Role(String authority) {
        this.authority = authority;
    }

    public static String getUserAdmin() {
        return USER_ADMIN;
    }

    public static String getAuthorAdmin() {
        return AUTHOR_ADMIN;
    }

    public static String getADMIN() {
        return ADMIN;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}