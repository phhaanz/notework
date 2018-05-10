package com.notework.nw.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.NoteTagDao;
import com.notework.nw.entity.NoteTag;

@Repository
public class MyBatisNoteTagDao implements NoteTagDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public int insert(NoteTag noteTag) {
		NoteTagDao tagNoteDao  = sqlsession.getMapper(NoteTagDao.class);
		tagNoteDao.insert(noteTag);
		
		return 0;
	}

}
