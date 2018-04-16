package com.notework.nw.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.entity.Note;

@Service("memberNoteService")
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

	public int insertNote(Note note) {
		
		int result = noteDao.insert(note);
	
		return result;
	}
}
