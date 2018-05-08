package com.notework.nw.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.TagDao;
import com.notework.nw.entity.view.TagView;

@Service("memberTagService")
public class TagService {

	@Autowired
	private TagDao tagDao;
	
	@Transactional
	public List<TagView> getTagListByWriterId(String writerId)
	{
		List<TagView> tagViewList = tagDao.getListByWriterId(writerId);
		
		return tagViewList;
	}
	
	@Transactional
	public List<TagView> getTagFavListByWriterId(String writerId)
	{
		List<TagView> favTagViewList = tagDao.getFavListByWriterId(writerId);
		
		return favTagViewList;
	}

	@Transactional
	public List<TagView> getTagListByTagId(String writerId, String tagId) 
	{
		List<TagView> tagViewList = tagDao.getListByTagId(writerId, tagId);
		
		return tagViewList;
	}
	
}
