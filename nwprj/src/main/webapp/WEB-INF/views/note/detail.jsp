<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main class="main">
	<h1 class="hidden"> 노트 내용</h1>
	<div class="root-container">
		<article class="note-detail">
			<div class="article-header">
				<div>${note.title}</div>
				
				<div>
					<img src="">
				</div>
				
				<div>${note.writerId}</div>
				
				<div>
					<span>${note.regDate}</span>
					<span>${note.hit}</span>
				</div>
			</div>
			<div class="article-main">
				${note.content}
			</div>
			<div class="article-footer">
				<ul>
					<li>
						<span><img src="${root}/resources/images/note/ic_more_horiz_24dp.png"></span>
					</li>
					
					<li>
						<span><img src="${root}/resources/images/note/ic_star_black_24dp.png"></span><span>hit</span>
						<a href=""><img src="${root}/resources/images/note/ic_insert_comment_black_24dp.png"></a><span>comment</span>
					</li>
						
					<li>	
						<a href=""></a>
						<a href=""> </a>
					</li>
				</ul>
			</div>
		</article>
	</div>
</main>