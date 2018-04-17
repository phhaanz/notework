package com.notework.nw.dao;

import com.notework.nw.entity.Member;

public interface MemberDao {
	
	Member get(String id);
	
	int insert(Member member);
	
	int delete(String id);
	
}
