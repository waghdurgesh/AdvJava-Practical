<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
<table class="table table-striped">
        <thead>
            <tr>
                <th> Id </th>
                <th> Title </th>
                <th> Text </th>
                <th> Color </th>
                <th> Date/Time </th>
            </tr>
        </thead>

        <tbody>
        <c:forEach items="${allNotesOfUser}" var="pp">
                <tr>
                    <td><${pp.}</td>
                    <td><${pp.title}</td>
                    <td><${pp.text}</td>
                    <td><${pp.color}</td>
                    <td><${pp.datetime}</td>
                </tr>
        </c:forEach>
        </tbody>

    </table>
</body>
</html>