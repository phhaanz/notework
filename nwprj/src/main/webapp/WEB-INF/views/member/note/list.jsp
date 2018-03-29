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
					<div><a href="${note.id}">${note.title}</a></div>
					<div>
							${note.content}
					</div>
					<div>
						<span>분류</span>
						<span>${note.regDate}</span>
					</div>
				</li>
				</c:forEach>
				
			</ul>
		</section>
	</div>
</main>
