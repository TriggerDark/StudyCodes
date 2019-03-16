<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
//获取数据
function getData() {
	var ajax;
	var province = document.getElementById("uname").value;
	var div = document.getElementById("div");
	var data = "uname=" + province;
	if (window.XMLHttpRequest) {
		ajax = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		ajax = new ActiveXObject("Microsoft.XMLHTTP");
	}
	var obj = {};
	ajax.onreadystatechange = function() {
		if (ajax.readyState == 4) {
			if (ajax.status == 200) {
				var result = ajax.responseText;
				eval(" var obj=" + result);
				alert(obj.city);
			}
		}
	}
	ajax.open("get", "user?"+data);
	ajax.send(null);
}

</script>
</head>
<body>
<h3>省份</h3>
<hr>
名称：<input type="text" name="uname" value="" id="uname" />
		  <input type="button" value="搜索" onclick="getData()" />
<div style="width: 100px; height: auto; border: 1px solid black;" id="div"></div>
</body>
</html>