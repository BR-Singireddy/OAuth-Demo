package com.example.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	System.out.println("Verifying UserDatails");
    	Userpojo userpojo = new Userpojo();
    	userpojo.setUsername(email);
    	userpojo.setPassword("password");
    	List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		Athoritys auth = new Athoritys();
		auth.setAuthority("ROLE_CLIENT");
		Athoritys auth1 = new Athoritys();
		auth1.setAuthority("ROLE_ANDROID_CLIENT");
		authorities.add(auth);
		authorities.add(auth1);
		userpojo.setAuthorities(authorities);
        return userpojo;
        
    }
    
}
