package com.notework.nw.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.PresetTagDao;
import com.notework.nw.entity.PresetTag;

@Repository
public class MyBatisPresetTagDao implements PresetTagDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(PresetTag presetTag) {
		PresetTagDao presetTagDao = sqlSession.getMapper(PresetTagDao.class);
		int result = presetTagDao.insert(presetTag);
		
		return result;
	}

}
