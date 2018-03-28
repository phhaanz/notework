package com.notework.dao;

import java.util.List;

import com.notework.entity.Note;

public interface NoteDao {

	List<Note> getList(Integer page);
	
	Note get(Integer id);

	int insert(Note note);
	
}
