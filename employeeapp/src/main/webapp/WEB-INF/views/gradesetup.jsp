<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Grade Setup</title>
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

		<c:when test="${mode=='MODE_GRADESETUP' }">
			<div class="container text-center">
				<h3>Grade Setup</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="savegradesetup">
					<input type="hidden" name="id" value="${grade.gradeid }" />
					<div class="form-group">
						<label class="control-label col-md-3">Grade Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="gradename"
								value="${grade.gradename }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>
					<div>
						<a class="btn btn-primary" href="/show-all-grade">Show All
							Grade/Rank</a>
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





		<c:when test="${mode=='SHOW_ALL_GRADES' }">
			<div class="container text-center" id="tasksDiv">
				<h3>All Grade/Ranks</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>GradeID</th>
								<th>GradeName</th>
								<th>Delete</th>
								<th>Edit</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="grade" items="${grades }">
								<tr>
									<td>${grade.id }</td>
									<td>${grade.gradename }</td>
									<td><a href="/delete-grade?id=${grade.id }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-grade?id=${grade.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_UPDATE_GRADE' }">
			<div class="container text-center">
				<h3>Update Grade</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="updategradesetup">
					<input type="hidden" name="id" value="${grade.id}" />
					<div class="form-group">
						<label class="control-label col-md-3">GradeName</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="gradename"
								value="${grade.gradename }" />
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