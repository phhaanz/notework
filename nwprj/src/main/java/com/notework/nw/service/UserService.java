package com.notework.nw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notework.nw.dao.MemberDao;
import com.notework.nw.dao.MemberRoleDao;
import com.notework.nw.entity.Member;
import com.notework.nw.entity.MemberRole;

@Service("userService")
public class UserService {

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private MemberRoleDao memberRoleDao;

	@Transactional
	public int insertMember(Member member, MemberRole memberRole) {
		
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = member.getPassword();
		String hashedPassword = encoder.encode(password);
		
		String memberId = member.getId();
		String roleId = "ROLE_MEMBER";
		member.setPassword(hashedPassword);
		
		memberRole.setMemberId(memberId);
		memberRole.setRoleId(roleId);
		
		int result = memberDao.insert(member);
		int reee = memberRoleDao.insert(memberRole);
		
		return result;
	}

}
