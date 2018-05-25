<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />    

<main class="main no-padding">
	<div class="root-container">
		<section class="login-form">
			<h1 class="hidden">로그인 폼</h1>
			<form method="post">
				<div>
				<c:if test="${param.error eq 1}">
					아이디 또는 비밀번호가 잘못되었습니다.
				</c:if>
				<c:if test="${param.error ne 1}">
					<span style="color: black">Stich the Notes, Notework</span>
				</c:if>
				</div>
				<ul>
					<li><input type="text" name="username"placeholder="아이디 입력..." /></li>
					<li><input type="password" name="password" placeholder="비밀번호 입력..." /></li>
					<li><input type="submit" value="로그인" />	</li>
					<li>
						<div>
							<img id="remember-me" src="${root}/resources/images/user/baseline_check_box_off.png">
							<span>로그인 상태 유지</span>
						</div>
					</li>
				</ul>
			</form>
		</section>
	</div>
</main>

<script>
$(function(){
	
	var rememberMeBtn = $("#remember-me");
	
	var offSrc = "${root}/resources/images/user/baseline_check_box_off.png";
	var onSrc = "${root}/resources/images/user/baseline_check_box_on.png";
	
	rememberMeBtn.click(function() {	
		
		if(rememberMeBtn.hasClass("check")) {
			rememberMeBtn.removeClass("check");
			rememberMeBtn.attr("src", offSrc);
		}
		else	{
			rememberMeBtn.addClass("check");
			rememberMeBtn.attr("src", onSrc);
		}
	});
});


</script>