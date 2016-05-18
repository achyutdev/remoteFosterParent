<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page session="false"%>
<html>
<head>
<title>Remote Foster Parent</title>

<%@ include file="../views/common/linkTostyle.jsp"%>

</head>
<body>
	<%@ include file="../views/common/navmenu.jsp"%>
	<h2>${err}</h2>
	<div class="container">
		<!-- Example row of columns -->
		<c:if test="${message != null}">
			<div class="alert alert-success">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>Success!</strong>${message}
			</div>

		</c:if>
		<c:if test="${param.reg == 1}">
			<div class="alert alert-success">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>Success!</strong>${message}
			</div>

		</c:if>

		<div class="row">
			<div class="col-md-7">
				<div class="jumbotron">
					<img class="img-responsive"
						src="<c:url value='/resources/images/home.jpg'/>" alt="Home">
				</div>
			</div>
			<div class="col-md-5">
				<c:if test="${not empty param.login_error}">
					<font color="red"> Your login attempt was not successful,
						try again.<br /> <br />
					<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />.
					</font>
				</c:if>
				<h2>
					<span class="glyphicon glyphicon-log-in"></span> Login
				</h2>
				<hr />



				<form class="form-horizontal" role="form" method="post"
					action="j_spring_security_check">
					<div class="form-group">
						<label class="control-label col-sm-3" for="email">Username:</label>
						<div class="col-sm-9">
							<input class="form-control" id="username" name="username"
								placeholder="Enter username">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="pwd">Password:</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="pwd"
								name="password" placeholder="Enter password">
						</div>
					</div>

					<hr />

					<div class="form-group">
						<div class="text-right">
							<button type="submit" class="btn btn-primary">
								<span class="glyphicon glyphicon-floppy-disk"></span> Login
							</button>
							<button type="reset" class="btn btn-info">Reset</button>
						</div>
					</div>


				</form>

				<div class="text-right">
					<a href="${pageContext.request.contextPath}/fosterParentReg">
						Register Now</a>
				</div>

			</div>
		</div>
			<%@ include file="../views/common/footer.jsp"%>
	</div>



	<%@ include file="../views/common/linkToJs.jsp"%>

</body>
</html>
