<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header">
	<h1 class="hidden">헤더</h1>
	<nav class="main-menu">
		<h1 class="hidden">노트</h1>
		<ul>
			<li><span id="back-button"><img src="${root}/resources/images/note/ic_chevron_left_white_24dp.png" alt="뒤로가기 버튼"></span></li>
		</ul>
	</nav>
</header>