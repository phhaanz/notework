package com.notework.nw.entity;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;


import org.springframework.security.core.userdetails.UserDetails;

public class MemberAuthView extends Member implements UserDetails{

	private String id;
	private String password;
	private String name;
	private Set<> authorities;
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = 
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
