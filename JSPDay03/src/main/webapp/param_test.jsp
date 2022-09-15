<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>param 액션 태그</title>
</head>
<body>
	<h3>param 액션 태그</h3>
	<jsp:forward page="paramP.jsp">
		<jsp:param value="admin" name="id"/>
		<jsp:param value="관리자" name="name"/>
	</jsp:forward>
</body>
</html>