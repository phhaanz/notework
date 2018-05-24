package com.notework.nw.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.entity.view.NoteView;

@Service("memberClipService")
public class ClipService {

	@Autowired
	private NoteDao noteDao;
	
	@Transactional
	public List<NoteView> getNoteListByClip(String memberId) {
		
		List<NoteView> noteViews  = noteDao.getListByClip(memberId);
		
		return noteViews;
	}
}
