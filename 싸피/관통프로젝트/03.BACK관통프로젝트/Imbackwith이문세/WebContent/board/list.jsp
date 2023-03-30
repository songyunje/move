<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="align-text: center">
	<h2>게시글 목록</h2>
	<hr>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>조회수</th>
			<th>등록일</th>
		</tr>
		<!-- board.id id가 멤버변수 명이 아니라 getter의 메서드명이다.. 강의 다시듣기 -->
		<c:forEach items="${list}" var ="board" >
			<tr>
				<td>${board.id}</td>
				<td>
				<!-- act=detail 이란게 없어도 404에러 안뜨고 빈 화면 나오는 이유 -->
				<!-- board라는 서블릿에서 처리는 하지만 보여줄 값이 없는 거심ㅇ-->
					<a href="board?act=detail&id=${board.id}&videoid=${param.videoid}">
						${board.title}
					</a>
				</td>
				<td>${board.writer}</td>
				<td>${board.viewCnt}</td>
				<td>${board.regDate}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="board?act=writeform&videoid=${param.videoid}">글등록</a>
	<a href="video?act=detail&id=${param.videoid}">뒤로가기</a>
</div>
</body>
</html>