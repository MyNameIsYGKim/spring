<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>사진</th>
				<th>제목</th>
				<th>출판일</th>
				<th>가격</th>
				<th>저자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bookList }" var="book">
				<tr>
					<td>${book.bookNo }</td>
					<td>${book.bookCoverimg }</td>
					<td>${book.bookName }</td>
					<td>
						<fmt:formatDate value="${book.bookDate }" pattern="yy/MM/dd"/>
					</td>
					<td>${book.bookPrice }</td>
					<td>${book.bookPublisher }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script>
	$('tbody > tr').on('click', function(e){
		if(e.target.tagName != 'TD') return;
		let bno = $(e.currentTarget).find('td:nth-of-type(1)').text();
		location.href= 'bookInfo?bookNo=' + bookNo;
	});
	</script>
</body>
</html>