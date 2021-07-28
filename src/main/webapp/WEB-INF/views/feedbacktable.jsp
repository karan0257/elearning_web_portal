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
				<h1 class="text-center mb-3">Feedback By Students!</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Feedback ID</th>
							<th scope="col">Email ID</th>
							<th scope ="col">Name</th>
							<th scope="col">Feedback</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${feeds}" var="f" >
						<tr>
							<th scope="row">${f.feedbackid}</th>
							<td>${f.email}</td>
							<td>${f.name }</td>
							<td> ${f.feedback} </td>
						</tr>
						</c:forEach>					
					</tbody>
				
				</table>
				
				
			</div>
		</div>
	</div>
</body>
</html>