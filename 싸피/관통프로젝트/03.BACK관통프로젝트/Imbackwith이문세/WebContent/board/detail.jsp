<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<body>
<div style="display=center">
	<h2>글 상세보기</h2>
	<hr>
	<h4>${board.title}</h4>
	<div>
		조회수 : ${board.viewCnt}
	</div>
	<div>
		글쓴이 : ${board.writer}
	</div>
	<div>
		등록일 : ${board.regDate}
	</div>
	<div>
		내용 : ${board.content}
	</div>
	
	<a href="board?act=updateform&id=${board.id}&videoid=${videoid}">수정</a>
	<!-- GET요청  post로 해야함 왜??-->
	<a href="board?act=delete&id=${board.id}&videoid=${videoid}">삭제</a>
	
	<a href="board?act=list&videoid=${videoid}">목록으로</a>
</div>
	
</body>
</html>