<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function ajaxReq() {
		var un = document.getElementById("name").value;
		var pd = document.getElementById("pwd").value;
		var data = "name=" + un + "&pwd=" + pd;
		//创建对象
		var ajax;
		if (window.XMLHttpRequest) {
			ajax = new XMLHttpRequest();
		} else if (window.ActiveXObjective) {
			ajax = new ActiveXObject("Microsoft.XMLHTTP");
		}
		//复写onreadystatechange
		ajax.onreadystatechange = function() {
			if (ajax.readyState == 4) {
				if (ajax.status == 200) {
					//获取响应内容
					var result = ajax.responseText;
					//处理响应内容
					alert(result);
				}
			}
		}
		//发送请求
			//get方式
			//ajax.open("get", "ajax?" + data);
			//ajax.send(null);
			//post方式
			ajax.open("post", "ajax");
			ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			ajax.send(data)
		
	}
</script>
<style type="text/css">
	#showdiv{
		border:solid 1px;
		width:200px;
		height:100px; 
	}
</style>
</head>
<body>
	<h3>欢迎登录403峡谷</h3>
	<hr>
	<input type="text" id="name">
	<input type="password" id="pwd">
	<input type="button" value="测试 " onclick="ajaxReq()"/>
	<div id="showdiv"></div>
</body>
</html>