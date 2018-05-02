<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header common-header">
	<h1 class="title">메인</h1>
	<nav class="hor-menu main-menu">
		<h1 class="hidden">헤더 메뉴</h1>	
		<ul class="icon-bar">
			<li>
				<span id="hamburger-button">
					<img src="${root}/resources/images/ic_menu_24dp_2x.png" alt="메인 메뉴">
				</span>
			</li>
			<li>
				<a href="${root}/member/index">
					<img src="${root}/resources/images/ic_account_circle_24dp_2x.png" alt="회원 메뉴">
				</a>
			</li>
		</ul>
	</nav>
</header>