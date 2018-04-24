<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header">
	<h1 class="hidden">헤더</h1>
	<nav class="reg-menu">
		<h1 class="reg-title">노트 작성</h1>
		<ul>
			<li>
				<a id="cancel-button" href="">
					<img src="${root}/resources/images/member/note/ic_close_white_24dp.png" alt="작성 취소">
				</a>
			</li>
			<li>
				<a id="reg-button" href="">
					<img src="${root}/resources/images/member/note/ic_send_white_24dp.png" alt="등록">
				</a>
			</li>
		</ul>
	</nav>
	<nav class="write-style-toolbar">
		<ul>
			<li>
				<span>
					<img src="${root}/resources/images/member/note/ic_photo_black_24dp.png">
				</span>
			</li>
			<li>
				<span>
					<img src="${root}/resources/images/member/note/ic_title_black_24dp.png">
				</span>
			</li>
			<li>
				<span>
					<img src="${root}/resources/images/member/note/ic_format_color_text_black_24dp.png">
				</span>
			</li>
			<li>
				<span>
					<img src="${root}/resources/images/member/note/ic_format_size_black_24dp.png">
				</span>
			</li>
			<li>
				<span>
					<img src="${root}/resources/images/member/note/ic_format_align_left_black_24dp.png">
				</span>
			</li>
			
			
		</ul>
	</nav>
</header>