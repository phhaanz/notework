<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
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

<sec:authorize access="!isAuthenticated()">
<nav class="aside">
	<h1 class="hidden">사이드 바</h1>
	<div>
	<a href="">
		<img src="${root}/resources/images/ic_clear_24dp_2x.png">
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
			<a href="${root}/user/join">
				<img src="${root}/resources/images/baseline_member_join.png">
				<span>JoinMember</span>
			</a>
		</li>
		<li>
			<a href="${root}/user/login">
				<img src="${root}/resources/images/baseline_power_settings_color.png">
				<span>LogIn</span>
			</a>
		</li>
	</ul>
</nav>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
<nav class="aside">
	<h1 class="hidden">사이드 바</h1>
	<div>
		<a href="">
			<img src="${root}/resources/images/ic_clear_24dp_2x.png">
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
			<a href="${root}/member/clip/list">
				<img src="${root}/resources/images/ic_star_black_24dp.png">
				<span>My Clip</span>
			</a>
		</li>
		<li>
			<a href="${root}/member/search/index">
				<img src="${root}/resources/images/ic_search_black_24dp.png">
				<span>Search</span>
			</a>
		</li>
		<li>
			<a href="${root}/user/logout">
				<img src="${root}/resources/images/baseline_exit_to_app_color.png">
				<span>LogOut</span>
			</a>
		</li>
	</ul>
</nav>
</sec:authorize>
<div class="aside-bg">
</div>