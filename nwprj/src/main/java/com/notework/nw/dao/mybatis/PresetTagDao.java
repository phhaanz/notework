package com.notework.nw.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.entity.Preset;
import com.notework.nw.entity.PresetTag;

@Repository
public class PresetTagDao implements com.notework.nw.dao.PresetTagDao {

	@Autowired
	private SqlSession sqlsession;

	@Override
	public int insert(PresetTag presetTag) {
		PresetTagDao presetTagDao =  sqlsession.getMapper(PresetTagDao.class);
		int result  = presetTagDao.insert(presetTag);
		
		return result;
	}
}
