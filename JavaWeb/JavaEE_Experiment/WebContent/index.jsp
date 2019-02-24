<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function getData() {
			var un = document.getElementById("un").value;
			var pd = document.getElementById("pd").value;
		    var xmlHttp;
		    if (window.XMLHttpRequest) {
		         xmlHttp = new XMLHttpRequest();
		    } else if (window.ActiveXObject) {
		        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		    }
		    xmlHttp.onreadystatechange = function () {
		    	if (this.readyState == 4 && this.status == 200) {
					var result = xmlHttp.responseText;
					document.getElementById("div").innerHTML = result;
		    	}
			};
		    xmlHttp.open("POST", "xmlHttp", true);
		    xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		    xmlHttp.send("un=" + un +"&pd=" + pd);
		}
	</script>
	<style>
		#div{
			border: 1px solid black;
			width: 200px;
			height: 200px;
		}
	</style>
</head>
<body>
	<form action="">
		<input type="text" id="un">
		<input type="password" id="pd">
	</form>
	<button onclick="getData()">按钮</button>
	<div id="div"></div>
</body>
</html>