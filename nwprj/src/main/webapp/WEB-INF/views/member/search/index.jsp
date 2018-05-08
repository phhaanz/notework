<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
	<h1 class="hidden">태그 리스트</h1>
	<div class="root-container">
		<section class="search-input search-title">
			<h1>
				<img src="${root}/resources/images/search/ic_search_black_24dp.png">
				<span>제목으로 검색</span>
			</h1>
			<form action="result" method="get">
				<input type="text" name="title" placeholder="노트 제목 입력">
				<input type="submit" value="검색">
			</form>
		</section>
		<section class="search-input search-tag">
			<h1>
				<img src="${root}/resources/images/search/ic_search_black_24dp.png">
				<span>태그 조합으로 검색</span>
			</h1>
			<form action="result" method="get">
				<input type="text" name="tag" placeholder="태그명 입력">
				<input type="submit" value="검색">
			</form>
		</section>	
	</div>
</main>
