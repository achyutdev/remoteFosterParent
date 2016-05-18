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
				<div class="text-right">
					<form method="get" action="childrenAdd">
						<button type="submit" class="btn btn-primary" data-toggle="modal"
							data-target=".bs-example-modal-lg">Add New</button>
						<!-- 
					<button type="submit">Add New</button> -->
					</form>
				</div>
				<form:form modelAttribute="admin" method="get">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>Full Name</th>
								<!-- <th>Last Name</th> -->

								<!-- <th>Date of birth</th> -->
								<th>Educational Status</th>
								<th>Country</th>
								<th>State</th>
								<th>City</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${children}" var="kid">
								<tr>
									<td>${kid.firstName}${kid.lastName}</td>
									<%-- <td>${kid.lastName}</td> --%>
									<td>${kid.educationalStatus}</td>
									<td>${kid.address.country}</td>
									<td>${kid.address.state}</td>
									<td>${kid.address.city}</td>
									<%-- <td>${kid.dob}</td> --%>

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
							<th>Full Name</th>
							<!-- <th>Last Name</th> -->
							<th>Country</th>
							<th>State</th>
							<th>City</th>
							<th>Occupation</th>
							<th>Email</th>
							<th>Phone Number</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${fosterParent}" var="foster">
							<tr>
								<td>${foster.firstName}${foster.lastName}</td>
								<%-- <td>${foster.lastName}</td> --%>
								<td>${foster.address.country}</td>
								<td>${foster.address.state}</td>
								<td>${foster.address.city}</td>
								<td>${foster.occupation}</td>
								<td>${foster.email}</td>
								<td>${foster.phone}</td>
								<!-- <td><button type="button" class="btn btn-info btn-sm">new</button></td> -->
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
							<th>Full Name</th>
							<!-- <th>Last Name</th> -->
							<th>Amount</th>
							<!-- <th>Date</th> -->
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${donation}" var="donate">
							<tr>
								<td>${donate.firstName} ${donate.lastName}</td>
								<td>${donate.support.donation.amount}</td>
								<%-- <td>${donate.support.donation.amount.donatedDate}</td> --%>
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