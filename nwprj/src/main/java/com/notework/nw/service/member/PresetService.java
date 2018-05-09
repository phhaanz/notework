package com.notework.nw.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.PresetDao;
import com.notework.nw.dao.PresetTagDao;
import com.notework.nw.entity.Preset;

@Service
public class PresetService {

	@Autowired
	private PresetDao presetDao;

	@Autowired
	private PresetTagDao presetTagDao;
	
	@Transactional
	public int insertPreset(Preset preset) {
		
		int presetId = presetDao.insert(preset);
		int result = presetTagDao.insert(presetId, tagId);
		
		return 0;
	}
}
