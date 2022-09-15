<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
</head>
<body>
	<%
		String site = request.getParameter("site"); 
		String url = null;
	
		switch(site){
		case "naver" :
			url = "forward_naver.jsp";
			break;
		case "daum" :
			url = "forward_daum.jsp";
			break;
		case "google" :
			url = "forward_google.jsp";
			break;
		}
		
	%>
	<jsp:forward page ="<%=url %>"/>
</body>
</html>