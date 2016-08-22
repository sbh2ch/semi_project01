<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>





<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Ground BnB</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<form class="navbar-form navbar-right" action="/semiProject01/login/loginForm" accept-charset="utf-8" method="get">
				<c:choose>
					<c:when test="${empty user}">
						<button type="submit" class="btn btn-success">Sign in / up</button>
					</c:when>
					<c:otherwise>
						<c:choose>
							<c:when test="${user != fb}">
								<a style="text-decoration: none; color: white"><c:out value="${user}"/>님 환영합니다.</a>
								<div class="fb-login-button" data-max-rows="1" data-size="large" data-show-faces="false" data-auto-logout-link="true"></div>
							</c:when>
							<c:otherwise>
								<a style="text-decoration: none; color: white"><c:out value="${user}"/>님 환영합니다.</a>
								<button type="submit" class="btn btn-danger">Log out</button>							
							</c:otherwise>						
						</c:choose>
					</c:otherwise>
				</c:choose>
			</form>
		</div>
	</div>
</nav>

