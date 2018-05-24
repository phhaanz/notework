<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main class="main no-padding">
	<h1 class="hidden">회원가입</h1>
	<div class="root-container">
		<section class="join-form">
			<h1>회원정보 입력</h1>
			<form method="post">
				<table>
					<tr>
						<td>
							<input type="text" name="id" placeholder="아이디" required />
						</td>	
					</tr>
					<tr>
						<td>
							<input type="password" name="password" placeholder="비밀번호" required />
						</td>
					</tr>
					<tr>
						<td>
							<input type="password" placeholder="비밀번호확인" required />
						</td>
					</tr>
					<tr>
						<td>
							<input type="text" name="name" placeholder="닉네임" required />
						</td>
					</tr>
					<tr>
						<td>	
							<input type="text" name="email" placeholder="이메일" />
						</td>
					</tr>
					<tr>
						<td>
							<textarea name="introduce" placeholder="자기소개를 입력해주세요.">
							</textarea>
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="제출">
						</td>
					</tr>
				</table>
			</form>
		</section>
	</div>
</main>