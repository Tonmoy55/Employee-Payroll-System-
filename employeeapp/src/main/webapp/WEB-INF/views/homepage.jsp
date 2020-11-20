<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Home Page</title>
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
			<a href="/home-loggedin" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/home">Log Out</a></li>
					<!-- <li><a href="/register">New Registration</a></li>
					<li><a href="/show-users">All Users</a></li> -->
				</ul>
			</div>
		</div>
	</div>


	<c:choose>
		<c:when test="${mode=='MODE_HOME_LOGGEDIN' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h2>Welcome to Employee Payroll System</h2>
					<h3></h3>
				</div>
			</div>

			<div class="container text-left">
				<div class="form-group ">
					<button class="btn btn-primary"
						onclick="window.location.href='/gradesetup';">Grade Setup</button>
					<button class="btn btn-primary"
						onclick="window.location.href='/bankaccountsetup';">Bank
						Account Setup</button>
					<button class="btn btn-primary"
						onclick="window.location.href='/employeeinformationsetup';">
						Employee Information Setup</button>
					<button class="btn btn-primary"
						onclick="window.location.href='/generatesalary';">
						Generate Salary</button>
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