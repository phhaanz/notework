package com.notework.nw.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notework.nw.dao.MemberDao;
import com.notework.nw.entity.Member;

@Repository
public class MyBatisMemberDao implements MemberDao {
	
	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public Member get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Member member) {
		
		MemberDao memberDao = sqlsession.getMapper(MemberDao.class);
		int result = memberDao.insert(member);
		
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
