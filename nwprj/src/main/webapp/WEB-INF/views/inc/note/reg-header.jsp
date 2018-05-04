<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<header class="header note-reg-header">
	<h1 class="title">노트 작성</h1>
	<nav class="hor-menu note-reg-menu">
		<h1 class="hidden">작성 메뉴</h1>
		<ul class="icon-bar">
			<li>
				<a id="cancel-btn" href="">
					<img src="${root}/resources/images/member/note/ic_close_white_24dp.png" alt="작성 취소">
				</a>
			</li>
			<li>
				<a id="reg-btn" href="">
					<img src="${root}/resources/images/member/note/ic_send_white_24dp.png" alt="등록">
				</a>
			</li>
		</ul>
	</nav>
	<nav class="write-style-toolbar">
		<ul class="icon-bar">
			<li id="photo-upload-btn">
				<span>
					<img src="${root}/resources/images/member/note/ic_photo_black_24dp.png">
				</span>
			</li>
			<li id="text-bold-btn">
				<span>
					<img src="${root}/resources/images/member/note/ic_title_black_24dp.png">
				</span>
			</li>
			<li id="text-italic-btn">
				<span>
					<img src="${root}/resources/images/member/note/ic_format_italic_black_24dp.png">
				</span>
			</li>
			<li id="text-underline-btn">
				<span>
					<img src="${root}/resources/images/member/note/ic_format_underlined_black_24dp.png">
				</span>
			</li>
			<li id="text-color-btn">
				<span>
					<img src="${root}/resources/images/member/note/ic_format_color_text_black_24dp.png">
				</span>
			</li>
			<li id="text-size-btn">
				<span>
					<img src="${root}/resources/images/member/note/ic_format_size_black_24dp.png">
				</span>
			</li>
			<li id="text-align-btn">
				<span>
					<img src="${root}/resources/images/member/note/ic_format_align_left_black_24dp.png">
				</span>
			</li>
		</ul>
	</nav>
</header>