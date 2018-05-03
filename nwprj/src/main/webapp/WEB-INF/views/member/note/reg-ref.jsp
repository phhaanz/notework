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
					<div>
						<input id="publish-true" type="radio" name="publish" value="true">
						<label for="publish-true">공개</label>
						<input id="publish-false" type="radio" name="publish" value="false">
						<label for="publish-false">비공개</label>
					</div>
				</div>
				<div class="tag-add-list">
					<div>
						<span>태그추가</span>
						<input id="tag-input" type="text" placeholder="태그명 입력"><a id="tag-reg-btn" href=""></a>
<!-- 						<ul id="tag-auto-complete">
							<li>추천 태그1</li>
							<li>추천 태그2</li>
						</ul> -->
					</div>
					<div>
						<ul>
							<li><a href="">#태그1</a></li>
							<li><a href="">#태그2</a></li>
							<li><a href="">#태그3</a></li>
						</ul>
					</div>
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


</script>

