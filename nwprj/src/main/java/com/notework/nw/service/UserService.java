package com.notework.nw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notework.nw.dao.MemberDao;
import com.notework.nw.entity.Member;

@Service("userService")
public class UserService {

	@Autowired
	private MemberDao memberDao;
	
	public int insertMember(Member member) {
		
		int result = memberDao.insert(member);
		
		return result;
	}

}
