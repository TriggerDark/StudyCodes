<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<style>
	*{
		font-size:24px;
	}
	div{
		margin-top: 10px;
	}
	#btnLogin{
		margin-left:83px;
	}
</style>
</head>
<body>
	<form action="login.do" method="post">
		<div><h1>欢迎登录</h1></div>
		<div>用户名:<input type="text" name="username" id="username"/></div>
		<div>密&nbsp;&nbsp;码:<input type="password" name="password" id="password"/></div>
		<div><input type="submit" value="登录" id="btnLogin"/></div>
	</form>
</body>
</html>