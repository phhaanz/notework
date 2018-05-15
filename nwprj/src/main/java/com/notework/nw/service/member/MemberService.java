package com.notework.nw.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.MemberDao;
import com.notework.nw.entity.Member;

@Service("memberService")
public class MemberService {

	@Autowired
	private MemberDao memberDao;

	@Transactional
	public Member getMember(String id) {
		
		Member member = memberDao.get(id);

		return member;
	}
}
