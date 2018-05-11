package com.notework.nw.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.dao.NoteTagDao;
import com.notework.nw.entity.Note;
import com.notework.nw.entity.Tag;
import com.notework.nw.entity.NoteTag;
import com.notework.nw.entity.view.NoteView;

@Service("memberNoteService")
public class NoteService {
	
	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private TagDao tagDao;
	
	@Autowired
	private NoteTagDao tagNoteDao;
	
	@Transactional
	public List<NoteView> getNoteListByWriterId(String writerId, Integer page) {
		List<NoteView> noteViews = noteDao.getListByWriterId(writerId);
		
		for(NoteView nv : noteViews)
		{
			List<Tag> tags = tagDao.getListByNoteId(nv.getId()); 

			nv.setTagList(tags);
		}
		
		return noteViews;
	}
	
	@Transactional
	public NoteView getNote(Integer id) {
		NoteView noteView = noteDao.get(id);
		
		List<Tag> tagList = tagDao.getListByNoteId(id); 
			
		noteView.setTagList(tagList);
		
		return noteView;
	}

	@Transactional
	public int insertNote(Note note, String tags) {
		
		int noteId = noteDao.insert(note);

		String[] tagArray = tags.split("#");
		
		for(int i=0; i<tagArray.length; i++)
		{
			if(i == 0)
				continue;
			
			Tag tag = new Tag(tagArray[i]);
			tagDao.insert(tag);
			
			NoteTag noteTag = new NoteTag(noteId, tag.getId());
			int result = tagNoteDao.insert(noteTag);
		}
	
		return 0;
	}

	@Transactional
	public int updateNoteHit(Integer id) {
		
		int upResult = noteDao.updateHit(id);
		
		return 0;
	}
	
}
