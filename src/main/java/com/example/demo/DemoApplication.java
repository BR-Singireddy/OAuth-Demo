package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
@ComponentScan("com.example")
@EnableCassandraRepositories("com.example.persistance")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
    private UserDetailsService userDetailsService;

	 @Autowired
	    public void authenticationManager(AuthenticationManagerBuilder builder) throws Exception {
	        builder.userDetailsService(userDetailsService);
	    }
}
