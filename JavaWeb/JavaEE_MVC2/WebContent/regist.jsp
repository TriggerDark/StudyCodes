<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<style>
	*{
		font-size:24px;
	}
	div{
		margin-top: 10px;
	}
	#btnReg{
		margin-left:83px;
	}
</style>
</head>
<body>
	<form action="reg.do" method="post">
		<div><h1>欢迎注册</h1></div>
		<div>用户名:<input type="text" name="username" id="username"/></div>
		<div>密&nbsp;&nbsp;码:<input type="password" name="password" id="password"/></div>
		<div>手&nbsp;&nbsp;机:<input name="phone"/></div>
		<div>地&nbsp;&nbsp;址:<input name="address"/></div>
		<div><input type="submit" value="注册" id="btnReg"/></div>
	</form>
</body>
</html>