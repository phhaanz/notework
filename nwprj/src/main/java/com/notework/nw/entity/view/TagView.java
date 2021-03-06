package com.notework.nw.entity.view;

import com.notework.nw.entity.Tag;

public class TagView extends Tag {

	private int noteId;
	private int memberId;
	private int noteCnt;
	
	public TagView(String id,int noteId, int memberId, int noteCnt) {
		super(id);
		this.noteId = noteId;
		this.memberId = memberId;
		this.noteCnt = noteCnt;
	}
	public TagView() {

	}
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}	
	public int getNoteCnt() {
		return noteCnt;
	}
	public void setNoteCnt(int noteCnt) {
		this.noteCnt = noteCnt;
	}
}
