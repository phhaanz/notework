package com.notework.nw.entity.view;

import java.util.Date;
import java.util.List;

import com.notework.nw.entity.Note;
import com.notework.nw.entity.Tag;

public class NoteView extends Note {
	
	private List<Tag> tagList;
	private String writerName;
	
	public NoteView(int id, String title, String content, String writerId, int hit, Date regDate, Date accDate,
			boolean publish, String writerName) {
		super(id, title, content, writerId, hit, regDate, accDate, publish);
		this.writerName = writerName;
	}
	public NoteView() {
		// TODO Auto-generated constructor stub
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public List<Tag> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
	
	
	
	
}
