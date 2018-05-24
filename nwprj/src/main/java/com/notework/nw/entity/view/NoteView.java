package com.notework.nw.entity.view;

import java.util.Date;
import java.util.List;

import com.notework.nw.entity.Note;
import com.notework.nw.entity.Tag;

public class NoteView extends Note {
	
	private List<Tag> tagList;
	
	private String writerName;
	private String writerProfileImage;
	private String thumb;
	private int commentCnt;
	private int clipCnt;
	
	public NoteView(int id, String title, String content, String writerId, int hit, Date regDate, Date accDate,
			boolean publish, String writerName, int commentCnt, int clipCnt) {
		super(id, title, content, writerId, hit, regDate, accDate, publish);
		this.writerName = writerName;
		this.commentCnt = commentCnt;
		this.clipCnt = clipCnt;
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
	public String getWriterProfileImage() {
		return writerProfileImage;
	}
	public void setWriterProfileImage(String writerProfileImage) {
		this.writerProfileImage = writerProfileImage;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public List<Tag> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
	public int getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}
	public int getClipCnt() {
		return clipCnt;
	}
	public void setClipCnt(int clipCnt) {
		this.clipCnt = clipCnt;
	}
	
}
