<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main class="main">
	<div>
		<section class="note-list">
			<h1 class="hidden">노트 목록</h1>
			<ul>
				<c:forEach var="note" items="${notes}">	
				<li>
					<div>
						<img src>이미지미리보기
					</div>
					<div>
						<span>조회수</span><span>클립수</span><span>댓글수</span>
					</div>
					<div><a href="${note.id}">${note.title}</a></div>
					<div>
						<span>분류</span>
						<span>${note.regDate}</span>
					</div>
					<div>
						<a>태그1</a><a>태그2</a><a>태그3</a>
					</div>
				</li>
				</c:forEach>
				
			</ul>
		</section>
	</div>
</main>
