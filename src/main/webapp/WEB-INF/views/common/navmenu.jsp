
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
<!-- 			<sec:authorize access="hasRole('ROLE_USER')"> -->
				
<!-- 			</sec:authorize> -->


			<sec:authorize   access="isAuthenticated()">
				<a class="navbar-brand"
					href="${pageContext.request.contextPath}/admin">Remote Foster
					Parent</a>
			</sec:authorize>
			<sec:authorize access="isAnonymous()">
				<a class="navbar-brand"
					href="${pageContext.request.contextPath}">Remote Foster
					Parent</a>
			</sec:authorize>


		</div>
		<ul class="nav navbar-nav navbar-header">
		</ul>
		<ul class="nav navbar-nav navbar-right navbar-header">
			<li><a href="${pageContext.request.contextPath}/childrenlist">Help
					Them</a></li>
			<li><a href="${pageContext.request.contextPath}/contactUs">Contact</a></li>
			<li><a href="${pageContext.request.contextPath}/aboutUs">About
					US</a></li>

			<sec:authorize access="hasRole('ROLE_USER')">

				<li role="presentation" class="dropdown"><a
					class="dropdown-toggle" data-toggle="dropdown" href="#"
					role="button" aria-haspopup="true" aria-expanded="false">Parent
						Name <span class="caret"></span>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li><a href="#">Account</a></li>
						<li><a href="<c:url value="j_spring_security_logout" />">Logout</a></li>
					</ul></li>


			</sec:authorize>

			<sec:authorize access="hasRole('ROLE_ADMIN')">

				<li role="presentation" class="dropdown"><a
					class="dropdown-toggle" data-toggle="dropdown" href="#"
					role="button" aria-haspopup="true" aria-expanded="false">Admin
						Name <span class="caret"></span>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li><a href="#">Account</a></li>
						<li><a href="<c:url value="j_spring_security_logout" />">Logout</a></li>
					</ul></li>


			</sec:authorize>

		</ul>
	</div>
</nav>