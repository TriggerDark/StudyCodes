<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>省级联动</title>
    <script src="js/getData.js"></script>
</head>
<body onload="getDepartment('departments')">
	<h3>联动</h3>
    <select id="department" onchange="getEmployee()"></select>
    <select id="employee"></select>
</body>
</html>
