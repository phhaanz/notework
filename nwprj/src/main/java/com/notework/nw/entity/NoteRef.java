package com.notework.nw.entity;

public class NoteRef {

	private int noteId;
	private int tagId;
	private String memeberId;
	
	public NoteRef() {

	}
	public NoteRef(int noteId, int tagId, String memeberId) {
		this.noteId = noteId;
		this.tagId = tagId;
		this.memeberId = memeberId;
	}
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public String getMemeberId() {
		return memeberId;
	}
	public void setMemeberId(String memeberId) {
		this.memeberId = memeberId;
	}
}
