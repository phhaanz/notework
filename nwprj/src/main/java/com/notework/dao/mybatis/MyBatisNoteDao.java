package com.notework.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.notework.dao.NoteDao;
import com.notework.entity.Note;

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

}
