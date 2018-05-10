package com.notework.nw.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.entity.Note;
import com.notework.nw.entity.view.NoteView;

@Repository
public class MyBatisNoteDao implements NoteDao {
	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<NoteView> getList(Integer page) {
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);
		List<NoteView> result = noteDao.getList(page);
		
		return result;
	}
	
	@Override
	public List<NoteView> getListByWriterId(String writerId) {
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);
		List<NoteView> result = noteDao.getListByWriterId(writerId);
		
		return result;
	}

	@Override
	public NoteView get(Integer id) {
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);	
		NoteView result = noteDao.get(id);
		
		return result;
	}

	@Override
	public int insert(Note note) {
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);
		noteDao.insert(note);
		int noteId = note.getId();
		
		return noteId;
	}

	@Override
	public int updateHit(Integer id) {
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);
		int result = noteDao.updateHit(id);
		
		return result;
	}

	@Override
	public List<NoteView> getListByTitle(String title, String writerId) {
		NoteDao noteDao = sqlsession.getMapper(NoteDao.class);
		List<NoteView> resultList = noteDao.getListByTitle(title, writerId);
		
		return resultList;
	}

}
