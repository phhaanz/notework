<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<footer class="footer">
	<h1 class="hidden">푸터</h1>
	<nav class="footer-menu">
		<h1 class="hidden">푸터 메뉴</h1>
		<ul>
			<li><a href="">아이디찾기</a></li>
			<li><a href="">비밀번호찾기</a></li>
			<li><a href="${ctx}/user/join">회원가입</a></li>
		</ul>
	</nav>
	<div>
		Copyright © 2018 by NoteWork
	</div>
</footer>