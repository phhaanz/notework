<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" minimum-scale="1" user-scalable="1">
		
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		
		<link rel="icon" href="${root}/resources/images/icon/favicon.ico">
		<link rel="stylesheet" href="${root}/resources/css/common.css" type="text/css">
		<link rel="stylesheet" href="${root}/resources/css/style.css" type="text/css">
		
		<title>Notework. Stitch the Notes</title>
	</head>
	
	<body>
		<jsp:include page="/WEB-INF/views/inc/note/detail-header.jsp" />

		<main class="main padding-top-45">
			<h1 class="hidden">노트 내용</h1>
			<div class="root-container">
				<article class="note-detail">
					<div class="article-header">
						<div>
							<c:if test="${empty noteView.tagList}">
								<span>(태그 없음)</span>
							</c:if>
							<c:if test="${!empty noteView.tagList }">
								<c:forEach var="tag" items="${noteView.tagList}">
									<a href="${root}/member/search/list-by-tags?tags=%23${tag.id}">#${tag.id}</a>
								</c:forEach>
							</c:if>
						</div>
						
						<div>${noteView.title}</div>
						
						<div>
							<img src="${root}/resources/upload/profile/${noteView.writerId}/profile.jpg">
						</div>
			
						<div>
							<span>${noteView.writerName}(${noteView.writerId})</span>
							<span>Lv.1</span>
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
								<a href="list"><img src="${root}/resources/images/note/baseline_keyboard_arrow_left_white.png"></a>
							</li>
							
							<li>
								<a id="note-clip-btn" href=""><img src="${root}/resources/images/note/baseline_grade_white.png"></a><span>${noteView.clipCnt}</span>
								<a href="${noteView.id}/comment"><img src="${root}/resources/images/note/baseline_comment_white.png"></a><span>${noteView.commentCnt}</span>
							</li>
						</ul>
					</div>
				</article>
			</div>
		</main>
		
		<script>
			$(function(){
				var clipBtn = $("#note-clip-btn");
				var clipNum = $("#note-clip-btn+span");
			
				clipNum.click(function(){
					
					alert(clipNum.text());
				});
				
				clipBtn.click(function(e){
					e.preventDefault();
					$.get("${noteView.id}/clip", function(result){
						
						clipNum.text(result);
					});	
				});
			});
			$(function(){
				$("#more-button").click(function(evt){
					var writeMenu = $("#more-button+ul");
					var closeBtn = writeMenu.find("li:last-child a");	
					if(writeMenu.hasClass("hidden"))
						$("#more-button+ul").removeClass("hidden");
					else
						writeMenu.addClass("hidden");
					
					closeBtn.click(function(e){
						e.preventDefault();
						writeMenu.addClass("hidden");
					});
				});
			});
		</script>
	</body>
</html>