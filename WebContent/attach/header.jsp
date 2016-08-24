<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script>
	window.fbAsyncInit = function() {
		FB.init({
			appId : '1663112637341773',
			status : true,
			cookie : true,
			xfbml : true
		});

		FB.getLoginStatus(function(response) {
			if (response.status === 'connected') {

				FB.api('/me', function(user) {
					if (user) {
						var image = document.getElementById('image');
						image.src = 'http://graph.facebook.com/' + user.id + '/picture';
						var name = document.getElementById('name');
						name.innerHTML = user.name
						var id = document.getElementById('id');
						id.innerHTML = user.id
					}
				});

			} else if (response.status === 'not_authorized') {

			} else if (response.status === 'unknown') {

			} else {

			}
		});

		FB.Event.subscribe('auth.login', function(response) {
			document.location.reload();
		});

		FB.Event.subscribe('auth.logout', function(response) {
			document.location.reload();
		});
	};

	(function(d) {
		var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];
		if (d.getElementById(id)) {
			return;
		}
		js = d.createElement('script');
		js.id = id;
		js.async = true;
		js.src = "//connect.facebook.net/en_US/all.js";
		ref.parentNode.insertBefore(js, ref);
	}(document));

	function fb_logout() {
		FB.logout(function(response) {
			// user is now logged out
		});
		
		setTimeout(function(){
			var URL = "/semiProject01/login/logout";
			location.replace(URL);
		}, 500);
	}
</script>


<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/semiProject01/main">Ground BnB</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<form class="navbar-form navbar-right" action="/semiProject01/login/loginForm" accept-charset="utf-8" method="get">
				<c:choose>
					<c:when test="${empty user}">
						<button type="submit" class="btn btn-success">Sign in / up</button>
					</c:when>
					<c:otherwise>
						<c:choose>
							<c:when test="${not empty user.fb}">
								<ul class="nav nav-pills" role="tablist">
									<li role="presentation" class="active">
										<a onclick="fb_logout()" class="btn btn-primary">FB out</a>
									</li>
									<li role="presentation" class="dropdown">
										<a id="drop4" href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" role="button" aria-expanded="false"> ${user.name} <span class="caret"></span>
										</a>
										<ul id="menu1" class="dropdown-menu" role="menu" aria-labelledby="drop4">
											<li role="presentation">
												<a role="menuitem" tabindex="-1" href="#">Action</a>
											</li>
											<li role="presentation">
												<a role="menuitem" tabindex="-1" href="#">Another action</a>
											</li>
											<li role="presentation">
												<a role="menuitem" tabindex="-1" href="#">Something else here</a>
											</li>
											<li role="presentation" class="divider"></li>
											<li role="presentation">
												<a role="menuitem" tabindex="-1" href="#">Separated link</a>
											</li>
										</ul>
									</li>
								</ul>
							</c:when>
							<c:otherwise>
								<a style="text-decoration: none; color: white"><c:out value="${user.fb}" />님 환영합니다.</a>
								<a type="submit" href="/semiProject01/login/logout" class="btn btn-danger">NM out</a>
							</c:otherwise>
						</c:choose>
					</c:otherwise>
				</c:choose>
			</form>
		</div>
	</div>
</nav>

