package com.notework.nw.dao;

import java.util.List;

import com.notework.nw.entity.Image;

public interface ImageDao {

	int insert(Image image);
	
	List<Image> getList(int noteId);
}
