<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header note-detail-header">
	<c:if test="${!empty noteView}">
	<h1 class="title">${noteView.writerName} 님의 노트</h1>
	</c:if>
	<c:if test="${empty noteView}">
	<h1 class="title">이 노트의 댓글</h1>
	</c:if>
	<nav class="hor-menu note-detail-menu">
		<h1 class="hidden">노트 메뉴</h1>
		<ul class="icon-bar">
			<li>
				<c:if test="${!empty noteView}">
				<span id="more-button">
					<img src="${root}/resources/images/note/ic_more_vert_white_24dp.png" alt="메뉴 더 보기">
				</span>
				<ul class="hidden">
					<li><a href="">수정</a></li>
					<li><a href="">삭제</a></li>
					<li><a href="">닫기</a></li>
				</ul>
				</c:if>
				<c:if test="${empty noteView}">
				<span id="back-button">
					<img src="${root}/resources/images/note/baseline_reply_white.png" alt="이전으로">
				</span>
				</c:if>
			</li>
		</ul>
	</nav>
</header>