<%@ Language="VBScript" %>
<!DOCTYPE html>
<html>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<head>
		<title>ASP Page</title>
	</head>
	<body>
	 	<%
			Response.ContentType="text/event-stream"
			Response.Expires=-1
			Response.Write("data: " & now())
			Response.Flush()
		%>
	</body>
</html>