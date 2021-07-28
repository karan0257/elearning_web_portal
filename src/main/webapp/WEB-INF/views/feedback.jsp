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
  		<h1 class="text-center mt-3">Fill the Feedback</h1>
  		 <form action="processfeedbackform" method="post" class="mt-5">
   				<div class="form-group">
    				<label for="userid">Enter Your ID</label>
    				<input type="number" class="form-control" name="userid" placeholder="Enter Your ID" required>
  				</div>
  				<div class="form-group">
    				<label for="feedbackid">Feedback ID</label>
    				<input type="number" class="form-control" name="feedbackid" placeholder="Enter feedback id" required>
  				</div>
  				<div class="form-group">
    				<label for="feedback">Feedback</label>
    				<textarea class="form-control" name="feedback" rows="5" placeholder="Enter Your Feedback"></textarea>
  				</div>
  				<div class="form-group">
    				<label for="name">Name</label>
    				<input type="text" class="form-control" name="name" placeholder="Enter Your Name" required>
  				</div>
  				<div class="form-group">
    				<label for="email">Email ID</label>
    				<input type="text" class="form-control" name="email" placeholder="Enter Your Email ID" required>
  				</div>
 				<div class="container text-center">
 					<a href="/" class="btn btn-outline-dark">BACK</a>
 					<button type="submit" class="btn btn-primary">Submit Feedback</button>
 				</div>
   			</form>
   			</div>
   			</div>
  	</div>
   </body>
</html>