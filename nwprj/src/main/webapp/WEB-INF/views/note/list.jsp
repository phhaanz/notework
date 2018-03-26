<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>리스트다</title>
</head>
<body>
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




</body>
</html>