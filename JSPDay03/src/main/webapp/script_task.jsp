<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag �ǽ�</title>
</head>
<body>
<!-- �Ʒ� ���� ���� ���̺� ����� -->
<!-- 
	��
	���
	����
	�����
	������
	�����
	����
	���
	��
 -->
	 <table border="1">
	 	<%for(int i = 0; i < 5; i++) {%>
	 	<tr>
	 		<%for(int j = 4 - i; j < 5; j++) {%>
	 			<td><%=i+1 %>��<%=i+2-(5-j) %>��</td>
	 		<%} %>
	 	</tr>
	 	<%} %>
	 	
	 	<%for(int i = 0; i < 4; i++){ %>
 		<tr>
	 		<%for(int j = i; j < 4; j++) {%>
	 			<td><%=6+i %>��<%=j+i-1 %>��</td>
	 		<% } %>
	 	</tr>
	 	<%} %>
	 </table>
</body>
</html>