package com.notework.nw.entity;

import java.util.Date;

public class Comment {

	private int id;
	private int noteId;
	private String writerId;
	private String content;
	private Date regDate;
	
	public Comment() {
		
	}

	public Comment(int noteId, String writerId, String content) {
		this.noteId = noteId;
		this.writerId = writerId;
		this.content = content;
	}

	public Comment(int id, int noteId, String writerId, String content, Date regDate) {
		this.id = id;
		this.noteId = noteId;
		this.writerId = writerId;
		this.content = content;
		this.regDate = regDate;
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

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}
