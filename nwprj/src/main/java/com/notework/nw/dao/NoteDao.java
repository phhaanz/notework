package com.notework.nw.dao;

import java.util.List;

import com.notework.nw.entity.Note;
import com.notework.nw.entity.view.NoteView;

public interface NoteDao {

	List<NoteView> getList(Integer page);
	
	NoteView get(Integer id);

	int insert(Note note);

	int updateHit(Integer id);

	List<NoteView> getListById(String writerId);
	
}
