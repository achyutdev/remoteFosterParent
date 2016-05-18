<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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
</head>
<body>
	<h1>Contact Us</h1>
	<p>Address: ${address}</p>
	<p>Address: ${phoneOffice}</p>
	<p>Address: ${faxOffice}</p>
</body>
</html>
