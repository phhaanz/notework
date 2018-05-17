package com.notework.nw.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.Tag;
import com.notework.nw.entity.view.TagView;

@Repository
public class MyBatisTagDao implements TagDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<Tag> getList() {
		TagDao tagDao = sqlsession.getMapper(TagDao.class);
		List<Tag> tagList = tagDao.getList();

		return tagList;
	}
	
	@Override
	public List<Tag> getListByNoteId(Integer noteId) {
		TagDao tagDao = sqlsession.getMapper(TagDao.class);
		List<Tag> tagList = tagDao.getListByNoteId(noteId);
		
		return tagList;
	}
	
	@Override
	public List<Tag> getListByPresetId(Integer presetId) {
		TagDao tagDao = sqlsession.getMapper(TagDao.class);
		List<Tag> tagList = tagDao.getListByPresetId(presetId);
		
		return tagList;
	}
	
	@Override
	public List<TagView> getListByMemberId(String memberId) {
		TagDao tagDao = sqlsession.getMapper(TagDao.class);
		List<TagView> tagViewList = tagDao.getListByMemberId(memberId);
		
		return tagViewList;
	}
	@Override
	public List<TagView> getListById(@Param("memberId") String memberId, @Param("id") String id) {
		TagDao tagDao = sqlsession.getMapper(TagDao.class);
		List<TagView> tagViewList = tagDao.getListById(memberId, id);
		
		return tagViewList;
	}
	
	@Override
	public List<TagView> getFavListByMemberId(String memberId) {
		TagDao tagDao = sqlsession.getMapper(TagDao.class);
		List<TagView> favTagViewList = tagDao.getFavListByMemberId(memberId);
		
		return favTagViewList;
	}
	
	
	@Override
	public Tag get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Tag tag) {
		TagDao tagDao = sqlsession.getMapper(TagDao.class);
		int result = tagDao.insert(tag);
		return 0;
	}



}
