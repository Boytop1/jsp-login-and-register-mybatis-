<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册博客</title>
</head>
<body>
<form action="RegisterServlet" methon="post">
<p><font color="#00aa00" size="6">注册博客</font></p>
<hr color="#00aa00" align="left" width="300"/>
<p>我的账号：<input type="text" name="uname"/></p>
<p>我的密码：<input type="password" name="pwd"/></p>
<p><input type="submit" value="立即开通" /></p>
<div style="color:red;">${tips}</div>
</form>
</body>
</html>