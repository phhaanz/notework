package com.notework.nw.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.TagNoteDao;
import com.notework.nw.entity.TagNote;

@Repository
public class MyBatisTagNoteDao implements TagNoteDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public int insert(TagNote tagNote) {
		TagNoteDao tagNoteDao  = sqlsession.getMapper(TagNoteDao.class);
		tagNoteDao.insert(tagNote);
		
		return 0;
	}

}
