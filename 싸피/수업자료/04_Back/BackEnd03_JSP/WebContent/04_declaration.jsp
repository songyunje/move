<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name = "SSAFY";
	
	//두정수를 더하는 메서드
	public int add(int A, int B){
		return A+B;
	}
	//절대값을 반환하는 메서드
	public int abs(int A){
		return A > 0 ? A : -A;	
	}
	
	int a = 10;
	int b = -20;
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언</title>
</head>
<body>
	<%out.print(add(a, b));%> <br>
	<%out.print(abs(a));%> <br>
	<%out.print(abs(b));%> <br>
	
	
	
	
	
	
	
</body>
</html>