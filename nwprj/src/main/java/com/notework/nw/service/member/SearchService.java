package com.notework.nw.service.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.NoteTag;
import com.notework.nw.entity.Tag;
import com.notework.nw.entity.view.NoteView;

@Service("memberSearchService")
public class SearchService {

	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private TagDao tagDao;
	
	public List<NoteView> getNoteListByTitle(String title, String writerId) {
		
		List<NoteView> noteList = noteDao.getListByTitle(title, writerId);
		
		for(NoteView n : noteList)
		{
			List<Tag> tagList = tagDao.getListByNoteId(n.getId());
			n.setTagList(tagList);
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
		
		for(NoteView n : noteList)
		{
			List<Tag> tagList = tagDao.getListByNoteId(n.getId());
			n.setTagList(tagList);
		}
	
		return noteList;
	}

}
