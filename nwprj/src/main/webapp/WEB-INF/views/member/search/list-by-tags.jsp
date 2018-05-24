<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<section class="modal-window hidden">
	<h1 class="hidden">프리셋 등록 폼</h1>
	<div class="message-box">
		<form action="list-by-tags/reg" method="post">
			<div>
				<label>등록할 프리셋 이름을 정해 주십시오.</label>
				<input type="text" name="name" placeholder="프리셋 이름" required/>
				<input type="hidden" name="tags" value="${tags}" />
			</div>	
			<div>	
				<input type="button" value="취소" />
				<input type="submit" value="등록" />
			</div>
		</form>
	</div>
</section>
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
				<c:forEach var="n" items="${noteList}">
				<li>
					<a href="${root}/member/note/${n.id}">
						<img src="${root}/resources/images/dummy/test-image.jpg" alt="미리보기">
					</a>
					<div>
						<img src="${root}/resources/images/note/ic_visibility_white_24dp.png">
						<span>${n.hit}</span>
						<img src="${root}/resources/images/note/ic_star_white_24dp.png">
						<span>${n.clipCnt}</span>
						<img src="${root}/resources/images/note/ic_message_white_24dp.png">
						<span>${n.commentCnt}</span>
					</div>
				<div><a href="${root}/member/note/${n.id}">${n.title}</a></div>
				<div>
					<c:if test="${empty n.tagList}">
					<span>(태그 없음)</span>
					</c:if>
					<c:if test="${!empty n.tagList }">
					<c:forEach var="tag" items="${n.tagList}">
						<a href="${root}/member/search/list-by-tags?tags=%23${tag.id}">#${tag.id}</a>
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
<section class="reg-button preset-reg-button">
	<h1 class="hidden">프리셋 등록 버튼</h1>
	<a href="">프리셋 등록</a>
</section>
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