package com.notework.nw.prjentity;

import java.util.Date;

public class Note 
{
	private long id;
	private String title;
	private String content;
	private String writerId;
	private Date regDate;
	private int hit;
	private int order;
	private long chapterId;
	
	public Note() {
		// TODO Auto-generated constructor stub
	}
	public Note(String title, String content, String writerId) {
		this.title = title;
		this.content = content;
		this.writerId = writerId;
	}
	public Note(long id, String title, String content, String writerId, Date regDate, int hit, int order,
			long chapterId) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writerId = writerId;
		this.regDate = regDate;
		this.hit = hit;
		this.order = order;
		this.chapterId = chapterId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public long getChapterId() {
		return chapterId;
	}
	public void setChapterId(long chapterId) {
		this.chapterId = chapterId;
	}
}
