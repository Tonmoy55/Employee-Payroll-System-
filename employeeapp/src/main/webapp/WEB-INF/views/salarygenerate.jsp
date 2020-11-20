<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Salary Generate</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/home-loggedin" class="navbar-brand">Techhub</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<!-- <li><a href="/login">Login</a></li>
					<li><a href="/register">New Registration</a></li>
					<li><a href="/show-users">All Users</a></li> -->
				</ul>
			</div>
		</div>
	</div>


	<c:choose>
		<c:when test="${mode=='MODE_GENERATE_SALARY' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h2>Employee Salary Generation</h2>
					<h3></h3>
				</div>
			</div>

			<div class="container text-center">

				<hr>

				<form class="form-horizontal" method="POST" action="salarygeneration">
					<div class="form-group">
						<label class="control-label col-md-3">Basic Salary of the
							lowest Grade: </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="basicSalaryOfLowestGrade"
								value="${salaryGenerationDTO.basicSalaryOfLowestGrade}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Balance of the
							company bank account:</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="companyAccountBalance"
								value="${salaryGenerationDTO.companyAccountBalance }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Employee ID:</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employeeId"
								value="${salaryGenerationDTO.employeeId }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Generate" />
					</div>
				</form>
			</div>

		</c:when>
		
		<c:when test="${mode=='MODE_SUCCESS' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center alert alert-success">
					<h1>Salary has been Generated Successfully</h1>
					<h3></h3>
				</div>
			</div>
		</c:when>
		
	</c:choose>



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>