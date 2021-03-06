package com.notework.nw.service.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.ImageDao;
import com.notework.nw.dao.NoteDao;
import com.notework.nw.dao.PresetDao;
import com.notework.nw.dao.PresetTagDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.Image;
import com.notework.nw.entity.NoteTag;
import com.notework.nw.entity.Preset;
import com.notework.nw.entity.PresetTag;
import com.notework.nw.entity.Tag;
import com.notework.nw.entity.view.NoteView;

@Service("memberSearchService")
public class SearchService {

	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private ImageDao imageDao;
	
	@Autowired
	private TagDao tagDao;

	@Autowired
	private PresetDao presetDao;
	
	@Autowired
	private PresetTagDao presetTagDao;
	
	public List<NoteView> getNoteListByTitle(String title, String writerId) {
		
		List<NoteView> noteList = noteDao.getListByTitle(title, writerId);
		
		for(NoteView nv : noteList)
		{
			Image image = imageDao.getFirst(nv.getId());
			if(image != null)
				nv.setThumb(image.getImageName());
			
			List<Tag> tagList = tagDao.getListByNoteId(nv.getId());
			nv.setTagList(tagList);
		}
		
		return noteList;
	}
	
	public List<NoteView> getNoteListByTags(String tags, String writerId) {		
		String[] tagArray = tags.split("#");
		Map<String, Object> tagMap = new HashMap<String, Object>();

		for(int i=0; i< 5; i++)
		{
			if(i < (tagArray.length-1))
				tags = tagArray[i+1];
			else
				tags = null;
			
			tagMap.put("tag"+String.valueOf(i+1), tags);
		}
		
		tagMap.put("writerId", writerId);
		tagMap.put("size", tagArray.length - 1);
		
		List<NoteView> noteList = noteDao.getListByTags(tagMap);
		
		for(NoteView nv : noteList)
		{
			Image image = imageDao.getFirst(nv.getId());
			if(image != null)
				nv.setThumb(image.getImageName());
			
			List<Tag> tagList = tagDao.getListByNoteId(nv.getId());
			nv.setTagList(tagList);
		}
	
		return noteList;
	}
	
	@Transactional
	public int insertPreset(Preset preset) {
		
		String[] tags = preset.getLinkAddress().split("#");

		String newTags = "";
		//중복 쳐내기
		for(int i=0; i<tags.length; i++) {
			 if(tags[i]==null || tags[i].equals(""))
				continue;
			 else {
				newTags += ("#"+tags[i]);
			 
				for(int j=i+1; j<tags.length; j++) {
					if(tags[i].equals(tags[j]))
						tags[j] = null;
				}
			 }
		}
		//중복 쳐낸 새로운 태그 삽입
		preset.setLinkAddress(newTags);
		
		int presetId = presetDao.insert(preset);
		int ptResult = 0;
		for(String t : tags)	{
			if(t==null || t.equals(""))
				continue;
			tagDao.insert(new Tag(t));
			ptResult = presetTagDao.insert(new PresetTag(presetId, t));
		}
		
		return ptResult;
	}

}
