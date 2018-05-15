<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
	<h1 class="hidden">태그 리스트</h1>
	<div class="root-container">
		<section class="tag-none">
			<h1>
				<a href="${root}/search/list-by-tags">태그 없음<span>(갯수)</span></a>
			 </h1>
		</section>
		<section class="tag-list tag-favorite">
			<h1>
				<span>#자주 쓰는 태그</span>
			</h1>
			<c:if test="${empty favTagList}">
			<div class="list-empty">
				<span>자주쓰는 태그가 없습니다.</span>
			</div>
			</c:if>
			<c:if test="${!empty favTagList}">
			<ul>
				<c:forEach var="tagView" items="${favTagList}">
				<li>
					<a href="${root}/member/search/list-by-tags?tags=%23${tagView.id}">#${tagView.id}<span>(${tagView.noteCnt})</span></a>
				</li>
				</c:forEach>
			</ul>
			</c:if>
		</section>
		<section class="tag-list">
			<h1>
				<span>#전체 태그</span>
				<a href="list">더보기</a>
			</h1>
			<c:if test="${empty tagList}">
			<div class="list-empty">
				<span>사용 중인 태그가 없습니다.</span>
			</div>
			</c:if>
			<c:if test="${!empty tagList}">
			<ul>
				<c:forEach var="tag" items="${tagList}">
				<li>
					<a href="${root}/member/search/list-by-tags?tags=%23${tag.id}">#${tag.id}</a>
				</li>
				</c:forEach>
			</ul>
			</c:if>
		</section>	
	</div>
</main>
