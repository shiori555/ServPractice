<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コメント入力</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/CommeP" method="post">
		コメントを入力してください
		<input type="text" name="fromJsp"/>
		<input type="submit" value="送信" />
	</form>


</body>
</html>