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
		
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		
		<link rel="stylesheet" href="${root}/resources/css/reset.css" type="text/css">
		<link rel="stylesheet" href="${root}/resources/css/note/header.css" type="text/css">
		<link rel="stylesheet" href="${root}/resources/css/note/style.css" type="text/css">
		
		<title>노트 레이아웃이다.</title>
	</head>
	
	<body>
		<!-- header -->
		<tiles:insertAttribute name="header" />

		<!-- main -->
		<tiles:insertAttribute name="main" />
	</body>
</html>