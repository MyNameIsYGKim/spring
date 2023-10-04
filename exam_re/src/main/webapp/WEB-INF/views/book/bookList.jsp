<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, thead, tr, td, th, tbody {
	border : 1px solid black
}
</style>
</head>
<body>
<h2>도서 조회/수정</h2>
	<table>
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>
				<th>출판일자</th>
				<th>금액</th>
				<th>출판사</th>
				<th>도서소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bookList }" var="info">
				<tr>
					<td>${info.bookNo }</td>
					<td>${info.bookName }</td>
					<td>
						<img style="width:100px;" src="<c:url value="/resources/images/${info.bookCoverimg }"/>">
					</td>
					<td>
						<fmt:formatDate value="${info.bookDate }" pattern="yyyy/MM/dd" />
					</td>
					<td>
						<fmt:formatNumber value="${info.bookPrice }"/> <!-- formatNumber는 기본으로 콤마사용 -->
					</td>
					<td>${info.bookPublisher }</td>
					<td>${info.bookInfo }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>