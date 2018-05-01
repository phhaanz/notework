<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.servletContext.contextPath }"/>
<main class="main">
	<h1 class="hidden">태그 프리셋</h1>
	<div class="root-container">
		<section class="tag-preset-list">
			<h1 class="hidden">태그 프리셋 목록</h1>
			<ul>
				<li>
					<a href=""><img src="${root}/resources/images/ic_flag_black_24dp.png">프리셋 이름</a>
					<ul>
						<li>
							<a href="">#태그1</a>
						</li>
						<li>
							<a href="">#태그2</a> 
						</li>
						<li>
							<a href="">#태그3</a>
						</li>
					</ul>
				</li>
				<li>
					<a href=""><img src="${root}/resources/images/ic_flag_black_24dp.png">프리셋 이름</a>
					<ul>
						<li>
							<a href="">#태그1</a>
						</li>
						<li>
							<a href="">#태그2</a> 
						</li>
						<li>
							<a href="">#태그3</a>
						</li>
						<li> 
							<a href="">#태그3</a>
						</li>
						<li>
							<a href="">#태그3</a>
						</li>
						<li>
							<a href="">#태그3</a>
						</li>
					</ul>
				</li>
				<li>
					<a href=""><img src="${root}/resources/images/ic_flag_black_24dp.png">프리셋 이름</a>
					<ul>
						<li>
							<a href="">#태그1</a>
						</li>
						<li>
							<a href="">#태그2</a> 
						</li>
						<li>
							<a href="">#태그3</a>
						</li>
					</ul>
				</li>
			</ul>
		</section>
	</div>
</main>