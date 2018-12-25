<%--
  Created by IntelliJ IDEA.
  User: SuperStar
  Date: 2018/12/25
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>$Title$</title>
	<script src="js/jquery-3.3.1.min.js"></script>
	<script>
		$(function () {
			$("#btn").click(function () {
				var username = $("#username").val();
				var password = $("#password").val();
				$.ajax({
					type: "POST",
					url: "/IdeaWebApp",
					data: "username=" + username + ", password=" + password,
					success: function (json) {
						$("#result").html(json.message);
                    }
				})
            });
        })
	</script>
	<style>
		#result{
			width: 200px;
			height: 200px;
			background-color: antiquewhite;
			border: 1px solid black;
		}
	</style>
</head>
<body>
	<form>
		<input type="text" id="username">
		<input type="password" id="password">
		<input type="button" id="btn" value="提交">
	</form>
	<div id="result"></div>
</body>
</html>
