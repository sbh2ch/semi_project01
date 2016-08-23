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
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Sign up</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

<link href="css/signin.css" rel="stylesheet">
<link href="css/bootstrap-social.css" rel="stylesheet">

<script src="js/ie-emulation-modes-warning.js"></script>

</head>

<body>

	<div class="container">
		<form class="form-signin" action="/semiProject01/signUp" method="post">
			<br>
			<c:if test="${not empty msg}">
				<h3>${msg}</h3>
			</c:if>
			<c:if test="${empty msg}">
				<br>
			</c:if>
			<label for="inputName" class="sr-only">Name</label> 
			<input type="text" id="inputName" name="name" class="form-control" placeholder="Pick a username" required autofocus> 
			<br>
			<label for="inputEmail" class="sr-only">Email address</label> 
			<input type="email" id="inputEmail" name="email" class="form-control" placeholder="Your email address" required> 
			<br>
			<label for="inputPassword" class="sr-only">Password</label> 
			<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Create a password" required>
			<h6 style="color: gray;">Use at least four characters.</h6>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign up for GroundBnB</button>
			<br>
			<br>
		</form>

	</div>


	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
