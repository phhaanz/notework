<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<main class="main">
	<h1>임시 가입처</h1>
	<form method="post">
		<table>
			<tr>
				<td>
					<input type="text" name="name" placeholder="닉네임">
				</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="id" placeholder="아이디">
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" name="password" placeholder="비밀번호">
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" placeholder="비밀번호확인" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="email" placeholder="이메일">
				</td>
			</tr>
			<tr>
				<td>
					<textarea name="introduce">
					</textarea>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="제출"></td>
			</tr>
		</table>
	</form>



</main>