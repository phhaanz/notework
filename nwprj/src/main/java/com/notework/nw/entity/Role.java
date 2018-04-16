package com.notework.nw.entity;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority{

	private String authority;
	private String description;
	
	@Override
	public String getAuthority() {
		
		/*return authority;*/
		return "AUTHOR";
	}

	public String getDescription() {
		return description;
	}

	
}
