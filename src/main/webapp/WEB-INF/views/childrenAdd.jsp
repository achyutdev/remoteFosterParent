<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%><html>
<head>

<title>Admin</title>

<%@ include file="../views/common/linkTostyle.jsp"%>

</head>
<body>
	<%@ include file="../views/common/navmenu.jsp"%>
	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-8">
				<h2>Add Children</h2>
				<div class="modal fade bs-example-modal-lg" tabindex="-1"
					role="dialog" aria-labelledby="myLargeModalLabel">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<form class="form-horizontal" role="form" method="post"
								action="${contextPath}/childrenAdd"
								modelAttribute="childrenAdd">
								<div class="form-group">
									<h4 style="padding: 10px 30px">Personal Detail</h4>
									<label class="control-label col-sm-2" for="firstName">First
										Name:</label>
									<div class="col-sm-10 col-md-8">
										<!-- <input type="text" class="form-control" id="firstName"
												path="firstName" placeholder="Enter First Name"> -->
										<form:input path="firstName" cssClass="form-control"
											placeholder="Enter First Name" />

									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="lastName">Last
										Name:</label>
									<div class="col-sm-10 col-md-8">
										<!-- <input type="text" class="form-control" id="lastName"
												path="lastName" placeholder="Enter Last Name" /> -->
										<form:input path="lastName" cssClass="form-control"
											placeholder="Enter Last Name" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="educationalStatus">Educational
										Status:</label>
									<div class="col-sm-10 col-md-8">
										<!-- <input type="text" class="form-control"
												id="educationalStatus" path="educationalStatus"
												placeholder="Enter Educational Status"> -->
										<form:input path="educationalStatus" cssClass="form-control"
											placeholder="Enter Educational Status" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="dateOfBirth">Date
										of Birth:</label>
									<div class="col-sm-10 col-md-8">
										<!-- <input type="date" class="form-control" id="dateOfBirth"
												path="dob" placeholder="Enter Date of birth"> -->
										<form:input path="dob" cssClass="form-control" type="date"
											id="date_of_birth" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="summary">Summary:</label>
									<div class="col-sm-10 col-md-8">
										<!-- <input type="text" class="form-control" id="dateOfBirth"
												path="description" placeholder="Enter Date of birth"> -->
										<form:textarea path="description" cssClass="form-control"
											rows="5" id="desc" placeholder="Enter short summary" />
									</div>
								</div>
								<h4 style="padding: 10px 20px">Address</h4>
								<div class="form-group">
									<label class="control-label col-sm-2" for="country">Country:</label>
									<div class="col-sm-10 col-md-8">
										<!-- <input type="text" class="form-control" id="country"
												path="country" placeholder="Enter Country"> -->
										<form:input path="country" cssClass="form-control"
											placeholder="Enter Country" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="state">State:</label>
									<div class="col-sm-10 col-md-8">
										<!-- <input type="text" class="form-control" id="state"
												path="state" placeholder="Enter State"> -->
										<form:input path="state" cssClass="form-control"
											placeholder="Enter State" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="city">City:</label>
									<div class="col-sm-10 col-md-8">
										<!-- <input type="text" class="form-control" id="citry"
												path="city" placeholder="Enter City"> -->
										<form:input path="citry" cssClass="form-control"
											placeholder="Enter City" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="zip">ZipCode:</label>
									<div class="col-sm-10 col-md-8">
										<input type="text" class="form-control" id="zip"
											path="zipCode" placeholder="Enter Zip Code">
										<form:input path="zipCode" cssClass="form-control"
											placeholder="Enter Zip Code" />
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
			</div>
		</div>
	</div>
</body>
</html>