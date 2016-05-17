<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
<%@ include file="../views/common/linkTostyle.jsp"%>
<link href="<c:url value= "/resources/css/style.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">


</head>
<body>
	<%@ include file="../views/common/navmenu.jsp"%>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-8">
				<h2>List of Children</h2>
				<!-- Large modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-target=".bs-example-modal-lg">Add</button>
				<form:form  modelAttribute="admin" method="get">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Country</th>
								<th>Date of birth</th>
								<th>Educational Status</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${children}" var="kid">
								<tr>
									<td>This is the start</td>
									<td><c:out value="${kid.firstName}"/></td>
									<td>${kid.lastName} /></td>
									<td>${kid.country} /></td>
									<td>${kid.dob} /></td>
									<td>${kid.educationalStatus} /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</form:form>
				<hr>
				<h2>List of Foster Parents</h2>

				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Country</th>
							<th>Occupation</th>
							<th>Email</th>
							<th>Phone Number</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${fosterParent}" var="children">
							<tr>
								<td>This is the start</td>
								<td><c:out value="${fosterParent.firstName}" /></td>
								<td><c:out value="${fosterParent.lastName}" /></td>
								<td><c:out value="${fosterParent.country}" /></td>
								<td><c:out value="${fosterParent.email}" /></td>
								<td><c:out value="${fosterParent.phone}" /></td>
								<td><button type="button" class="btn btn-info btn-sm">new</button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-md-4">
				<h2>Donation Details</h2>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Amount</th>
							<th>Date</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${donation}" var="children">
							<tr>
								<td>This is the start</td>
								<td><c:out value="${donation.firstName}" /></td>
								<td><c:out value="${donation.lastName}" /></td>
								<td><c:out value="${donation.amount}" /></td>
								<td><c:out value="${donation.date}" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<%@ include file="../views/common/footer.jsp"%>
	</div>
	<script src="<c:url value="/resources/js/jquery-1.11.2.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</body>
</html>