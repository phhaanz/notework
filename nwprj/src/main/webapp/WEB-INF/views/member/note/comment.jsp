<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" minimum-scale="1" user-scalable="1">
		
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		
		<link rel="stylesheet" href="${root}/resources/css/common.css" type="text/css">
		<link rel="stylesheet" href="${root}/resources/css/style.css" type="text/css">
		
		<title>Notework. Stitch the Notes</title>
	</head>

	<jsp:include page="/WEB-INF/views/inc/note/detail-header.jsp" />

	<main class="main">
		<section id="top" class="comment-input">
			<h1>댓글 작성</h1>
			<form action="./comment/reg" method="post">
				<label class="hidden">댓글 내용</label>
				<textarea name="content"></textarea>
				<input type="submit" value="등록">
			</form>
		</section>
		<section class="comment-list">
			<h1>댓글 목록</h1>
			
			<c:if test="${empty commentList}">
			<div class="list-empty">
				<span>등록된 댓글이 없습니다.</span>
			</div>
			</c:if>
			<c:if test="${!empty commentList}">
			<ul>
				<c:forEach var="comment" items="${commentList}">
				<li>
					<table>
						<tr class="profile-image">
							<td rowspan="2"><img src="${root}/resources/upload/profile/${comment.writerId}/profile.jpg"></td>
						</tr>
						<tr>
							<td>
								<span>${comment.writerName}(${comment.writerId})</span>
								<a><img src="${root}/resources/images/note/ic_more_vert_black_24dp_re.png"></a>
							</td>
						</tr>
						<tr>
							<td colspan="2">${comment.content}</td>
						</tr>
						<tr>
							<td colspan="2"><fmt:formatDate value="${comment.regDate}" pattern="yyyy.MM.dd HH:mm:ss" /></td>
						</tr>
					</table>
				</li>
				</c:forEach>
			</ul>
			</c:if>
		</section>
	</main>
	<section class="top-anchor comment">
		<a href="#top"><img src="${root}/resources/images/ic_keyboard_capslock_white_24dp.png" alt="최상위로"></a>
	</section>
	<script>
	$(function(){
		$("#back-button").click(function(){
			location.href ="../${noteId}";
		});
	});
	</script>