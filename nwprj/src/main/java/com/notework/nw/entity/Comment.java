package com.notework.nw.entity;

import java.util.Date;

public class Comment {

	private int id;
	private int noteId;
	private String memberId;
	private String content;
	private Date regDage;
	
	public Comment() {
		
	}

	public Comment(int noteId, String memberId, String content) {
		this.noteId = noteId;
		this.memberId = memberId;
		this.content = content;
	}

	public Comment(int id, int noteId, String memberId, String content, Date regDage) {
		this.id = id;
		this.noteId = noteId;
		this.memberId = memberId;
		this.content = content;
		this.regDage = regDage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDage() {
		return regDage;
	}

	public void setRegDage(Date regDage) {
		this.regDage = regDage;
	}
	
}
