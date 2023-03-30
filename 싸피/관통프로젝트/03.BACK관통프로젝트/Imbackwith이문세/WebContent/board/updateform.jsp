<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<body>
	<h2>글 상세보기</h2>
	<hr>
	<h4>${board.title}</h4>
		<form action="board" method="POST">
			<input type= "hidden" name="act" value="update">
			<input type= "hidden" name="id" value="${board.id}">
			<input type= "hidden" name="videoid" value="${videoid}">
			제목 : <input type="text" name="title" value="${board.title}"><br>
			글쓴이 : <input type="text" name="writer" value="${board.writer}"><br>
			내용 : <textarea rows="10" cols="10" name="content" >${board.content}</textarea><br>
			<button>수정하기</button>
		</form>


</body>
</html>