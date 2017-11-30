package com.example.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.persistance.UserPersistance;
import com.example.persistance.UserPersistancePojo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserPersistance userPersistance;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
    	
    	System.out.println("Verifying UserDatails");
    	
    	List<UserPersistancePojo> users = userPersistance.findByName(name);
    	UserPersistancePojo pojo = users.get(0);
    	List<String> roles = Arrays.asList(pojo.getRole().split(","));
    	Userpojo userpojo = new Userpojo();
    	userpojo.setUsername(pojo.getName());
    	userpojo.setPassword(pojo.getPassword());
    	List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
    	roles.forEach(role -> {
    		Athoritys auth = new Athoritys();
    		auth.setAuthority(role);
    		authorities.add(auth);
    	});
		
		userpojo.setAuthorities(authorities);
		System.out.println(userpojo);
        return userpojo;
        
    }
    
}
