<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main class="main padding-top-45">
	<h1 class="hidden"> 노트 내용</h1>
	<div class="root-container">
		<article class="note-detail">
			<div class="article-header">
				<div>
					<c:if test="${empty noteView.tagList}">
						<span>(태그 없음)</span>
					</c:if>
					<c:if test="${!empty noteView.tagList }">
						<c:forEach var="tag" items="${noteView.tagList}">
							<a href="">#${tag.id}</a>
						</c:forEach>
					</c:if>
				</div>
				
				<div>${noteView.title}</div>
				
				<div>
					<img src="${root}/resources/images/dummy/profile.jpeg">
				</div>
	
				<div>
					<span>${noteView.writerName}(${noteView.writerId})</span>
					<span>Lv</span>
				</div>
				
				<div>
					<span>Date : <fmt:formatDate value="${noteView.regDate}" pattern="yyyy.MM.dd HH:mm:ss" /></span>
					<span class="devide-line"></span>
					<span>Hit : ${noteView.hit}</span>
				</div>
			</div>
			<div class="article-main">
				${noteView.content}
			</div>
			<div class="article-footer">
				<ul>
					<li>
						<a href="list"><img src="${root}/resources/images/note/ic_chevron_left_black_24dp.png"></a>
					</li>
					
					<li>
						<a id="note-clip-btn" href=""><img src="${root}/resources/images/note/ic_star_black_24dp.png"></a><span>clip</span>
						<a href="${noteView.id}/comment"><img src="${root}/resources/images/note/ic_insert_comment_black_24dp.png"></a><span>comment</span>
					</li>
				</ul>
			</div>
		</article>
	</div>
</main>

<script>
$(function(){
	var clipBtn = $("#note-clip-btn");
	
	clipBtn.click(function(e){
		e.preventDefault();
		$.get("${noteView.id}/clip", function(result){

		});
		
		
		
	});
});
</script>