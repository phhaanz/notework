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
	public List<TagView> getTagListByMemberId(String memberId)
	{
		List<TagView> tagList = tagDao.getListByMemberId(memberId);
		
		return tagList;
	}
	
	@Transactional
	public List<TagView> getTagFavListByMemberId(String memberId)
	{
		List<TagView> favTagList = tagDao.getFavListByMemberId(memberId);
		
		return favTagList;
	}

	@Transactional
	public List<TagView> getTagListById(String memberId, String id) 
	{
		List<TagView> tagList = tagDao.getListById(memberId, id);
		
		return tagList;
	}
	
}
