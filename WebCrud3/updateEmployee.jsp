<%@ page import="java.util.List,com.akash.crudop.model.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hibernate CRUD Operations</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="row mt-4">
			<div class="col-lg-12">
				<div class="col-lg-3">
					<a href="/AddServlet" class="btn btn-outline-primary">ADD
						Employee</a>
				</div>
				<div class="col-lg-3">
					<a href="/ViewServlet" class="btn btn-outline-success">View
						Employee</a>
				</div>
				<div class="col-lg-3">
					<a href="/UpdateServlet" class="btn btn-outline-danger">Update
						Employee</a>
				</div>
				<div class="col-lg-3">
					<a href="/DeleteServlet" class="btn btn-outline-dark text-light">Delete
						Employee</a>
				</div>
			</div>
		</div>
		<div class="row mt-4">
		<% Employee emp = (Employee)request.getAttribute("employee"); %>
		<form action=UpdateEmployeeServlet method="post" class="form-control">
			<div class="form-group">
				<label for="eid">Employee Id </label><input type="text" name="eid"
					class="form-control" value="<%=emp.getEmpid()%>" readonly="readonly"/>
			</div>
			<div class="form-group">
				<label for="ename">Employee Name </label><input type="text"
					name="ename" value="<%=emp.getEname()%>" class="form-control" />
			</div>
			<div class="form-group">
				<label for="esalary">Employee Salary </label><input type="text"
					name="esalary" class="form-control" value="<%=emp.getSalary()%>" />
			</div>
			<div class="d-flex justify-content-center">
				<input type="submit" class="btn btn-outline-success" value="Submit" />
			</div>
		</form>
		</div>
	</div>
</body>
</html>