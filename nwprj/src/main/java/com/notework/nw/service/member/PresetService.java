package com.notework.nw.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.PresetDao;
import com.notework.nw.dao.PresetTagDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.Preset;
import com.notework.nw.entity.PresetTag;
import com.notework.nw.entity.Tag;
import com.notework.nw.entity.view.PresetView;

@Service
public class PresetService {

	@Autowired
	private PresetDao presetDao;

	@Transactional
	public List<PresetView> getPresetList(String memberId) {
		
		List<PresetView> result = presetDao.getList(memberId);
		
		return result;
	}
}
