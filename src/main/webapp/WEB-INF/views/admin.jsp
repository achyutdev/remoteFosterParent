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
<style>
body {
	padding-top: 50px;
	padding-bottom: 20px;
}
</style>
<link href="<c:url value= "/resources/css/style.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">


</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Remote Foster</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<form class="navbar-form navbar-right" role="form">
				<div class="form-group">
					<span>Toggle navigation</span>
				</div>

			</form>
		</div>
		<!--/.navbar-collapse -->
	</div>
	</nav>
	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-8">
				<h2>List of Children</h2>
				<!-- Large modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-target=".bs-example-modal-lg">Add</button>

				<div class="modal fade bs-example-modal-lg" tabindex="-1"
					role="dialog" aria-labelledby="myLargeModalLabel">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<form action="post" class="form-horizontal">
								<form class="form-horizontal">
									<div class="form-group">
										<h4 style="padding: 10px 30px">Personal Detail</h4>
										<label class="control-label col-sm-2" for="firstName">First
											Name:</label>
										<div class="col-sm-10 col-md-8">
											<input type="text" class="form-control" id="firstName"
												path="firstName" placeholder="Enter First Name">

										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-2" for="lastName">Last
											Name:</label>
										<div class="col-sm-10 col-md-8">
											<input type="text" class="form-control" id="lastName"
												path="lastName" placeholder="Enter Last Name" />
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-2" for="educationalStatus">Educational
											Status:</label>
										<div class="col-sm-10 col-md-8">
											<input type="text" class="form-control"
												id="educationalStatus" path="educationalStatus"
												placeholder="Enter Educational Status">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-2" for="dateOfBirth">Date
											of Birth:</label>
										<div class="col-sm-10 col-md-8">
											<input type="date" class="form-control" id="dateOfBirth"
												path="dob" placeholder="Enter Date of birth">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-2" for="summary">Summary:</label>
										<div class="col-sm-10 col-md-8">
											<input type="text" class="form-control" id="dateOfBirth"
												path="description" placeholder="Enter Date of birth">
										</div>
									</div>
									<h4 style="padding: 10px 20px">Address</h4>
									<div class="form-group">
										<label class="control-label col-sm-2" for="country">Country:</label>
										<div class="col-sm-10 col-md-8">
											<input type="text" class="form-control" id="country"
												path="country" placeholder="Enter Country">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-2" for="state">State:</label>
										<div class="col-sm-10 col-md-8">
											<input type="text" class="form-control" id="state"
												path="state" placeholder="Enter State">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-2" for="city">City:</label>
										<div class="col-sm-10 col-md-8">
											<input type="text" class="form-control" id="citry"
												path="city" placeholder="Enter City">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-2" for="zip">ZipCode:</label>
										<div class="col-sm-10 col-md-8">
											<input type="text" class="form-control" id="zip"
												path="zipCode" placeholder="Enter Zip Code">
										</div>
									</div>
									<div class="form-group">
										<div class="col-sm-offset-2 col-sm-10">
											<button type="submit" class="btn btn-default">Register</button>
										</div>
									</div>
								</form>
						</div>
					</div>
				</div>
				<form:form method="get" action="<c:url value="/admin/"/>">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>Firstname</th>
								<th>Lastname</th>
								<th>Country</th>
								<th>Date of birth</th>
								<th>Educational Status</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${children}" var="children">
								<tr>
									<td>This is the start</td>
									<td><c:out value="${children.firstName}" /></td>
									<td><c:out value="${children.lastName}" /></td>
									<td><c:out value="${children.country}" /></td>
									<td><c:out value="${children.dob}" /></td>
									<td><c:out value="${children.educationalStatus}" /></td>
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
							<th>Firstname</th>
							<th>Lastname</th>
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
							<th>Firstname</th>
							<th>Lastname</th>
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