<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<script>
$(function() {
	var hamButton = $("#hamburger-button");
	var asideMenu = $(".aside");
	var asideBg = $(".aside-bg");
	var closeButton = $(".aside > div > a");
	
	hamButton.click(function() {
		asideMenu.addClass("show");
		asideBg.addClass("show");
	});
	
	asideBg.click(closeAside);
	closeButton.click(closeAside);
	
	function closeAside(e) {
		asideBg.removeClass("show");
		asideMenu.removeClass("show"); 
		e.preventDefault();
	}
});
</script>

<nav class="aside">
	<h1 class="hidden">사이드 바</h1>
	<div>
		<span>NOTEWORK</span>
		<a href="">
			<img src="${root}/resources/images/ic_close_white_24dp.png">
		</a>
	</div>
	<ul>
		<li>
			<a href="${root}/index">
				<img src="${root}/resources/images/ic_home_black_24dp.png">
				<span>HOME</span>
			</a>
		</li>
		<li>
			<a href="${root}/member/note/list">
				<img src="${root}/resources/images/ic_content_paste_black_24dp.png">
				<span>My Notes</span>
			</a>
		</li>
		<li>
			<a href="${root}/member/tag/index">
				<img src="${root}/resources/images/ic_local_offer_black_24dp.png">
				<span>My Tags</span>
			</a>
		</li>
		<li>
			<a href="${root}/member/preset/list">
				<img src="${root}/resources/images/ic_flag_black_24dp.png">
				<span>My PreSet</span>
			</a>
		</li>
		<li>
			<a href="">
				<img src="${root}/resources/images/ic_star_black_24dp.png">
				<span>My Clip</span>
			</a>
		</li>
		<li>
			<a href="">
				<img src="${root}/resources/images/ic_search_black_24dp.png">
				<span>Search</span>
			</a>
		</li>
		<li>
			<a href="${root}/user/logout">임시 로그아웃버튼</a>
		</li>
	</ul>
</nav>
<div class="aside-bg">
</div>