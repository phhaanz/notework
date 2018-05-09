package com.notework.nw.entity.view;

import com.notework.nw.entity.Tag;

public class TagView extends Tag {

	private int noteCnt;

	public TagView(String id, int noteCnt) {
		super(id);
		this.noteCnt = noteCnt;
	}
	public TagView() {

	}
	public int getNoteCnt() {
		return noteCnt;
	}
	public void setNoteCnt(int noteCnt) {
		this.noteCnt = noteCnt;
	}
}