package com.example.security;

import org.springframework.security.core.GrantedAuthority;

public class Athoritys implements GrantedAuthority{

	private String authority;
	
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}


	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}
	
}
