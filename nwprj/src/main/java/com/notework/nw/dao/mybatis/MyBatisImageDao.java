package com.notework.nw.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.ImageDao;
import com.notework.nw.entity.Image;

@Repository
public class MyBatisImageDao implements ImageDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public Image getFirst(int noteId) {
		ImageDao imageDao = sqlsession.getMapper(ImageDao.class);
		Image result  = imageDao.getFirst(noteId);

		return result;
	}
	
	@Override
	public List<Image> getList(int noteId) {

		ImageDao imageDao = sqlsession.getMapper(ImageDao.class);
		List<Image> result = imageDao.getList(noteId);
		
		return result;
	}

	@Override
	public int insert(Image image) {
		ImageDao imageDao = sqlsession.getMapper(ImageDao.class);
		int result = imageDao.insert(image);
		
		return result;
	}

}
