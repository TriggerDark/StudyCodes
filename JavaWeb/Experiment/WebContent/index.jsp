<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function getData() {
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
    xmlHttp.open("GET", "xmlHttp", true);
    xmlHttp.send(null);
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
<button onclick="getData()">按钮</button>
<div id="div"></div>
</body>
</html>