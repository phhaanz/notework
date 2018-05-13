package com.notework.nw.entity.view;

import java.util.Date;

import com.notework.nw.entity.Comment;

public class CommentView extends Comment {

	private String writerName;

	public CommentView() {

	}
	public CommentView(int id, int noteId, String writerId, String content, Date regDage, String writerName) {
		super(id, noteId, writerId, content, regDage);
		this.writerName = writerName;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
}
