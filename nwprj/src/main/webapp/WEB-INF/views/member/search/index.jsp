<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
	<h1 class="hidden">노트 검색</h1>
	<div class="root-container">
		<section class="search-input search-title">
			<h1>
				<img src="${root}/resources/images/search/ic_search_black_24dp.png">
				<span>제목으로 검색</span>
			</h1>
			<form action="result" method="get">
				<input type="text" name="title" placeholder="노트 제목 입력">
				<input type="submit" value="검색">
			</form>
		</section>
		<section class="search-input search-tag">
			<h1>
				<img src="${root}/resources/images/search/ic_search_black_24dp.png">
				<span>태그 조합으로 검색</span>
			</h1>
			<div class="tag-add-list">
				<div>
					<label class="hidden">태그추가</label>
					<input id="tag-input" type="text" placeholder="태그명 입력"><a id="tag-reg-btn" href=""></a>
 					<!-- <ul id="tag-auto-complete">
						<li>추천 태그1</li>
						<li>추천 태그2</li>
					</ul>  -->
				</div>
				<div>
					<ul>	
					</ul>
					<input id="note-tags" type="hidden" name="tags" />
				</div>
			</div>
			<form action="result" method="get">
				<input type="submit" value="검색">
			</form>
		</section>	
	</div>
</main>

<script>
$(function(){
	var tagInput = $("#tag-input");
	var tagRegBtn = $("#tag-reg-btn");
	var tagListBox = $(".tag-add-list > div:nth-child(2) > ul");
	var maxTagCnt = 0;
	
	//태그 추가. 5개 이상 등록못함
	tagRegBtn.click(function(evt){
		evt.preventDefault();
		
		if(maxTagCnt >= 5)
		{
			alert('tagOverFlow');
			return;
		}
		else if(tagInput.val() == null || tagInput.val() == '')
		{
			alert('태그입력해라');
			return;
		}
		
		var tag = "#"+tagInput.val();
		var cloneLi = $("<li />");
		var cloneInput = $("<span>").text(tag);
		
		cloneLi.append(cloneInput).appendTo(tagListBox);
		maxTagCnt++;
		
		tagInput.val('');
		
		//버블링. 태그 직접누르면 삭제
		tagListBox.click(function(e){	
		
			if(e.target === e.currentTarget)
				return;	
			
			var target = $(e.target);
			
			target.parent().remove();
			
			maxTagCnt--;
		});
	});
});
</script>
