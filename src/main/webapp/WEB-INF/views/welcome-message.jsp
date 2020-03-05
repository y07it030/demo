<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<html>
<!doctype html>
<html lang="en">
<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<nav class="nav justify-content-center">
	<div class="nav navbar-nav">
		<a class="nav-link" href="#">Welcome MR. ${inputEmail}: You may reset the password below</a>
	</div> 
</nav>
<body class="text-center">
	<div class="container">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-4">
				<i class="fa fa-align-center" aria-hidden="true"> <spring:form
						action="./admin/reset" method="get" modelAttribute="customerBean">
						<a class="nav-link">Enter Password</a>
						<a class="nav-link"><spring:errors path="password"></spring:errors></a>
						<spring:input path="password" type="text"  />
							<a class="nav-link">Confirm Password</a>
						<a class="nav-link"><spring:errors path="confirmpassword"></spring:errors></a>
							<spring:input path="confirmpassword" type="password"  />
								<button class="btn btn-lg btn-primary btn-block" type="submit">Reset</button>
					</spring:form>
				</i>
			</div>
			<div class="col-5"></div>
		</div>
	</div>
</body>
</html>
</html>

</html>
