package com.notework.nw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.notework.nw.entity.Tag;
import com.notework.nw.entity.view.TagView;

public interface TagDao {

	List<Tag> getList();
	
	List<Tag> getListByNoteId(Integer noteId);
	
	List<Tag> getListByPresetId(Integer id);
	
	List<TagView> getListByMemberId(String memberId);

	List<TagView> getListById(@Param("memberId") String memberId, @Param("id") String id);
	
	List<TagView> getFavListByMemberId(String memberId);
	
	Tag get(String id);

	int insert(Tag tag);

}
