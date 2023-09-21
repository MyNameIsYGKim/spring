<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<!-- Menu-->
	<ul class="nav" style="background-color: black; color: white;">
		<li class="nav-item"><a class="nav-link active"
			href="${pageContext.request.contextPath }/bookInsert">도서등록</a>
		</li>
		<li class="nav-item"><a class="nav-link"
			href="${pageContext.request.contextPath }/bookList">도서목록조회/수정</a></li>
		<li class="nav-item"><a class="nav-link"
			href="${pageContext.request.contextPath }/rentList">대여현황조회</a></li>
		<li class="nav-item"><a class="nav-link"
			href="${pageContext.request.contextPath }/">홈으로</a></li>
	</ul>