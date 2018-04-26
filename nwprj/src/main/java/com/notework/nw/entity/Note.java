package com.notework.nw.entity;

import java.util.Date;

public class Note {
	
	private int id;
	private String title;
	private String content;
	private String writerId;
	private int hit;
	private Date regDate;
	private Date accDate;
	private boolean publish;
	
	public Note() {

	}
	
	public Note(String title, String content, String writerId, boolean publish) {
		this.title = title;
		this.content = content;
		this.writerId = writerId;
		this.publish = publish;
	}
	
	public Note(int id, String title, String content, String writerId, int hit, Date regDate, Date accDate,
			boolean publish) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writerId = writerId;
		this.hit = hit;
		this.regDate = regDate;
		this.accDate = accDate;
		this.publish = publish;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getAccDate() {
		return accDate;
	}
	public void setAccDate(Date accDate) {
		this.accDate = accDate;
	}
	public boolean isPublish() {
		return publish;
	}
	public void setPublish(boolean publish) {
		this.publish = publish;
	}
}
