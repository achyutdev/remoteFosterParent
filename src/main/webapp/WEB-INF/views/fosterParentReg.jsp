<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Remote Foster Parent</title>

<%@ include file="../views/common/linkTostyle.jsp"%>

</head>
<body>
	<%@ include file="../views/common/navmenu.jsp"%>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-7">
				<div class="jumbotron">
					<img class="img-responsive"
						src="<c:url value='/resources/images/home.jpg'/>" alt="Child">
				</div>
			</div>
			<div class="col-md-5">

				<h2>
					<span class="glyphicon glyphicon-user"></span> Register
				</h2>
				<hr />
				<form:form class="form-horizontal" role="form" method="post"
					action="${contextPath}/fosterParentRegSave"
					modelAttribute="fosterParent">
					<div class="form-group">
						<label class="control-label col-sm-3" for="firstName">First
							Name:</label>
						<div class="col-sm-9">
							<%--<form:input type="text" cssClass="form-control" id="firstName"	name="firstName" placeholder="Enter First Name" path="firstName" /> --%>
							<form:input cssClass="form-control"
								placeholder="Enter First Name" path="firstName" />
							<form:errors path="firstName" cssClass="has-error" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="lastName">Last
							Name:</label>
						<div class="col-sm-9">
							<form:input type="text" class="form-control" id="lastName"
								name="lastName" placeholder="Enter Last Name" path="lastName" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="phone">Phone:</label>
						<div class="col-sm-9">
							<form:input type="text" class="form-control" id="phone"
								name="phone" placeholder="Enter Phone Number" path="phone" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3" for="email">Occupation:</label>
						<div class="col-sm-9">
							<form:input type="text" class="form-control" id="occupation"
								name="occupation" placeholder="Enter Occupation"
								path="occupation" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="email">Email:</label>
						<div class="col-sm-9">
							<form:input type="email" class="form-control" id="email"
								name="email" placeholder="Enter Email" path="email" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="pwd">Password:</label>
						<div class="col-sm-9">
							<form:input type="password" class="form-control" id="pwd"
								name="password" placeholder="Enter password" path="password" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="image">Upload
							Image:</label>
						<div class="col-sm-9">
							<form:input type="file" class="form-control" id="pwd" name="file"
								path="image" />
						</div>
					</div>

					<!-- address -->

					<hr />
					<div class="form-group">
						<form:label class="control-label col-sm-3" for="email"
							path="address">Address:</form:label>
						<div class="col-sm-9">
							<div class="form-group">
								<div class="col-sm-7">
									<form:input type="text" class="form-control" id="street"
										name="street" placeholder="Street" path="address.street" />
								</div>
								<div class="col-sm-5">
									<form:input type="text" class="form-control" id="city"
										name="city" placeholder="City" path="address.city" />
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-7">
									<form:input type="text" class="form-control" id="country"
										name="country" placeholder="Country" path="address.country" />
								</div>
								<div class="col-sm-5">
									<form:input pattern="[0-9]{5}" class="form-control"
										id="zipCode" name="zip" placeholder="Zip Code"
										path="address.zipCode" />
								</div>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-7 col-sm-5">
							<button type="submit" class="btn btn-primary">
								<span class="glyphicon glyphicon-floppy-disk"></span> Register
							</button>
							<button type="reset" class="btn btn-info">Reset</button>
						</div>
					</div>

				</form:form>
			</div>
		</div>
	</div>



	<%@ include file="../views/common/linkToJs.jsp"%>

</body>
</html>