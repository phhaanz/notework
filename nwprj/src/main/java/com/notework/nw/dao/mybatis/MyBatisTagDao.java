package com.notework.nw.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.Tag;

@Repository
public class MyBatisTagDao implements TagDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<Tag> getList() {
		TagDao tagDao = sqlsession.getMapper(TagDao.class);
		List<Tag> tagList = tagDao.getList();
		
		
		return tagList;
	}

	@Override
	public Tag get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Tag tag) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
