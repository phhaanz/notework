package com.notework.nw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.notework.nw.entity.Tag;
import com.notework.nw.entity.view.TagView;

public interface TagDao {

	List<Tag> getList();
	
	List<Tag> getListByNoteId(int noteId);
	
	List<TagView> getListByWriterId(String writerId);

	List<TagView> getListByTagId(@Param("writerId") String writerId, @Param("tagId") String tagId);
	
	List<TagView> getFavListByWriterId(String writerId);
	
	Tag get(String id);

	int insert(Tag tag);


}
