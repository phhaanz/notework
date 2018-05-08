package com.notework.nw.entity;

public class TagNote {
	private int noteId;
	private String tagId;
	
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public String getTagId() {
		return tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
	public TagNote() {
		
	}
	public TagNote(int noteId, String tagId) {
		this.noteId = noteId;
		this.tagId = tagId;
	}
	
}
