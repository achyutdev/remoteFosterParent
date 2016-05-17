<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
					<span class="glyphicon glyphicon-log-in"></span> Login
				</h2>
				<hr />

				<c:if test="${not empty error}">
					<div class="error">${error}</div>
				</c:if>
				<c:if test="${not empty msg}">
					<div class="msg">${msg}</div>
				</c:if>

				<form class="form-horizontal" role="form" method="post"
					action="<c:url value='j_spring_security_check' />">
					<div class="form-group">
						<label class="control-label col-sm-3" for="email">Email:</label>
						<div class="col-sm-9">
							<input type="email" class="form-control" id="email" name="email"
								placeholder="Enter email">
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
					<a href="register.html"> Register Now</a>
				</div>

			</div>
		</div>
	</div>



	<%@ include file="../views/common/linkToJs.jsp"%>

</body>
</html>
