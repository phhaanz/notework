package com.notework.nw.entity;

public class Image {

	private int id;
	private int noteId;
	private String imageName;
	
	public Image() {
		// TODO Auto-generated constructor stub
	}

	public Image(int noteId, String imageName) {
		this.noteId = noteId;
		this.imageName = imageName;
	}

	public Image(int id, int noteId, String imageName) {
		this.id = id;
		this.noteId = noteId;
		this.imageName = imageName;
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
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
}
