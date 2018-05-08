<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main class="main">
	<h1 class="hidden">태그 리스트</h1>
	<div class="root-container">
		<section class="tag-search">
			<h1>
				<span>#태그 검색</span>
			</h1>
			<form method="get">
				<input type="text" name="t" placeholder="검색할 태그명 입력">
				<input type="submit" value="검색">
			</form>
		</section>
		<section class="tag-list tag-all">
			<c:if test="${empty param.t}">		
			<h1><span>#내 전체 태그</span></h1>
			</c:if>
			<c:if test="${!empty param.t}">		
			<h1><span>#검색 내용</span></h1>
			</c:if>
			<c:if test="${empty tagList}">
			<div class="list-empty">
				<span>사용 중인 태그가 없습니다.</span>
			</div>
			</c:if>
			<c:if test="${!empty tagList}">
			<ul>
				<c:forEach var="tag" items="${tagList}">
				<li>
					<a href="">#${tag.id}</a>
				</li>
				</c:forEach>
			</ul>
			</c:if>
		</section>
	</div>
</main>
