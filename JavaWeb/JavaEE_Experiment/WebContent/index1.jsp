<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script>
$(function(){
	$("#btn").click(function(){
		var un = $("#un").val();
		var pd = $("#pd").val();
		$.ajax({
			type: "POST",
			url: "checkInputServlet",
			async: true,
			dataType: "json", 
			data: "un=" + un + "&pd=" + pd,
			success: function(json){
				$("#result").html(json.message);
			},
			contentType: "application/x-www-form-urlencoded"
		})
	});
})
</script>
</head>
<body>
<form action="">
	<input type="text" id="un">
	<input type="password" id="pd">
</form>
<button id="btn">按钮</button><br/>
<div id="result"></div>
</body>
</html>