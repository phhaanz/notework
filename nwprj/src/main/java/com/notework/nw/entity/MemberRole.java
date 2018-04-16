package com.notework.nw.entity;

public class MemberRole {
	private String memberId;
	private String RoleId;

	public MemberRole() {
	}
	public MemberRole(String memberId, String roleId) {
		this.memberId = memberId;
		this.RoleId = roleId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getRoleId() {
		return RoleId;
	}
	public void setRoleId(String roleId) {
		RoleId = roleId;
	}
}
