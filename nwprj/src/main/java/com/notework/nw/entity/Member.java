package com.notework.nw.entity;

public class Member {
	
	private String id;
	private String password;
	private String name;
	private String email;
	private String introduce;

	public Member() {

	}

	public Member(String id, String password, String name, String email, String introduce) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.introduce = introduce;
	}

	public Member(String password) {
		this.password = password;
	}

	public Member(String name, String email, String introduce) {
		this.name = name;
		this.email = email;
		this.introduce = introduce;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
}
