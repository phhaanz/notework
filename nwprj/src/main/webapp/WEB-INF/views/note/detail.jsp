<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
	<div><strong>${note.title}</strong></div>
	<br />
	<div>-조회수 : ${note.hit}</div>
	<div>-작성자 : ${note.writerId}</div>
	<div>-작성일자 : ${note.regDate}</div>
	<br />
	<div>${note.content}</div>
	<br /><br />
</main>