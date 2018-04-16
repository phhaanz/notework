package com.notework.nw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.entity.Note;

@Service
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
