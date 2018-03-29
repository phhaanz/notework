<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" minimum-scale="1" user-scalable="1">
		
		<link rel="stylesheet" href="${root}/resources/css/header.css" type="text/css">
		<link rel="stylesheet" href="${root}/resources/css/footer.css" type="text/css">
		<link rel="stylesheet" href="${root}/resources/css/style.css" type="text/css">
		
		<title>레이아웃이다.</title>
	</head>
	
	<body>
		<!-- header -->
		<tiles:insertAttribute name="header" />
		
		<!-- main -->
		<tiles:insertAttribute name="main" />
		
		<!-- footer -->
		<tiles:insertAttribute name="footer" />
		
	</body>
</html>