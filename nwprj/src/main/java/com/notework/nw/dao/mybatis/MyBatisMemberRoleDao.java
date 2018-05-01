package com.notework.nw.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.MemberRoleDao;
import com.notework.nw.entity.MemberRole;

@Repository
public class MyBatisMemberRoleDao implements MemberRoleDao {

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public MemberRole get(String memberId, String roleId) {

		MemberRoleDao memberRoleDao = sqlsession.getMapper(MemberRoleDao.class);
		MemberRole memberRole = memberRoleDao.get(memberId, roleId);
		
		return memberRole;
	}

	@Override
	public int insert(MemberRole memberRole) {
		MemberRoleDao memberRoleDao = sqlsession.getMapper(MemberRoleDao.class);
		int result = memberRoleDao.insert(memberRole);
		
		return 0;
	}

	@Override
	public int delete(String memberId, String roleId) {
		MemberRoleDao memberRoleDao = sqlsession.getMapper(MemberRoleDao.class);
		int result = memberRoleDao.delete(memberId, roleId);
		
		return 0;
	}

}
