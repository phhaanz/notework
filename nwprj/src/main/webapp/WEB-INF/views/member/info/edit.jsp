<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main class="main">
	<div class="root-container">
		<section class="info-edit">
			<h1>회원정보 수정</h1>
			<form method="post">
				<table>
					<tr>
						<td>
							<div class="viewer">
								<img>
							</div>
							<label>이미지 변경</label>
							<input class="hidden" type="file" name="profile-image">
						</td>
					</tr>
					<tr>
						<td>
							<label for="id">아이디</label>
						</td>
						<td>
							<input id="id" type="text" placeholder="아이디" readonly="readonly" value="${member.id}"/>
						</td>	
					</tr>
					<tr>
						<td>
							<label for="new-password">변경할 비밀번호</label>
						</td>
						<td>
							<input id="new-password" type="password" name="new-password" placeholder="변경할 비밀번호" />
						</td>
					</tr>
					<tr>
						<td>
							<label for="new-password-confirm">변경할 비밀번호 확인</label>
						</td>
						<td>
							<input id="new-password-confirm" type="password" placeholder="비밀번호 확인" />
						</td>
					</tr>
					<tr>
						<td>
							<label for="password">기존 비밀번호</label>
						</td>
						<td>
							<input type="password" name="password" placeholder="기존 비밀번호" required />
						</td>
					</tr>
					<tr>
						<td>
							<label for="name">닉네임</label>
						</td>
						<td>
							<input id="name" type="text" name="name" placeholder="닉네임" value="${member.name}" required />
						</td>
					</tr>
					<tr>
						<td>
							<label for="email">이메일</label>
						</td>
						<td>	
							<input id="email" type="text" name="email" placeholder="이메일" value="${member.email}" />
						</td>
					</tr>
					<tr>
						<td>
							<label for="introduce">자기소개</label>
						</td>
						<td>
							<textarea id="introduce" name="introduce" placeholder="자기소개를 입력해주세요.">${member.introduce}</textarea>
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="수정" />
						</td>
						<td>
							<a href="index">취소</a>
						</td>
					</tr>
				</table>
			</form>
		</section>
	</div>
</main>
<script>
$(function(){
	var imgBtn = $(".viewer>a");
	var fileBtn = $("input:file");
	var viewer = $(".viewer");
	
	imgBtn.click(function(){
		fileBtn.trigger('click');
	});	
	
	fileBtn.change(function(){
		var reader = new FileReader();
		
		reader.onload = function(evt){
			var img = $("<img />");
			var src =  evt.target.result;
			img.attr("src", src); 
			img.appendTo(viewer);
		};
		
		reader.readAsDataURL(fileBtn[0].files[0]);
	});
});
</script>