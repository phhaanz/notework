package com.notework.nw.service.member;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.view.NoteView;

@Service("memberSearchService")
public class SearchService {

	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private TagDao tagDao;
	
	public List<NoteView> getNoteListByTitle(String title, String writerId) {
		
		List<NoteView> noteList = noteDao.getListByTitle(title, writerId);
		
		return noteList;
	}
	
	public List<NoteView> getNoteListByTags(Map<String, Object> tags, String writerId) {
		
		List<NoteView> noteList = noteDao.getListByTags(tags, writerId);
		
		return null;
	}

}
