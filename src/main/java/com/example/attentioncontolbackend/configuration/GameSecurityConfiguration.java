package com.example.attentioncontolbackend.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class GameSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().and()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.DELETE, "/api/results/**").hasRole("ADMIN")
                .antMatchers("/api/**").permitAll()
//                .antMatchers(HttpMethod.GET, "/api/time").permitAll()
//                .antMatchers(HttpMethod.POST, "/api").permitAll()
////                .antMatchers(HttpMethod.GET, "/api/results").permitAll()
//                .antMatchers(HttpMethod.GET, "/api/score").permitAll()
                .anyRequest()
                .authenticated();
    }
}
