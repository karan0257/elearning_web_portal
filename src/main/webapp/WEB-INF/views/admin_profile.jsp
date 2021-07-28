<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<title>Admin Profile</title>
</head>
<body class="bg-light">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome To Admin Profile</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">CourseID</th>
							<th scope="col">CourseName</th>
							<th scope="col">CourseDescription</th>
							<th scope="col">CourseFees</th>
							<th scope="col">CourseResource</th>
							<th scope="col">Actions</th>						
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${courses}" var="c" >
						<tr>
							<th scope="row">${c.courseId }</th>
							<td>${c.courseName }</td>
							<td>${c.courseDescription }</td>
							<td class="font-weight-bold">&#x20B9; ${c.courseFees }</td>
							<td>${c.courseResource }</td>
							<td>
								<a href="admin-profile/delete/${c.courseId }" class="btn btn-outline-danger btn-danger">Delete</a>
							</td>
						</tr>
						</c:forEach>					
					</tbody>
				
				</table>
				<div class="container text-center">
					<a href="add-course" class="btn btn-outline-success">Add Course</a>	
				</div>
				<br>
				<br>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">User ID</th>
							<th scope="col">User Name</th>
							<th scope="col">Email ID</th>
							<th scope="col">Phone Number</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${users}" var="u" >
						<tr>
							<th scope="row">${u.userid}</th>
							<td>${u.name}</td>
							<td>${u.email}</td>
							<td>${u.phone }</td>
						</tr>
						</c:forEach>					
					</tbody>
				
				</table>
				<div class="container text-center">
					<a href="admin-profile/feedbackview/${u.userid }" class="btn btn-outline-danger btn-danger">View Feedback</a>	
				</div>
				
			</div>
		</div>
	</div>
</body>
</html>