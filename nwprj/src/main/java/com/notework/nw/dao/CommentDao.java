package com.notework.nw.dao;

import java.util.List;

import com.notework.nw.entity.Comment;
import com.notework.nw.entity.view.CommentView;

public interface CommentDao {

	List<CommentView> getList(Integer noteId);

	int insert(Comment comment);

}
