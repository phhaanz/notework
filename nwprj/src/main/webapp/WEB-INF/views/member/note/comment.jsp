<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main class="main">
	<section class="comment-input">
		<h1>´ñ±Û ÀÛ¼º</h1>
		<form action="./comment/reg" method="post">
			<label class="hidden">´ñ±Û ³»¿ë</label>
			<textarea name="content"></textarea>
			<input type="submit" value="µî·Ï">
		</form>
	</section>
	<section class="comment-list">
		<h1>´ñ±Û ¸ñ·Ï</h1>
		<ul>
			<c:forEach var="comment" items="${commentList}">
			<li>
				<table>
					<tr class="profile-image">
						<td rowspan="2"><img src="${root}/resources/upload/profile/${noteView.writerId}/profile.jpg"></td>
					</tr>
					<tr>
						<td>
							<span>${comment.writerName}(${comment.writerId})</span>
							<a><img src="${root}/resources/images/note/ic_more_vert_black_24dp_re.png"></a>
						</td>
					</tr>
					<tr>
						<td colspan="2">${comment.content}</td>
					</tr>
					<tr>
						<td colspan="2"><fmt:formatDate value="${comment.regDate}" pattern="yyyy.MM.dd HH:mm:ss" /></td>
					</tr>
				</table>
			</li>
			</c:forEach>
		</ul>
	</section>
</main>