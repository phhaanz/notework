package com.notework.nw.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.ClipDao;
import com.notework.nw.entity.Clip;

@Repository
public class MyBatisClipDao implements ClipDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(Clip clip) {
		ClipDao clipDao = sqlSession.getMapper(ClipDao.class);
		
		int result = clipDao.insert(clip);
		
		return result;
	}

	@Override
	public Clip get(@Param("noteId")Integer noteId, @Param("memberId")String memberId) {
		ClipDao clipDao = sqlSession.getMapper(ClipDao.class);
		
		Clip result = clipDao.get(noteId, memberId);
		
		return result;
	}

	@Override
	public int delete(@Param("noteId")Integer noteId, @Param("memberId")String memberId) {
		ClipDao clipDao = sqlSession.getMapper(ClipDao.class);
		
		System.out.println(noteId);
		System.out.println(memberId);
		int result = clipDao.delete(noteId, memberId);
		
		System.out.println(result);
		
		return result;
	}

}
