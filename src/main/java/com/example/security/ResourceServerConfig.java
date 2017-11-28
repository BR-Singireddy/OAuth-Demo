package com.example.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
    	System.out.println("HttpSecurity Initiated");
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/api/v1/**").authenticated()
                /* .and().httpBasic()
                .disable()
                .csrf().disable();*/
                ;
           // http.headers().frameOptions().sameOrigin();
    }
}