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
				<div><a href="">#태그1아아65345</a><a href="">#태그1아아65345</a><a href="">#태그1아아65345</a> <a href="">#태그12312312312</a> <a href="">#태그12312313323</a></div>
				
				<div>${noteView.title}</div>
				
				<div>
					<img src="${root}/resources/images/dummy/profile.jpeg">
				</div>
	
				<div>
					<span>${noteView.writerId}(${noteView.writerName})</span>
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
						<a href=""><img src="${root}/resources/images/note/ic_star_black_24dp.png"></a><span>clip</span>
						<a href=""><img src="${root}/resources/images/note/ic_insert_comment_black_24dp.png"></a><span>comment</span>
					</li>
				</ul>
			</div>
		</article>
	</div>
</main>

<script>

</script>