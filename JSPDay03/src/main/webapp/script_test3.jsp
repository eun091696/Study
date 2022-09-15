<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag3</title>
</head>
<body>
	<%
		out.print(myMethod(0));
	%>
	<%=myMethod(0) %>
	<%!
		public int myMethod(int count){
		return ++count;
	}
	%>
</body>
</html>
