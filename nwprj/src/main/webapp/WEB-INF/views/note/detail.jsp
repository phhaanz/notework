<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>디테일이다</title>
</head>
<body>
	<div><strong>${note.title}</strong></div>
	<br />
	<div>-조회수 : ${note.hit}</div>
	<div>-작성자 : ${note.writerId}</div>
	<div>-작성일자 : ${note.regDate}</div>
	<br />
	<div>${note.content}</div>
	<br /><br />
</body>
</html>