package com.notework.nw.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.notework.nw.entity.Note;
import com.notework.nw.entity.view.NoteView;

public interface NoteDao {

	List<NoteView> getList(Integer page);
	
	NoteView get(Integer id);

	int insert(Note note);

	int updateHit(Integer id);

	List<NoteView> getListByWriterId(String writerId);

	List<NoteView> getListByTitle(@Param("title") String title, @Param("writerId") String writerId);

	List<NoteView> getListByTags(Map<String, Object> tagMap);

	List<NoteView> getListByClip(String memberId);
}
