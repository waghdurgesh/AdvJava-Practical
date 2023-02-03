<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Home</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap Dark Table</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
#img_card {
	width: 200px;
	height: 200px;
	margin: auto;
	margin-top: 10px;
}

#maindiv {
	align-content: center;
	margin: auto;
	margin-top: 10px;
}
</style>
<body>
	<div class="maindiv">
		<div class="text-center">
			<h3 class="display-6">Profile Details</h3>
		</div>
		<div class="card" style="width: 18rem;">
			<img id="img_card"
				src="https://cdn-icons-png.flaticon.com/512/1144/1144709.png"
				class="card-img-top" alt="">
			<div class="card-body">
				<h5 class="card-title">
					<b> Name:</b> @data.first_name @data.last_name
				</h5>
			</div>
			<ul class="list-group list-group-flush">
				<li class="list-group-item"><b>Email Id:</b> @data.email</li>
				<li class="list-group-item"><b>Phone:</b> @data.phone</li>
				<li class="list-group-item"><b>Address:</b> @data.address</li>
				<li class="list-group-item"><b>Qualification:</b>
					@data.qualification</li>
			</ul>
			<div class="card-body">
				<a href="/Trainer/List" class="card-link">View List</a> <a
					href="/Home/Index" class="card-link">Home</a>
			</div>
		</div>
	</div>
</body>
</html>