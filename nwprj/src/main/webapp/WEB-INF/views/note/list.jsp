<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main>
	<section>
		<ul>
			<c:forEach var="note" items="${notes}">
				<li>
					<div><a href="${note.id}">${note.title}</a></div>
					<div>${note.content}</div>
					<div>${note.writerId}</div>
					<div>${note.regDate}</div>
				</li>
			</c:forEach>
		</ul>
	</section>
</main>