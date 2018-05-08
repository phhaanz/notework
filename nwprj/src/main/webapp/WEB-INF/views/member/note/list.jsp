<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main id="top" class="main">
	<div class="root-container">
		<section class="note-list">
			<h1 class="hidden">노트 목록</h1>
			<ul>
				<c:forEach var="n" items="${noteViews}">
				<li>
					<a href="${n.id}">
						<img src="${root}/resources/images/dummy/test-image.jpg" alt="미리보기">
					</a>
					<div>
						<img src="${root}/resources/images/note/ic_visibility_white_24dp.png">
						<span>${n.hit}</span>
						<img src="${root}/resources/images/note/ic_star_white_24dp.png">
						<span>25</span>
						<img src="${root}/resources/images/note/ic_message_white_24dp.png">
						<span>10</span>
					</div>
				<div><a href="${n.id}">${n.title}</a></div>
				<div>
					<c:forEach var="tag" items="${n}">
						<a href="">${tag.id}</a>
					</c:forEach>
				</div>
				</li>
				</c:forEach>
			</ul>
		</section>
	</div>
	<div class="top-anchor">
		<a href="#top"><img src="${root}/resources/images/ic_keyboard_capslock_black_24dp.png" alt="최상위로"></a>
	</div>
</main>