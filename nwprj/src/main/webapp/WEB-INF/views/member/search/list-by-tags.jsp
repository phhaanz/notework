<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main id="top" class="main padding-top-45">
	<div class="root-container">
		<section class="note-list">
			<h1 class="hidden">검색 목록</h1>
			<c:if test="${empty noteList}">
			<div class="list-empty">
				<span>검색된 노트가 없습니다.</span>
			</div>
			</c:if>
			<c:if test="${!empty noteList}">
			<ul>
				<c:forEach var="nv" items="${noteList}">
				<li>
					<c:if test="${!empty nv.thumb}">
					<a href="${nv.id}">
						<img src="${root}/resources/upload/note/${nv.id}/${nv.thumb}" alt="미리보기">
					</a>
					</c:if>
					<c:if test="${empty nv.thumb}">
					<a href="${nv.id}">
						<img src="${root}/resources/images/dummy/note_no_image_placeholder.png" alt="썸네일 없음">
					</a>
					</c:if>
					<div>
						<img src="${root}/resources/images/note/ic_visibility_white_24dp.png">
						<span>${nv.hit}</span>
						<img src="${root}/resources/images/note/ic_star_white_24dp.png">
						<span>${nv.clipCnt}</span>
						<img src="${root}/resources/images/note/ic_message_white_24dp.png">
						<span>${nv.commentCnt}</span>
					</div>
				<div><a href="${nv.id}">${nv.title}</a></div>
				<div>
					<c:if test="${empty nv.tagList}">
					<span>(태그 없음)</span>
					</c:if>
					<c:if test="${!empty nv.tagList }">
					<c:forEach var="tag" items="${nv.tagList}">
						<a href="">#${tag.id}</a>
					</c:forEach>
					</c:if>
				</div>
				</li>
				</c:forEach>
			</ul>
			</c:if>
		</section>
	</div>
	<div class="top-anchor">
		<a href="#top"><img src="${root}/resources/images/ic_keyboard_capslock_white_24dp.png" alt="최상위로"></a>
	</div>
</main>
<c:if test="${!empty noteList}">
<section class="reg-button preset-reg-button">
	<h1 class="hidden">프리셋 등록 버튼</h1>
	<a href="">프리셋 등록</a>
</section>
</c:if>
<script>
$(function(){
	var regBtn = $(".preset-reg-button");
	
	regBtn.click(function(evt){
		evt.preventDefault();
		
		var modal = $(".modal-window");
		var submitBtn = modal.find("input[value='등록']");
		var cancelBtn = modal.find("input[value='취소']");
	
		modal.removeClass("hidden");
		
		cancelBtn.click(function(){	
			modal.addClass("hidden");
		});
	});

});
</script>