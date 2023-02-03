<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="com.beans.LoginBean"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=((LoginBean) request.getAttribute("loginbean")).getMessage()%></h1>
	<a href="welcome">New Page</a>
	<br>
	<a href="details/list1">List1</a>
	<br>
	<a href="details/list2">List2</a>
</body>
</html>