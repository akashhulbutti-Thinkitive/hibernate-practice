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
			<div class="col-lg-12 d-flex">
				<div class="col-lg-3">
					<a href="AddServlet" class="btn btn-outline-primary">ADD
						Employee</a>
				</div>
<!-- 				<div class="col-lg-3">
					<a href="ViewEmployeeServlet" class="btn btn-outline-success">View
						Employee</a>
				</div>
				<div class="col-lg-3">
					<a href="UpdateEmployeeServlet" class="btn btn-outline-danger">Update
						Employee</a>
				</div>
				<div class="col-lg-3">
					<a href="DeleteEmployeeServlet" class="btn btn-outline-dark text-dark">Delete
						Employee</a>
				</div> -->
			</div>
		</div><br /><br />
		<div class="row t-4">
		<table class="table"> 
		<tr><th>EID</th><th>ENAME</th><th>E-SALARY</th><th>Delete</th><th>Update</th></tr>
		<%
		List<Employee> emp=(List) request.getAttribute("listView");
		if(emp!=null){ for(Employee e: emp){%>
		<tr><td><%=e.getEmpid()%></td> <td><%=e.getEname()%></td> <td><%=e.getSalary()%></td>
		<td><form class="form-control" action="DeleteEmployeeServlet" method="get">
						<input type="text" class="form-control" name="deleteId" value="<%=e.getEmpid()%>" readonly="readonly" /> <input
							type="submit" value="Delete" class="form-control btn btn-outline-danger" />
					</form></td><td><form class="form-control" action="DeleteEmployeeServlet" method="get">
						<input type="text" name="updateId" class="form-control" value="<%=e.getEmpid()%>" /> <input
							type="submit" value="Update" class="btn btn-outline-warning" />
					</form></td>
		</tr> 
		<% }
		}else{ %><tr><td colspan="3"> <h5>List Is Empty</h5></td></tr><% } %>
		</table>
		</div>
	</div>
</body>
</html>