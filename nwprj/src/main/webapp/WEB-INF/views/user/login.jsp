<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />    

<main class="main">
	<div class="root-container">
		<section class="login-form">
			<h1 class="hidden">로그인 폼</h1>
			<form method="post">
				<div>
						아이디 또는 비밀번호가 잘못되었습니다.
				</div>
				<ul>
					<li><input type="text" name="username"placeholder="아이디 입력..." /></li>
					<li><input type="password" name="password" placeholder="비밀번호 입력..." /></li>
					<li><input type="submit" value="로그인" />	</li>
					<li>
						<div>
							<img id="remember-me" src="${root}/resources/images/note/ic_check_box_black_off_24dp.png">
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
	
	var offSrc = "${root}/resources/images/note/ic_check_box_black_off_24dp.png";
	var onSrc = "${root}/resources/images/note/ic_check_box_black_on_24dp.png";
	
	rememberMeBtn.click(function() {	
		
		if(rememberMeBtn.hasClass("check")) {
			rememberMeBtn.removeClass("check");
			rememberMeBtn.attr("src", offSrc);
		}
		else	{
			rememberMeBtn.addClass("check");
			rememberMeBtn.attr("src", "${root}/resources/images/note/ic_check_box_black_on_24dp.png");
		}
	});
});


</script>