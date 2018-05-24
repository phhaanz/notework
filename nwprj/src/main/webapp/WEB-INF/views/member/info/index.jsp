<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main class="main">
	<div class="root-container">
		<section class="info-edit">
		<table>
				<tr>
					<td>
						<div class="viewer">
							<img src="${root}/resources/upload/profile/${member.id}/profile.jpg">
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<span>아이디</span><span>	${member.id}</span>
					</td>	
				</tr>
				<tr>
					<td>
						<span>닉네임</span><span>${member.name}</span>
					</td>
				</tr>
				<tr>
					<td>
						<span>이메일</span><span>${member.email}</span>
					</td>
				</tr>
				<tr>
					<td>
						<label for="introduce">자기소개</label>
					</td>
					<td>
						<p>${member.introduce}</p>
					</td>
				</tr>
				<tr>
					<td>
						<a href="">회원정보 수정</a>
					</td>
					<td>
						<a href="">회원 탈퇴</a>
					</td>
				</tr>
			</table>
		</section>
	</div>
</main>
<script>
$(function(){
	var imgBtn = $(".viewer+label");
	var fileBtn = $("input:file");
	var viewer = $(".viewer");
	
	imgBtn.click(function(){
		fileBtn.trigger('click');
	});	
	
	fileBtn.change(function(){
		var reader = new FileReader();
		
		reader.onload = function(evt){
			var img = $(".viewer img");
			var src =  evt.target.result;
			img.attr("src", src); 
		};
		
		reader.readAsDataURL(fileBtn[0].files[0]);
	});
});
</script>