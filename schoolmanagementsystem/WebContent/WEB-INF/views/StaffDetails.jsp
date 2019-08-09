<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #4CAF50;
  color: white;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<table class="table">
<thead>
	<tr>
	<th>STAFF_ID<th>STAFF_NAME<th>DOB<th>GENDER<th>DESIGNATION<th>SALARY<th>ADDRESS<th>CONTACT_NUMBER<th>MAIL_ID<th>EXPERIENCE<th>YEAR_PASSED_OUT<th>DOJ<th>COUNTRY<th>STATES
	</tr>
	</thead>
	<tbody>
	<c:forEach var="std" items="${list1}">
	<tr>
	<td><c:out value="${std.staff_id}"></c:out></td>
	<td><c:out value="${std.staff_name}"></c:out></td>
	<td><c:out value="${std.date_of_birth}"></c:out></td>
	<td><c:out value="${std.gender}"></c:out></td>
	<td><c:out value="${std.designation}"></c:out></td>
	<td><c:out value="${std.salary}"></c:out></td>
	<td><c:out value="${std.address}"></c:out></td>
	<td><c:out value="${std.contact_number}"></c:out></td>
	<td><c:out value="${std.email_id}"></c:out></td>
	<td><c:out value="${std.experience}"></c:out></td>
	<td><c:out value="${std.year_passed_out}"></c:out></td>
	<td><c:out value="${std.doj}"></c:out></td>
	<td><c:out value="${std.countryinfo.country_name}"></c:out></td>
	<td><c:out value="${std.countryinfo.state_name}"></c:out></td>
	</tr>
	</c:forEach>
	</tbody>
</table><br>
</div>
</body>
</html>