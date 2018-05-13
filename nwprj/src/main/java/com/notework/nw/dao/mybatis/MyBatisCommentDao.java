package com.notework.nw.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.CommentDao;
import com.notework.nw.entity.Comment;
import com.notework.nw.entity.view.CommentView;

@Repository
public class MyBatisCommentDao implements CommentDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<CommentView> getList(Integer noteId) {
		CommentDao commentDao = sqlsession.getMapper(CommentDao.class);
		List<CommentView> result = commentDao.getList(noteId);
		
		return result;
	}

	@Override
	public int insert(Comment comment) {
		CommentDao commentDao = sqlsession.getMapper(CommentDao.class);
		int result = commentDao.insert(comment);
		
		return result;
	}

}
