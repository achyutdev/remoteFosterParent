<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Page Not Found</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
@media only screen and (max-width: 280px) {
	body, p {
		width: 95%;
	}
	h1 {
		font-size: 1.5em;
		margin: 0 0 0.3em;
	}
}
</style>
<head>
<title>Remote Foster Parent</title>

<%@ include file="../views/common/linkTostyle.jsp"%>

</head>
<body>
	<%@ include file="../views/common/navmenu.jsp"%>
	<h2>${err}</h2>
	<div class="container">
	<h1>About Us</h1>
	<p>${description}</p>
			<%@ include file="../views/common/footer.jsp"%>
	</div>



	<%@ include file="../views/common/linkToJs.jsp"%>

</body>
</html>

