<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main class="main">
	<h1 class="hidden">메인</h1>
	<div class="root-container">
		<section class="index">
			<h1 class="hidden">Notework 서비스 안내</h1>
			<ul>
				<li>
					<article>
						<h1>노트 등록하기</h1>
						<div class="reg-explanation"></div>
						<h2>웹 편집기를 이용하여 노트를 등록할  수 있습니다. 현재 지원하는 기능이 적으나 점차 늘려갈 예정입니다.</h2>
					</article>
				</li>
				<li>
					<article>
						<h1>태그 이용하기</h1>
						<div class="tag-explanation"></div>
						<h2>노트들을 구분하기 쉽도록 해쉬태그를 등록할 수 있습니다. 한 번이라도 등록한 적이 있는 태그는 빠르게 다시 찾아서 사용할 수 있습니다.</h2>
					</article>
				</li>
				<li>
					<article>
						<h1>프리셋 등록하기</h1>
						<div class="preset-explanation"></div>
						<h2>복수의 태그를 묶어서 프리셋으로 등록할 수 있습니다. 프리셋 메뉴에서 노트를 등록하면 보다 편하게 검색하고 작성할 수 있습니다.</h2>
					</article>
				</li>
				<li>
					<article>
						<h1>노트 클립하기</h1>
						<div class="clip-explanation"></div>
						<h2>내 노트, 혹은 다른 이용자의 노트 등 자주 검색해야 하는 노트들은 클립하여 따로 보관할 수 있습니다.</h2>
					</article>
				</li>
			</ul>
		</section>
	</div>
</main>