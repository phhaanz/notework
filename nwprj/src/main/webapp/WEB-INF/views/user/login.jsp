<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main class="main">
	<section>
		<h1 class="hidden">로그인 폼</h1>
		<form method="post">
			<div>
				<label>아이디 : </label>
				<input type="text" name="username"placeholder="아이디 입력" />
				<label>비밀번호 : </label>
				<input type="password" name="password" placeholder="비밀번호 입력" />
			</div>
			<div>
				<input type="submit" value="로그인" />
			</div>
		</form>
	</section>
</main>