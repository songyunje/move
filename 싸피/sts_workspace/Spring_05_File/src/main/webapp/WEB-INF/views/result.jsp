<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과창</title>
</head>
<body>
	<a href="/mvc/upload/${fileName}">${fileName}</a>
	<!-- 컨택스트 루트를 직접 적는건 굉장히 별로.... -->
	<img src="${pageContext.request.contextPath}/upload/${fileName}"/>
	<a href="download?fileName=${fileName}">${fileName}다운로드</a>
	
	
	<c:forEach items="${list}" var="fileName">
		${fileName} <br>
	</c:forEach>
</body>
</html>