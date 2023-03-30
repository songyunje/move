<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<body>
<div style="text-align: center;">
	<h2>영상 상세보기</h2>
	<hr>
	<h4>${video.title}</h4>
	<div>
	<a href="${video.url}"><img src = "img/${video.img}"
	 style="height: 250px; width: 400px"></a> 
	</div>
	<div>
		제목 : ${video.title}
	</div>
	<div>
	 	부위 : ${video.part}
	</div>
	<div>
		채널명 : ${video.channelName}
	</div>
	<div>
		<a href="${video.url}">링크 : ${video.url}</a>
	</div>
	<a href="board?act=list&videoid=${video.id}">댓글 리스트</a>
	<a href="video?act=list">홈으로</a>
</div>
</body>
</html>