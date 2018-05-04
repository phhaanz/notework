<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main class="main padding-top-90 reg">

	<h1 class="hidden">노트 등록</h1>
	<div class="root-container">
		<section class="note-reg-form">
			<h1 class="hidden">노트 등록 폼</h1>
			<form method="post" enctype="multipart/form-data">
				<div>
					<input type="text" name="title" placeholder="제목을 입력해주십시오." required />
				</div>
				<div class="inline-content">
					<div id="edit-content-viewer" contenteditable="true">
					
					</div>
					<textarea class="hidden" name="content" required >
					</textarea>
				</div>
				<div class="publish-state">
					<span>공개상태</span>
					<div>
						<input id="publish-true" class="hidden" type="radio" name="publish" value="true">
						<label for="publish-true">공개</label>
						<input id="publish-false" class="hidden" type="radio" name="publish" value="false">
						<label for="publish-false">비공개</label>
					</div>
				</div>
				<div class="tag-add-list">
					<div>
						<span>태그추가</span>
						<input id="tag-input" type="text" placeholder="태그명 입력"><a id="tag-reg-btn" href=""></a>
<!-- 						<ul id="tag-auto-complete">
							<li>추천 태그1</li>
							<li>추천 태그2</li>
						</ul> -->
					</div>
					<div>
						<ul>	
						</ul>
						<input id="note-tags" type="hidden" name="tags" />
					</div>
				</div>		
				<div class="hidden">
					<input type="file" multiple="multiple" name="images"/>
				</div>
				<%-- <div class="attached-image-list">
					<span>첨부파일</span>
					<ul>
						<li>
							<span>파일명1</span>
							<div>
								<img src="${root}/resources/images/member/note/ic_close_black_24dp.png">
							</div>
						</li>
						<li>
							<span>파일명2</span>
							<div>
								<img src="${root}/resources/images/member/note/ic_close_black_24dp.png">
							</div>
						</li>
						<li>
							<span>파일명31231312312132112312312313123asdasdasdas</span>
							<div>
								<img src="${root}/resources/images/member/note/ic_close_black_24dp.png">
							</div>
						</li>
						<li>
							<span>파일명4</span>
							<div>
								<img src="${root}/resources/images/member/note/ic_close_black_24dp.png">
							</div>
						</li>
					</ul>
				</div> --%>
				<input class="hidden" type="submit" />
			</form>
		</section>
	</div>
</main>



<script>
//공개/비공개 전환
$(function(){
	//기본 공개
	var trueLabel = $("label[for='publish-true']");
	var falseLabel = $("label[for='publish-false']");
	
	trueLabel.addClass("checked");
	$("#publish-true").prop('checked',true);
	
	trueLabel.click(function(){
		if(trueLabel.hasClass("checked"))
			return;
		falseLabel.removeClass("checked");
		trueLabel.addClass("checked");
		
		$("#publish-true").prop('checked',true);
		$("#publish-false").prop('checked',false);
	});
	falseLabel.click(function(){
		if(falseLabel.hasClass("checked"))
			return;
		trueLabel.removeClass("checked");
		falseLabel.addClass("checked");
		
		$("#publish-false").prop('checked',true);
		$("#publish-true").prop('checked',false);
	});
});

//태그 추가&삭제
$(function(){
	var tagInput = $("#tag-input");
	var tagRegBtn = $("#tag-reg-btn");
	var tagListBox = $(".tag-add-list > div:nth-child(2) > ul");
	var cloneList = $("#tag-li-clone");
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
	});
	
	//버블링. 태그 직접누르면 삭제
	tagListBox.click(function(e){	
	
		if(e.target === e.currentTarget)
			return;	
		
		var target = $(e.target);
		
		target.parent().remove();
		
		maxTagCnt--;
	});

});
//파일 업로드하면 파일명 추가 &텍스트 에디터
$(function(){
	var contentViewer = $("#edit-content-viewer");
	var textBoldBtn = $("#text-bold-btn");
	var textItalicBtn = $("#text-italic-btn");
	var textUnderlineBtn = $("text-underline-btn");
	var photoUploadBtn = $("#photo-upload-btn");
	var imageFileBtn = $("input:file");
	var bold;	
	
	photoUploadBtn.click(function(){
		imageFileBtn.trigger('click');
	});
	
	imageFileBtn.change(function() {

		var reader = new FileReader();
		
		reader.onload = function(evt){
			
			var image = $("<img>");
			var src =  evt.target.result;
			image.attr("src", src); 
			
			image.appendTo(contentViewer);
			contentViewer.focus();
		};
		reader.readAsDataURL($(this)[0].files[0]);
		
	});
	
	contentViewer.focus(function(){

	});
	
	
	textBoldBtn.click(function(){
		bold = true;
		$("<b />").html('d').appendTo(contentViewer);
		contentViewer.focus();
	});
	
	textUnderlineBtn.click(function(){
		$("<u />").html('d').appendTo(contentViewer);
		contentViewer.focus();
	});
	
	textItalicBtn.click(function(){
		$("<i />").html('d').appendTo(contentViewer);
		contentViewer.focus();
	});
});




//태그값 전송할 때 파라미터로 넘기기 & 이벤트 트리거
$(function(){
	var regBtn = $("#reg-btn");
	var submitBtn = $("input:submit");
	var tagRegBtn = $("#tag-reg-btn");
	var fileListBox = $(".attached-image-list > ul");
	var contentDiv = $("#edit-content-viewer");
	var contentText = $("textarea[name='content']");
	//등록버튼 트리거
	regBtn.click(function(e){
		var tagListBox = $(".tag-add-list > div:nth-child(2) > ul");
		var noteTags = $("#note-tags");
		
		contentText.val(contentDiv.html());
		
		e.preventDefault();
		noteTags.val(tagListBox.text());
		submitBtn.trigger('click');
	});
});

</script>

