package com.example.attentioncontolbackend.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity(debug = false)
public class GameSecurityConfiguration extends WebSecurityConfigurerAdapter {


    //}
//    private final RestAuthenticationSuccessHandler authenticationSuccessHandler;
//    private final RestAuthenticationFailureHandler authenticationFailureHandler;
//    private final String secret;


//    public GameSecurityConfiguration(RestAuthenticationSuccessHandler authenticationSuccessHandler,
//                                     RestAuthenticationFailureHandler authenticationFailureHandler
//                                     @Value("${jwt.secret}") String secret) {
//                                      String secret) {
//    ) {
//        this.authenticationSuccessHandler = authenticationSuccessHandler;
//        this.authenticationFailureHandler = authenticationFailureHandler;
//        this.secret = "xxx";
//    }

    @Override @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.DELETE, "/api/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/api/**").permitAll()
                ;
    }

    ////                .and()
////
////                .formLogin("/login");
//
//        ;
////                .and()
////                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
////                .and()
////                .addFilter(authenticationFilter())
////                .addFilter(new JwtAuthorizationFilter(authenticationManager(), super.userDetailsService(), secret))
////                .exceptionHandling()
////                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));
//    }
//
//    @Bean
//    public JsonObjectAuthenticationFilter authenticationFilter() throws Exception {
//        JsonObjectAuthenticationFilter filter = new JsonObjectAuthenticationFilter();
//        filter.setAuthenticationSuccessHandler(authenticationSuccessHandler);
//        filter.setAuthenticationFailureHandler(authenticationFailureHandler);
//        filter.setAuthenticationManager(super.authenticationManager());
//        return filter;
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder.inMemoryAuthentication()
                .withUser("mati@mati.pl")
                .password("{noop}xxx")
                .roles("ADMIN");
    }
}
//}