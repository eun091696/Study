<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag2</title>
</head>
<body>
	<%!
		int count = 3;
		String makeItBeLower(String data){
			return data.toLowerCase(); //사용자가 작성한게 소문자
		}
	%>
	<%
		for(int i = 0; i < count; i++){
			out.println("Java Server Pages" + (i + 1) + ".<br>");
		}
	%>
	<%=makeItBeLower("Hello World") %>
</body>
</html>