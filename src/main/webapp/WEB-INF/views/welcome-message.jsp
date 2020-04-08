<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
						action="reset"  method="get" modelAttribute="cust" >
						<a class="nav-link">Enter Password</a>
						<a class="nav-link"><spring:errors path="password"></spring:errors></a>
						<spring:input path="password" type="text"  />
							<a class="nav-link">Confirm Password</a>
						<a class="nav-link"><spring:errors path="confirmpassword"></spring:errors></a>
							<spring:input path="confirmpassword" type="password"  />
								<button class="btn btn-lg btn-primary btn-block" type="submit">Reset</button>
								</spring:form>
								<form action="upload" method="post" enctype="multipart/form-data"
								>
								<input type="file" name="file"/> 
								<input type="submit"></input>
								</form>
				</i>
			</div>
			<div class="col-5"></div>
			<div class="col-6">
			
			<select>
			<option>---Choose Country</option>
			<c:forEach items="${cust.countries}" var="val">
			<option>${val.key}</option>
			</c:forEach>
			</select> 
			<form action="./getData" class="com.example.demo.Controller.FirstControllerProgramAlongWithBootStrap">
			<button type="submit">Click here</button>
			</form>
			</div>
		</div>
	</div>
</body>
</html>
</html>

</html>
