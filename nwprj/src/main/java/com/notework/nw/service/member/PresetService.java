package com.notework.nw.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.dao.PresetDao;
import com.notework.nw.dao.PresetTagDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.Preset;
import com.notework.nw.entity.PresetTag;
import com.notework.nw.entity.Tag;
import com.notework.nw.entity.view.NoteView;
import com.notework.nw.entity.view.PresetView;

@Service
public class PresetService {

	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private PresetDao presetDao;

	@Autowired
	private TagDao tagDao;
	@Transactional
	public List<PresetView> getPresetList(String memberId) {
		List<PresetView> result = presetDao.getList(memberId);
		for(PresetView pv : result) {
			List<Tag> tags = tagDao.getListByPresetId(pv.getId());
			pv.setTagList(tags);
		}

		return result;
	}

	@Transactional
	public List<NoteView> getPresetNoteList(Integer id) {
		List<NoteView> result = noteDao.getListByPresetId(id);
		
		return result;
	}
}
