package com.notework.nw.dao;

import com.notework.nw.entity.MemberRole;

public interface MemberRoleDao {
	MemberRole get(String memberId, String roleId);
	
	int insert(MemberRole memberRole);
	
	int delete(String memberId, String roleId);
}
