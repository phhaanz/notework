package com.notework.nw.entity;

public class Preset {

	private int id;
	private String name;
	private String linkUrl;
	
	public Preset() {
		
	}
	public Preset(String name, String linkUrl) {
		this.name = name;
		this.linkUrl = linkUrl;
	}
	public Preset(int id, String name, String linkUrl) {
		this.id = id;
		this.name = name;
		this.linkUrl = linkUrl;
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
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
}
