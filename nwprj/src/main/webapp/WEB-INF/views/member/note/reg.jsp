<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main class="main padding-top-90 reg">
	<h1 class="hidden">노트 등록</h1>
	<div class="root-container">
		<section class="note-reg-form">
			<h1 class="hidden">노트 등록 폼</h1>
			<form method="post" enctype="multipart/form-data">
				<div>
					<input type="text" name="title" placeholder="제목을 입력해주십시오."/>
				</div>
				<div>
					<textarea name="content" >
					</textarea>
				</div>
				<div>
					라디오버튼 (공개여부)
				</div>
				<div>
					태그추가 팝업 호출
				</div>
				<div>
					<input type="file" name="image" />
				</div>
				<div>
					첨부파일 리스트
				</div>
			</form>
		</section>
	</div>
</main>

<script>
/* 	var submitBtn = document.querySelector("input[type='submit']");
	
	submitBtn.onclick = function(e) {
			
		var request = new XMLHttpRequest();
		request.onload = function(evt) {

			alert(request.responseText);
		}

		request.open("GET", "data");
		request.send();
		
		e.preventDefault();
	}; */

</script>

