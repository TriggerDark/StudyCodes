<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function getData(){		
		//创建ajax引擎对象
			var ajax;
			if(window.XMLHttpRequest){//火狐
				ajax=new XMLHttpRequest();
			}else if(window.ActiveXObject){//ie
				ajax=new ActiveXObject("Msxml2.XMLHTTP");
			}
			ajax.onreadystatechange=function(){
				//判断Ajax状态吗
				if(ajax.readyState==4){
					//判断响应状态吗
					if(ajax.status==200){
						//获取响应内容
						var result=ajax.responseText;
						//处理响应内容
							//获取元素对象
							var showdiv=document.getElementById("showdiv");
							showdiv.innerHTML=result;
					}else if(ajax.status==404){
						//获取元素对象
						var showdiv=document.getElementById("showdiv");
						showdiv.innerHTML="请求资源不存在";
					}else if(ajax.status==500){
						//获取元素对象
						var showdiv=document.getElementById("showdiv");
						showdiv.innerHTML="服务器繁忙";
					}
				}else{
					//获取元素对象
					var showdiv=document.getElementById("showdiv");
					showdiv.innerHTML="<img src='img/2.gif' width='200px' height='100px'/>";
				}
			}
		//发送请求
		ajax.open("get","ajax",true);
		ajax.send(null);
		alert("哈哈");
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
	<input type="button" value="测试 " onclick="getData()"/>
	<div id="showdiv"></div>
</body>
</html>