package com.notework.nw.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.NoteDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.dao.TagNoteDao;
import com.notework.nw.entity.Note;
import com.notework.nw.entity.Tag;
import com.notework.nw.entity.TagNote;
import com.notework.nw.entity.view.NoteView;

@Service("memberNoteService")
public class NoteService {
	
	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private TagDao tagDao;
	
	@Transactional
	public List<NoteView> getNoteListById(String writerId, Integer page) {
		List<NoteView> noteViews = noteDao.getListById(writerId);
		
		for(NoteView nv : noteViews)
		{
			List<Tag> tags = tagDao.getListByNoteId(nv.getId()); 
			if(tags !=null)
				nv.setTagList(tags);
		}
		
		return noteViews;
	}
	
	@Transactional
	public NoteView getNote(Integer id) {
		NoteView noteView = noteDao.get(id);
		
		return noteView;
	}

	@Transactional
	public int insertNote(Note note, String tags) {
		
		int noteId = noteDao.insert(note);

		String[] tagArray = tags.split("#");
		
		System.out.println(noteId);
		for(int i=0; i<tagArray.length; i++)
		{
			if(i == 0)
				continue;
			
			Tag tag = new Tag(tagArray[i]);
			tagDao.insert(tag);
			
			TagNote tagNote = new TagNote(noteId, tag.getId());
		/*	tagNoteDao.insert(tagNote);*/
		}
	
		return 0;
	}

	@Transactional
	public int updateNoteHit(Integer id) {
		
		int upResult = noteDao.updateHit(id);
		
		return 0;
	}
	
}
