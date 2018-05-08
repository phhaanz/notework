package com.notework.nw.dao;

import java.util.List;

import com.notework.nw.entity.Tag;

public interface TagDao {

	List<Tag> getList();
	
	List<Tag> getListByNoteId(int noteId);
	
	Tag get(String id);

	int insert(Tag tag);
}
