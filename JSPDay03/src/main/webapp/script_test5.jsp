<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag5</title>
</head>
<body>
	<!-- 3�� 5���� for������ ����� -->
	<table border="1">
		<%for (int i = 0; i < 3; i++) { %>
			<tr>
				<%for(int j = 0; j < 5; j++) {%>
					<td><%=i + 1%>��<%=j + 1%>��</td>
				<%} %>
			</tr>
		<%} %>
	</table>
</body>
</html>