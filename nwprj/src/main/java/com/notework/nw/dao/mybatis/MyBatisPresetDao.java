package com.notework.nw.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.PresetDao;
import com.notework.nw.entity.Preset;

@Repository
public class MyBatisPresetDao implements PresetDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public int insert(Preset preset) {
		PresetDao presetDao = sqlsession.getMapper(PresetDao.class);
		presetDao.insert(preset);
		int presetId = preset.getId();
		
		return presetId;
	}

}
