package com.notework.nw.service.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.dao.PresetDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.Preset;
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
		
		PresetView preset = presetDao.get(id);
		String[] tagArray = preset.getLinkAddress().split("#");
		Map<String, Object> tagMap = new HashMap<String, Object>();

		String tags;
		
		for(int i=0; i< 5; i++) {
			
			if(i < (tagArray.length-1))
				tags = tagArray[i+1];
			else
				tags = null;
			
			tagMap.put("tag"+String.valueOf(i+1), tags);
		}
		
		tagMap.put("writerId", preset.getMemberId());
		tagMap.put("size", tagArray.length - 1);
		List<NoteView> noteList = noteDao.getListByTags(tagMap);
		
		for(NoteView n : noteList)
		{
			List<Tag> tagList = tagDao.getListByNoteId(n.getId());
			n.setTagList(tagList);
		}
		
		return noteList;
	}

	@Transactional
	public Preset getPreset(Integer id) {
		Preset preset = presetDao.get(id);
		
		return preset;
	}
}
