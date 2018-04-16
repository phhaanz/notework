package com.notework.nw.entity;

public class Member {
	private String id;
	private String password;
	private String name;
	private String photo;

	public Member() {

	}
	public Member(String id, String password, String name, String photo) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.photo = photo;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
