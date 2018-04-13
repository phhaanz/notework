package com.notework.nw.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.prjentity.Note;

public class MyBatisNoteDao implements NoteDao 
{
	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<Note> getList(Integer page)
	{
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);
		List<Note> result = noteDao.getList(page);
		
		return result;
	}

	@Override
	public Note get(Integer id)
	{
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);	
		Note result = noteDao.get(id);
		
		return result;
	}

	@Override
	public int insert(Note note) {
		
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);
		int result = noteDao.insert(note);

		return result;
	}

}
