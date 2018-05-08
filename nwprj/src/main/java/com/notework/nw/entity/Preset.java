package com.notework.nw.entity;

public class Preset {

	private int id;
	private String name;
	private String memberId;
	private String description;
	
	public Preset() {
		
	}
	public Preset(String name, String memberId, String description) {
		this.name = name;
		this.memberId = memberId;
		this.description = description;
	}
	public Preset(int id, String name, String memberId, String description) {
		this.id = id;
		this.name = name;
		this.memberId = memberId;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
