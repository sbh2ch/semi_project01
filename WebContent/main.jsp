<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<title>GroundBnB</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

<link href="css/jumbotron.css" rel="stylesheet">

<script src="js/ie-emulation-modes-warning.js"></script>

</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<%@ include file="attach/header.jsp"%>
		</div>
	</nav>

	<div class="jumbotron" style="background: url('images/img2.jpg'); background-size: 100%; ">
		<div class="container" align="center">
			<h1 style="color: white">Hello, world!</h1>
			<br>
			<br>
			<br>
		</div>
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<form class="form-inline" style="text-align: center;">
					<div class="form-group">
						<input type="text" class="form-control" name="destination" placeholder="어디로 가세요?">
					</div>
					<div class="form-group">
						<input type="date" class="form-control" name="departDate">
					</div>
					&nbsp;&nbsp;<a style="color:white; font-size: 20px; font-weight: bold;">→</a>&nbsp;&nbsp;
					<div class="form-group">
						<input type="date" class="form-control" name="destDate">
					</div>
					<div class="form-group">
						<select class="form-control col-md-2">
							<c:forEach begin="1" end="16" var="n">
								<option>숙박인원 ${n}명</option>
							</c:forEach>
							<option>숙박인원 16+명</option>
						</select>
					</div>
					<div class="form-group">
						<button type="submit" class="form-control btn btn-primary">숙소 검색</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<img alt="" src="images/house1.jpg" width="90%" height="240px;" class="img-rounded">
				<h3>깔끔한 방</h3>
				<p>개인실, 숙박 인원 2명</p>
			</div>
			<div class="col-md-4">
				<img alt="" src="images/house2.jpg" width="90%" height="240px;" class="img-rounded">
				<h3>상현이형 방</h3>
				<p>단체실, 숙박 인원 5명</p>
			</div><div class="col-md-4">
				<img alt="" src="images/house3.jpg" width="90%" height="240px;" class="img-rounded">
				<h3>연결이형 방</h3>
				<p>개인실, 숙박 인원 1명</p>
			</div>
		</div>

		<hr>
		<footer>
			<%@ include file="attach/footer.jsp"%>
		</footer>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
