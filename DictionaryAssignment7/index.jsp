<%@ page import="java.util.List,com.akash.models.Dictionary"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dictionary</title>
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
	<div class="row table-bordered">
		<div class="col-lg-6">
			<div class="row mt-4 mb-4 ml-2 mr-2">
				<table class="table">
					<tr>
						<th>Did</th>
						<th>Word</th>
						<th>Meaning</th>
					</tr>
					<%
					List<Dictionary> list = (List) request.getAttribute("list");
					if (list.size() > 0) {
						for (Dictionary di : list) {
					%>
					<tr>
						<td><%=di.getDid()%></td>
						<td><%=di.getWord()%></td>
						<td><%=di.getMeaning()%></td>
					</tr>
					<%
					}
					} else {
					%>
					<tr>
						<td colspan="3">NO Words</td>
					</tr>
					<%
					}
					%>
				</table>
			</div>
		</div>
		<hr/>
		<div class="col-lg-6">
			<div class="row mt-4  ml-2 mr-2">
				<form action="AddWordServlet" method="post" class="form-control mt-2">
					<div class="d-flex justify-content-center mt-2">
						<div class="form-group col-sm-4">
							<input type="text" name="word" placeholder="Enter a Word"
								class="form-control" />
						</div>
						<br />
						<div class="form-group col-sm-4">
							<input type="text" name="meaning" placeholder="Enter its meaning"
								class="form-control" />
						</div>
						<div class="form-group col-sm-4">
							<input type="submit" class="btn btn-sm btn-outline-primary"
								value="Add Word" />
						</div>
					</div>
				</form>
			</div>
		</div>
	</div></div>
</body>
</html>