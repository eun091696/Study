<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<body>
	<jsp:forward page="loginP.jsp">
		<jsp:param value="hds1234" name="id"/>
		<jsp:param value="1234" name="pw"/>
	</jsp:forward>
</body>
</html>