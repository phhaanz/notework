<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header">
	<h1 class="hidden">헤더</h1>
	<div>
		<h1 class="hidden">헤더 홈 로고</h1>	
		<a href="${root}/index">
			<img src="${root}/resources/images/logo_notework_1x.png" />
		</a>
	</div>
</header>