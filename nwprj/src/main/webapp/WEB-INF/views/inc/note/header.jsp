<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header">
	<h1 class="hidden">헤더</h1>
	<nav class="main-menu">
		<h1 class="hidden">헤더 메뉴</h1>
		<ul>
			<li><span id="hamburger-button"><img src="${root}/resources/images/ic_menu_white_24dp.png" alt="메인 메뉴"></span></li>
		</ul>
	</nav>
	<div class="current-context">
		<span>Label-CurrentPage</span>
	</div>
</header>