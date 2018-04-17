<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header">
	<h1 class="hidden">헤더</h1>
	<nav class="main-menu">
		<h1 class="hidden">헤더 메뉴</h1>	
		<ul>
			<li><a id="hamburger-button" href=""><img src="${root}/resources/images/ic_menu_white_24dp.png" alt="메인 메뉴"></a></li>
			<li><a href=""><img src="${root}/resources/images/ic_account_box_white_24dp.png" alt="회원 메뉴"></a></li>
		</ul>
	</nav>
</header>