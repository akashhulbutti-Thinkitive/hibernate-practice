<%@ page import="java.util.List,com.akash.Employee;"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<nav class="navbar navbar-expand navbar-light bg-faded">
		<a class="navbar-brand" href="#">Navbar</a>
		<form action="SearchServlet" method="post"
			class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" name="name" type="text"
				placeholder="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
		<%
		List<Employee> emp = (List) request.getAttribute("list");
		%>
		<div>
			<table class="table">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Salary</th>
				</tr>
				<%
				if (emp != null) {
					for(Employee e:emp){
				%>
				<tr><td><%=e.getEmpid()%></td><td><%=e.getEname()%></td><td><%=e.getSalary()%></td></tr>
				<%}
				} else {
				%>
				<tr>
					<td><h6>Not Found</h6></td>
				</tr>
				<%
				}
				%>
			</table>
		</div>
	</nav>
</body>
</html>