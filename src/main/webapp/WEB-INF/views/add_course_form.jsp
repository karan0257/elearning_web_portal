<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
   <%@include file="./base.jsp" %>
   <title>Add Course</title>
  </head>
  <body class="bg-light">
  <div class="container mt-3">
  	<div class="row">
  		<div class="col-md-6 offset-md-3">
  		<h1 class="text-center mt-3">Fill the Course Details</h1>
  		 <form action="processCourse" method="post" class="mt-5">
   				<div class="form-group">
    				<label for="courseId">Course ID</label>
    				<input type="number" class="form-control" name="courseId" placeholder="Enter Course ID" required>
  				</div>
  				<div class="form-group">
    				<label for="courseName">Course Name</label>
    				<input type="text" class="form-control" name="courseName" placeholder="Enter Course Name" required>
  				</div>
  				<div class="form-group">
    				<label for="courseDescription">Course Description</label>
    				<textarea class="form-control" name="courseDescription" rows="5" placeholder="Enter Course Description"></textarea>
  				</div>
  				<div class="form-group">
    				<label for="courseFees">Course Fees</label>
    				<input type="number" class="form-control" name="courseFees" placeholder="Enter Course Fees" required>
  				</div>
  				<div class="form-group">
    				<label for="courseResource">Course Resource</label>
    				<input type="text" class="form-control" name="courseResource" placeholder="Enter Course Resource" required>
  				</div>
 				<div class="container text-center">
 					<a href="admin-profile" class="btn btn-outline-dark">BACK</a>
 					<button type="submit" class="btn btn-primary">Add Course</button>
 				</div>
   			</form>
   			</div>
   			</div>
  	</div>
   </body>
</html>