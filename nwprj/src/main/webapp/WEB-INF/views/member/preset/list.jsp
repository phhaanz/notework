<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.servletContext.contextPath }"/>
<main class="main">
	<h1 class="hidden">태그 프리셋</h1>
	<div class="root-container">
		<section class="tag-preset-list">
			<h1 class="hidden">태그 프리셋 목록</h1>
			<ul>
				<c:forEach var="p" items="${presetList}">
				<li>
					<a href="${p.linkAddress}"><img src="${root}/resources/images/ic_flag_black_24dp.png">${p.name}</a>
					<ul>
						<c:forEach var="tag" items="${p.tagList}">
						<li>
							<a>#${tag.id}</a>
						</li>
						</c:forEach>
					</ul>
				</li>
				</c:forEach>
			</ul>
		</section>
	</div>
</main>