package com.notework.nw.entity;

public class Clip {

	private int noteId;
	private String memberId;
	
	public Clip() {
		
	}
	public Clip(int noteId, String memberId) {
		this.noteId = noteId;
		this.memberId = memberId;
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
	
}
