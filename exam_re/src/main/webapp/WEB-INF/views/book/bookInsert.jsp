<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="insertForm" action="bookInsert" mothod="post">
		<div>
			<h3>도서 등록</h3>
		</div>
		<table>
			<tr>
				<th>도서 번호</th>
				<td><input type="number" name="bookNo" value="${bNo }" readonly></td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input type="text" name="bookCoverimg"></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="text" name="bookDate"></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input type="text" name="bookPrice"></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="bookPublisher"></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea name="bookInfo"></textarea></td>
			</tr>
		</table>
		<button type="submit" >등록</button>
		<button type="button" onclick="location.href='bookList'">조회</button>
	</form>
	<script>
		document.getElementsByName('insertForm')[0]
				.addEventListener('submit', function(e){
					e.preventDefault(); // submit 딜레이
					
					let title = document.getElementsByName('bookName')[0];
					
					if(title.value == ''){
						alert('도서명이 입력되지 않았습니다.');
						title.focus();
						return;
					}
					
					// document.getElementsByTagName('form')[0].submit();
					alert('도서 등록이 완료되었습니다.');
					insertForm.submit();
				});
	</script>
</body>
</html>