<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" minimum-scale="1" user-scalable="1">
<link rel="stylesheet" href="../resources/style.css" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<header class="header">
		<h1>책 제목</h1>
		
		<nav class="main-menu">
			<h1 class="hidden">메인메뉴</h1>
			<ul>
				<li><img src="../resources/ic_menu_black_24dp_1x.png"></li>
				<li><a href=""><img src="../resources/ic_search_black_24dp_1x.png"></a></li>
				<!-- <li></li> -->
			</ul>
		</nav>
	</header>
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
</body>
</html>