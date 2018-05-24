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
	public List<Image> getList(int noteId) {

		ImageDao imageDao = sqlsession.getMapper(ImageDao.class);
		List<Image> list = imageDao.getList(noteId);
		
		return list;
	}

	@Override
	public int insert(Image image) {
		ImageDao imageDao = sqlsession.getMapper(ImageDao.class);
		int result = imageDao.insert(image);
		
		return result;
	}

}
