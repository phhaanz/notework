<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<header class="header common-header">
	<h1 class="title">메인</h1>
	<nav class="hor-menu main-menu">
		<h1 class="hidden">헤더 메뉴</h1>	
		<ul class="icon-bar">
			<li>
				<span id="hamburger-button">
					<img src="${root}/resources/images/ic_menu_24dp_2x.png" alt="메인 메뉴">
				</span>
			</li>
			<li>
				<sec:authorize access="hasRole('ROLE_MEMBER')">
					<sec:authentication var="username" property="principal.username"/>
					<a href="${root}/member/info/${username}/edit">
						<img src="${root}/resources/images/ic_account_circle_24dp_2x.png" alt="회원 메뉴">
					</a>
				</sec:authorize>
			</li>
		</ul>
	</nav>
</header>

<section class="modal-window hidden">
	<h1 class="hidden">프리셋 등록 폼</h1>
	<div class="message-box">
		<form action="list-by-tags/reg" method="post">
			<div>
				<label>등록할 프리셋 이름을 정해 주십시오.</label>
				<input type="text" name="name" placeholder="프리셋 이름" required/>
				<input type="hidden" name="tags" value="${tags}" />
			</div>	
			<div>	
				<input type="button" value="취소" />
				<input type="submit" value="등록" />
			</div>
		</form>
	</div>
</section>
