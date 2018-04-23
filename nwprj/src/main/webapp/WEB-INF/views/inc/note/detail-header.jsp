<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header">
	<h1 class="hidden">헤더</h1>
	<nav class="note-menu">
		<h1 class="detail-title">누구님의 노트</h1>
		<ul>
			<li>
				<span id="more-button">
					<img src="${root}/resources/images/note/ic_more_vert_white_24dp.png" alt="메뉴 더 보기">
				</span>
			</li>
		</ul>
	</nav>
</header>