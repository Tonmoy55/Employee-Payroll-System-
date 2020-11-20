<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Bank Account Setup</title>
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
					<!-- <li><a href="/login">Login</a></li>
					<li><a href="/register">New Registration</a></li>
					<li><a href="/show-users">All Users</a></li> -->
				</ul>
			</div>
		</div>
	</div>


	<c:choose>
		<c:when test="${mode=='MODE_EMPLOYEE_INFORMATION_SETUP' }">
			<div class="container text-center">
				<h3>Employee Setup</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="saveemployee">
					<input type="hidden" name="id" value="${employee.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Employee Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employeename"
								value="${employee.employeename }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Grade/Rank</label>
						<div class="col-md-7">
							<select id="grade" name="grade" class="form-control">
								<option>--Please Select--</option>
								<c:forEach var="grade" items="${gradeList }">
									<option value="${grade.id}">${grade.gradename}</option>
								</c:forEach>
							</select>
						</div>
					</div>


					<div class="form-group">
						<label class="control-label col-md-3">Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="address"
								value="${employee.address }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Mobile No</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="mobileno"
								value="${employee.mobileno }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Bank Account</label>
						<div class="col-md-7">
							<select id="account" name="account" class="form-control">
								<option>--Please Select--</option>
								<c:forEach var="account" items="${accountList }">
									<option value="${account.id}">${account.accountno}</option>
								</c:forEach>
							</select>
						</div>
					</div>

					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>
					<div>
						<a class="btn btn-primary" href="/show-all-employee">Show All
							Employee</a>
					</div>

				</form>
				<div></div>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_SUCCESS' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center alert alert-success">
					<h1>Data has been Saved Successfully</h1>
					<h3></h3>
				</div>
			</div>
		</c:when>

		<c:when test="${mode=='SHOW_ALL_EMPLOYEE' }">
			<div class="container text-center" id="tasksDiv">
				<h3>Employee Information</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Employee ID</th>
								<th>Employee Name</th>
								<th>Grade</th>
								<th>Address</th>
								<th>Mobile No</th>
								<th>Bank Account No</th>
								<th>Delete</th>
								<th>Edit</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="employee" items="${employees }">
								<tr>
									<td>${employee.id}</td>
									<td>${employee.employeename}</td>
									<td>${employee.grade.gradename}</td>
									<td>${employee.address}</td>
									<td>${employee.mobileno}</td>
									<td>${employee.bankAccount.accountno}</td>
									<td><a href="/delete-employee?id=${employee.id }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-employee?id=${employee.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_UPDATE_EMPLOYEE' }">
			<div class="container text-center">
				<h3>Employee Setup</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="updateemployee">
					<input type="hidden" name="id" value="${employee.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Employee Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employeename"
								value="${employee.employeename }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Grade/Rank</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="grade.id"
								value="${employee.grade.id }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="address"
								value="${employee.address }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Mobile No</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="mobileno"
								value="${employee.mobileno }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Bank Account</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="bankAccount.id"
								value="${employee.bankAccount.id }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Update" />
					</div>
				</form>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_UPDATE_SUCCESS' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center alert alert-success">
					<h1>Data has been Updated Successfully</h1>
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