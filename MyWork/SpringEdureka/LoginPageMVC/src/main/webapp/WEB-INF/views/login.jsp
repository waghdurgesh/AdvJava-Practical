<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello ! WELCOME TO LOGIN PAGE</h3>
	<form action="login" method="get">
	<h4>Enter Login Credentials</h4>
		<table>
			<tr>
				<td>User ID</td>
				<td><input type="text" name="userid" value="Durgesh"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value="123"></td>
			</tr>
			<tr>
				<td><input type="submit" value="login"></td>
			</tr>

		</table>
	</form>
</body>
</html>