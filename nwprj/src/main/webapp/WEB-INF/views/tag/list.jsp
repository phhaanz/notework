<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main class="main">
	<h1 class="hidden">태그 리스트</h1>
	<div class="root-container">
		<section class="tag-search">
			<h1>
				<span>#태그 검색</span>
			</h1>
			<form method="get">
				<input type="text" name="tagName" placeholder="검색할 태그명 입력">
				<input type="submit" value="검색">
			</form>
		</section>
		<section class="tag-list">
			<h1>
				<span>#전체 태그</span>
			</h1>
			<ul>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
				<li>
					<a href="">#태그명<span>(갯수)</span></a>
				</li>
			</ul>
		</section>
	</div>
</main>
