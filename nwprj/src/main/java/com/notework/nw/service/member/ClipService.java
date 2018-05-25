package com.notework.nw.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.ImageDao;
import com.notework.nw.dao.NoteDao;
import com.notework.nw.entity.Image;
import com.notework.nw.entity.view.NoteView;

@Service("memberClipService")
public class ClipService {

	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private ImageDao imageDao;
	
	@Transactional
	public List<NoteView> getNoteListByClip(String memberId) {
		
		List<NoteView> noteList  = noteDao.getListByClip(memberId);
		for(NoteView nv : noteList) {
			Image image = imageDao.getFirst(nv.getId());
			if(image != null)
				nv.setThumb(image.getImageName());
		}
		return noteList;
	}
}
