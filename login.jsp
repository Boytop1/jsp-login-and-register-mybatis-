<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<form action="LoginServlet" method="post">
	你的账号：<input type="text" name="uname"/><br>
	你的密码：<input type="password" name="pwd"/><br>
		<input type="submit" value="提交"/>
		<p>
	</form>
	<a href="register.jsp">注册</a></p>
	<div style="color:red;">${tips}</div>
	
</body>
</html>