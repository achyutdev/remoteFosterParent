<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<li class="media"><a class="list-group-item"
				data-toggle="collapse" href="#collapse1" aria-expanded="false"
				aria-controls="collapse1">
					<div class="media-left">
						<img class="media-object"
							src="<c:url value='/resources/images/children2.jpg'/>"
							alt="Child">
					</div>
					<div class="media-body">
						<h4 class="media-heading">FistName Last Name</h4>
						<h5>Age : 7</h5>
						<h5>
							<i>Gaikhur 9 Gorkha, Nepal</i>
						</h5>
						<p>only first line of discreption hereonly first line of
							discreption hereonly first line of discreption hereonly first
							line of discreption here</p>
					</div>
			</a></li>
			<div class="collapse panel panel-default" id="collapse1">
				<div class="panel-body">
					<div class="row">
						<div class="col-md-6">Detail discreption of childern here
							Detail discreption of childern here Detail discreption of
							childern here Detail discreption of childern here Detail
							discreption of childern here Detail discreption of childern here
							Detail discreption of childern here Detail discreption of
							childern here Detail discreption of childern here Detail
							discreption of childern here Detail discreption of childern here
							Detail discreption of childern here Detail discreption of
							childern here Detail discreption of childern here.</div>
						<div class="col-md-5">
							<table class="table">
								<thead>
									<tr>
										<th>Category</th>
										<th>Support Need</th>
										<th>Collected Donation</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Health</td>
										<td>$234</td>
										<td>$100</td>
									</tr>
									<tr>
										<td>Education</td>
										<td>$234</td>
										<td>$100</td>
									</tr>
									<tr>
										<td>Shelter</td>
										<td>$234</td>
										<td>$100</td>
									</tr>
								</tbody>
							</table>
						</div>

					</div>
					<a href="google.com" title="">
						<button type="button help-me-btn" class="btn btn-success">Help Me!</button>
					</a>
				</div>
			</div>

			<li class="media"><a class="list-group-item"
				data-toggle="collapse" href="#collapse2" aria-expanded="false"
				aria-controls="collapse2">
					<div class="media-left">
						<img class="media-object"
							src="<c:url value='/resources/images/children3.jpg'/>"
							alt="Child">
					</div>
					<div class="media-body">
						<h4 class="media-heading">FistName Last Name</h4>
						<h5>Age : 7</h5>
						<h5>
							<i>Gaikhur 9 Gorkha, Nepal</i>
						</h5>
						<p>only first line of discreption hereonly first line of
							discreption hereonly first line of discreption hereonly first
							line of discreption here</p>
					</div>
			</a></li>
			
			<div class="collapse panel panel-default" id="collapse2">
				<div class="panel-body">
					<div class="row">
						<div class="col-md-6">Detail discreption of childern here
							Detail discreption of childern here Detail discreption of
							childern here Detail discreption of childern here Detail
							discreption of childern here Detail discreption of childern here
							Detail discreption of childern here Detail discreption of
							childern here Detail discreption of childern here Detail
							discreption of childern here Detail discreption of childern here
							Detail discreption of childern here Detail discreption of
							childern here Detail discreption of childern here.</div>
						<div class="col-md-6">
							<table class="table">
								<thead>
									<tr>
										<th>Category</th>
										<th>Support Need</th>
										<th>Collected Donation</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Health</td>
										<td>$234</td>
										<td>$100</td>
									</tr>
									<tr>
										<td>Education</td>
										<td>$234</td>
										<td>$100</td>
									</tr>
									<tr>
										<td>Shelter</td>
										<td>$234</td>
										<td>$100</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<a href="google.com" title="">
						<button type="button" class="btn btn-success help-me-btn">Help Me!</button>
					</a>
				</div>
			</div>
		</ul>
	</div>



<%@ include file="../views/common/linkToJs.jsp"%>

</body>
</html>
