<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α��� ���</title>
</head>
<body>
	<%if(request.getParameter("id").equals("hds1234")) {
		if(request.getParameter("pw").equals("1234")) {%>
		<h3>�α��� ����!</h3>
		<%}else {%>
			<h1>��й�ȣ ����</h1>
		<%} %>
	<%}else { %>
		<h1>�߸��� ���̵�</h1>
	<%} %>
</body>
</html>