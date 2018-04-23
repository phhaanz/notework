package com.notework.nw.dao;

import java.util.List;

import com.notework.nw.entity.Tag;

public interface TagDao {

	List<Tag> getList(Integer page);
	
	Tag get(Integer id);

	int insert(Tag tag); 
}
