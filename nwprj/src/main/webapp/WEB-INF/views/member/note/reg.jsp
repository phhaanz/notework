<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main class="main padding-top-90 reg">

	<h1 class="hidden">노트 등록</h1>
	<div class="root-container">
		<section class="note-reg-form">
			<h1 class="hidden">노트 등록 폼</h1>
			<form method="post" enctype="multipart/form-data">
				<div>
					<input type="text" name="title" placeholder="제목을 입력해주십시오."/>
				</div>
				<div class="inline-content">
					<textarea name="content" >
					</textarea>
				</div>
				<div class="publish-state">
					<span>공개상태</span>
					<input id="publish-true" class="hidden" type="radio" name="publish" value="true" checked="checked">
					<label for="publish-true">공개</label>
					<input id="publish-false" class="hidden" type="radio" name="publish" value="false">
					<label for="publish-false">비공개</label>
				</div>
				<div>
					<span>태그추가</span>
					<span><img src="${root}/resources/images/member/note/ic_keyboard_arrow_down_black_24dp.png"></span>
				</div>
				<div class="hidden">
					<input multiple="multiple" type="file"/>
				</div>
				<div class="attached-image-list">
					<span>첨부파일</span>
					<ul>
						<li>
							<span>파일명1</span>
							<div>
								<img src="${root}/resources/images/member/note/ic_close_black_24dp.png">
							</div>
						</li>
						<li>
							<span>파일명2</span>
							<div>
								<img src="${root}/resources/images/member/note/ic_close_black_24dp.png">
							</div>
						</li>
						<li>
							<span>파일명31231312312132112312312313123asdasdasdas</span>
							<div>
								<img src="${root}/resources/images/member/note/ic_close_black_24dp.png">
							</div>
						</li>
						<li>
							<span>파일명4</span>
							<div>
								<img src="${root}/resources/images/member/note/ic_close_black_24dp.png">
							</div>
						</li>
					</ul>
				</div>
				<input type="submit" value="임시 등록 버튼">
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

