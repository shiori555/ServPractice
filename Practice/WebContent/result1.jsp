<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// Servletのデータ受け取り
	request.setCharacterEncoding("UTF8");
	String strServlet = (String) request.getAttribute("fromServlet");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コメント表示</title>
</head>
<body>
	入力されたコメントを表示 ：
	<%=strServlet%>
</body>
</html>