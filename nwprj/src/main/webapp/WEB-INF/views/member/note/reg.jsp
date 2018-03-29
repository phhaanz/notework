<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
	<section>
		<h1>노트 등록 폼</h1>
		<form method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<th>제목</th>
				</tr>
				
				<tr>
					<td><input type="text" value="" name="title" size="39"/></td>
				</tr>
				
				<tr>
					<th>첨부</th>
				</tr>
				<tr>
					<td><input type="file" name="file" /></td>
				</tr>
				
				<tr>
					<th>내용</th>
				</tr>
				
				<tr>
					<td>
						<textarea rows="10" cols="40" name="content"></textarea>
					</td>
				</tr>
			</table>
			<div>
				<input type="submit" value="등록" />
			</div>
		</form>
	</section>
</main>

<script>
/* 	var submitBtn = document.querySelector("input[type='submit']");
	
	submitBtn.onclick = function(e) {
			
		var request = new XMLHttpRequest();
		request.onload = function(evt) {

			alert(request.responseText);
		}

		request.open("GET", "data");
		request.send();
		
		e.preventDefault();
	}; */

</script>

