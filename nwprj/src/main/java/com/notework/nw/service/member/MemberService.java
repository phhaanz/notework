package com.notework.nw.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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

	@Transactional
	public int updateMember(Member member) {
		
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = member.getPassword();
		String hashedPassword = encoder.encode(password);
		member.setPassword(hashedPassword);
		
		int result = memberDao.update(member);
		
		return result;
	}
}
