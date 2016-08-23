<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	//pageContext.setAttribute("user", "fb");
%>
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

	<div class="jumbotron">
		<div class="container">
			<h1>Hello, world!</h1>
			<p>This is a template for a simple marketing or informational website. It includes a large callout called a jumbotron and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a>
			</p>
		</div>
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<form class="form-inline">
					<div class="form-group">
						<input type="text" class="form-control" name="destination" placeholder="어디로 가세요?">
					</div>
					<div class="form-group">
						<select class="form-control">
							<c:forEach begin="2016" end="2018" step="1" var="val">
								<option>${val}</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<select class="form-control col-md-1">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>
					</div>
					<div class="form-group">
						<select class="form-control col-md-1">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>
					</div>
					&nbsp;&nbsp;→&nbsp;&nbsp;
					<div class="form-group">
						<select class="form-control">
							<c:forEach begin="2016" end="2018" step="1" var="val">
								<option>${val}</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<select class="form-control col-md-1">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>
					</div>
					<div class="form-group">
						<select class="form-control col-md-1">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>
					</div>
					<div class="form-group">
						<select class="form-control col-md-2">
							<c:forEach begin="1" end="16" var="n">
								<option>숙박인원 ${n}명</option>
							</c:forEach>
							<option>숙박인원 16+명</option>
						</select>
					</div>
				</form>
			</div>
		</div>
	</div>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-4">
				<h2>Heading</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.</p>
				<p>
					<a class="btn btn-default" href="#" role="button">View details &raquo;</a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>Heading</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.</p>
				<p>
					<a class="btn btn-default" href="#" role="button">View details &raquo;</a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>Heading</h2>
				<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
				<p>
					<a class="btn btn-default" href="#" role="button">View details &raquo;</a>
				</p>
			</div>
		</div>

		<hr>
<!-- ss -->
		<footer>
			<%@ include file="attach/footer.jsp"%>
		</footer>
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
