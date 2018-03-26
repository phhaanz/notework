package com.notework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.notework.dao.NoteDao;
import com.notework.entity.Note;

public class NoteService 
{
	@Autowired
	private NoteDao noteDao;
	
	public List<Note> getNoteList(Integer page) 
	{
		List<Note> notes = noteDao.getList(page);
		
		return notes;
	}
	
	public Note getNote(Integer id) 
	{
		Note note = noteDao.get(id);
		
		return note;
	}
}
