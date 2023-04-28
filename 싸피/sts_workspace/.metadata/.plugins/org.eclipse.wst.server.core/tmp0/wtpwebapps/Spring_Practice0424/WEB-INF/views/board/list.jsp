<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>싸피 게시판</title>
	<!-- bootstrap 추가 -->
	<%@ include file="../common/bootstrap.jsp" %>
	<link href="./resources/css/common.css" rel="stylesheet" type="text/css">
</head>
<body>
	<header>
		<nav class="header-nav">
			<!-- header.jsp 추가 -->
			<%@ include file="../common/header.jsp" %>	
		</nav>
	</header>
	<hr>
	<h2>게시글 목록</h2>
	<hr>
	
	<!-- 검색 창 -->
	<form action="search" class="row">
	<div class="col-2">
		<label>검색 기준 :</label>
		<select name="key" class="form-select">
			<option value="none">없음</option>
			<option value="writer">글쓴이</option>
			<option value="title">제목</option>
			<option value="content">내용</option>
		</select>
	</div>
	<div class="col-5">
		<label>검색 내용 :</label>
		<input type="text" name="word" class="form-control">
	</div>
	<div class="col-2">
		<label>정렬 기준 :</label>
		<select name="orderBy" class="form-select">
			<option value="none">없음</option>
			<option value="writer">글쓴이</option>
			<option value="title">제목</option>
			<option value="view_cnt">조회수</option>
		</select>
	</div>
		<div class="col-2">
		<label>정렬 방향 :</label>
		<select name="orderByDir" class="form-select">
			<option value="asc">오름차순</option>
			<option value="desc">내림차순</option>
		</select>
	</div>
	<div class="col-1">
		<input type="submit" value="검색" class="btn btn-primary">
	</div>
	</form>
	<hr>
	
	<!-- 게시글 목록 -->
	<div>
		<table class="table text-center">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>조회수</th>
				<th>등록 날짜</th>
			</tr>
			<c:forEach items="${list}" var="board">
				<tr>
					<td>${board.id}</td>
					<td><a href="detail?id=${board.id}">${board.title}</a></td>
					<td>${board.writer}</td>
					<td>${board.viewCnt}</td>
					<td>${board.regDate}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<!-- 추가 등록 -->
	<div class="d-flex justify-content-end">
		<a class="btn btn-outline-primary" href="write">글 등록</a>	
	</div>
</body>
</html>