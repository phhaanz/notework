package com.notework.nw.dao;

import org.apache.ibatis.annotations.Param;

import com.notework.nw.entity.Clip;

public interface ClipDao {

	int insert(Clip clip);

	Clip get(@Param("noteId")Integer noteId, @Param("memberId")String memberId);

	int delete(@Param("noteId")Integer noteId, @Param("memberId")String memberId);

}
