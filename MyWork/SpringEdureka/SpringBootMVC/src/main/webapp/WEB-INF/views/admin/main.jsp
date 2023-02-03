<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
	<h3>Hello!, ${sessionScope.user_details.firstName}
		${sessionScope.user_details.lastName}</h3>
	<h4>Current Login: ${sessionScope.user_details.userRole}</h4>
	<spring:url var="url1" value="/admin/categories"></spring:url>
	<h5>
		<a href="${url1}">Category Management</a>
	</h5>
	<spring:url var="url2" value="/user/logout"></spring:url>
	<h5>
		<a href="${url2}">Log Out</a>
	</h5>
</body>
</html>