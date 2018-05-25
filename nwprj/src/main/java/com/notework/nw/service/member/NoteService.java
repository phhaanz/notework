package com.notework.nw.service.member;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.ClipDao;
import com.notework.nw.dao.NoteDao;
import com.notework.nw.dao.TagDao;
import com.notework.nw.dao.CommentDao;
import com.notework.nw.dao.ImageDao;
import com.notework.nw.dao.NoteTagDao;
import com.notework.nw.entity.Clip;
import com.notework.nw.entity.Comment;
import com.notework.nw.entity.Image;
import com.notework.nw.entity.Note;
import com.notework.nw.entity.Tag;
import com.notework.nw.entity.NoteTag;
import com.notework.nw.entity.view.CommentView;
import com.notework.nw.entity.view.NoteView;

@Service("memberNoteService")
public class NoteService {
	
	@Autowired
	private NoteDao noteDao;
	
	@Autowired
	private ImageDao imageDao;
	
	@Autowired
	private TagDao tagDao;
	
	@Autowired
	private NoteTagDao tagNoteDao;
	
	@Autowired
	private ClipDao clipDao;
	
	@Autowired
	private CommentDao commentDao;
	
	@Transactional
	public List<NoteView> getNoteListByWriterId(String writerId, Integer page) {
		
		List<NoteView> noteList = noteDao.getListByWriterId(writerId);
		
		for(NoteView nv : noteList)
		{
			Image image = imageDao.getFirst(nv.getId());
			if(image != null)
				nv.setThumb(image.getImageName());
			
			List<Tag> tags = tagDao.getListByNoteId(nv.getId()); 
			nv.setTagList(tags);
		}
		
		return noteList;
	}
	
	@Transactional
	public NoteView getNote(Integer id) {
		NoteView noteView = noteDao.get(id);
		List<Image> images = imageDao.getList(id);
		
		String path = "/nwprj/resources/upload/note/"+String.valueOf(noteView.getId())+"/";
		
		Document doc = Jsoup.parse(noteView.getContent());
		Elements img = doc.select("img");
		
		for(int i=0; i<images.size(); i++) {
			img.eq(i).attr("src", path+images.get(i).getImageName());
		}
		
		noteView.setContent(doc.toString());
		
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
	
		return noteId;
	}

	@Transactional
	public int updateNoteHit(Integer id) {
		
		int upResult = noteDao.updateHit(id);
		
		return 0;
	}

	@Transactional
	public int insertClip(Integer noteId, String memberId) {
		
		int result = 0;
		Clip clip = clipDao.get(noteId, memberId);
				
		if(clip == null) {
			clip = new Clip(noteId, memberId);
			result = clipDao.insert(clip);
		}
		else {
			clipDao.delete(noteId, memberId);
		}
		
		return result;
	}

	@Transactional
	public List<CommentView> getCommentList(Integer noteId) {
		
		List<CommentView> commentList = commentDao.getList(noteId);
		
		return commentList;
	}

	@Transactional
	public int insertComment(Comment comment) {
		
		int result = commentDao.insert(comment);
		
		return result;
	}


	@Transactional
	public int getClipCount(Integer noteId) {

		int cnt = clipDao.getCount(noteId);
		
		return cnt;
	}

	@Transactional
	public int insertImage(Image image) {
		
		
		int result = imageDao.insert(image);
		
		return result;
	}
	
}
