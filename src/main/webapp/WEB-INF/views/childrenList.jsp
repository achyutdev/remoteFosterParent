<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ page session="false"%>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Remote Foster Parent</title>

<%@ include file="../views/common/linkTostyle.jsp"%>

</head>
<body>
	<%@ include file="../views/common/navmenu.jsp"%>

	<div class="container">
		<h3>
			<strong>Help them</strong>
		</h3>
		<ul class="media-list">

			<c:forEach items="${childList}" var="chdrn" varStatus="mainloop">
				<li class="media"><a class="list-group-item"
					data-toggle="collapse" href="#collapse${mainloop.index}"
					aria-expanded="false" aria-controls="collapse${mainloop.index}">
						<div class="media-left">
							<img class="media-object"
								src="<c:url value='/resources/images/children${mainloop.index+1}.jpg'/>"
								alt="Child">
						</div>
						<div class="media-body">
							<h4 class="media-heading">${chdrn.firstName}
								${chdrn.lastName}</h4>
							<h5>${chdrn.dob}</h5>
							<h5>
								<i>Address :${chdrn.address.street} ${chdrn.address.city}
									${chdrn.address.state} ${chdrn.address.country}</i>
							</h5>
							<p>${fn:substring(chdrn.description, 0, 15)}</p>
						</div>
				</a></li>

				<div class="collapse panel panel-default"
					id="collapse${mainloop.index}">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-6">${chdrn.description}</div>
							<div class="col-md-5">
								<table class="table">
									<thead>
										<tr>
											<th>Id</th>
											<th>Category</th>
											<th>Support Need</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${chdrn.supportNeeds}" var="supportNeed"
											varStatus="loop">
											<tr>
												<td>${loop.index+1}</td>
												<td>${supportNeed.category}</td>
												<td>${supportNeed.fee}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>

						</div>
						<hr>



					<%-- 	<sec:authorize access="isAuthenticated()"></sec:authorize> --%>
						
<%-- 						<sec:authorize ifAnyGranted roles="ROLE_ADMIN">
						<a href="google.com" title="">
								<button type="button help-me-btn" class="btn btn-success">Help
									Me!</button>
							</a>
							<!-- <a href="google.com" title="">
								<button type="button help-me-btn" class="btn btn-warning">Add
									Support Need</button>
							</a>
							<a href="google.com" title="">
								<button type="button help-me-btn" class="btn btn-warning">Add
									Expenditure</button>
							</a> -->
						</sec:authorize ifAnyGranted> --%>
					</div>
				</div>

			</c:forEach>
		</ul>
	</div>



	<%@ include file="../views/common/linkToJs.jsp"%>

</body>
</html>
