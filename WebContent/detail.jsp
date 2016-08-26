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
<link href="css/bootstrap-social.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<script src="js/ie-emulation-modes-warning.js"></script>
<style>
</style>
</head>

<body>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<%@ include file="attach/header.jsp"%>

	<script>
		function dateChk() {
			var myAlert = document.getElementById("myAlert1");
			var ckin = document.getElementById("checkIn");
			var ckout = document.getElementById("checkOut");
			console.log(ckin.value, ckout.value);
			if (ckin.value >= ckout.value) {
				myAlert.style.display = "inline-block";
				return false;
			}

			return true;
		}
	</script>


	<br>
	<div class="row">
		<div class="col-md-8 col-md-offset-2">
			<div class="container col-md-6" align="center">
				<img class="img-responsive img-rounded" alt="" src="/semiProject01/down?path=${p.imgPath}/&realName=${p.imgRealName}&draw=Y"> <br>
				<form class="form-inline" method="post" accept-charset="utf-8" action="" onsubmit="return dateChk();">
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="form">
								<div class="col-md-12" align="left">




									<fmt:formatDate value="${p.startDate}" pattern="yyyy-MM-dd" var="startDate" />
									<fmt:formatDate value="${p.endDate}" pattern="yyyy-MM-dd" var="endDate" />
									<label for="checkIn">체크인 </label> <br> <input type="date" name="checkIn" class="form-control" id="checkIn" width="50%" min="${startDate}" max="${endDate}" required> <br> <br> <label for="checkOut">체크아웃</label> <br> <input type="date"
										name="checkOut" class="form-control" id="checkOut" width="50%" min="${startDate}" max="${endDate}" required> <br> <br> <label for="ppl">숙박인원</label> <br> <select name="ppl" class="form-control" id="ppl" required>
										<c:forEach begin="1" end="${d.houseCapacity}" step="1" var="cnt">
											<option value="${cnt}">${cnt}명</option>
										</c:forEach>
									</select>
								</div>
								<br>
								<!-- 경보 -->
								<div id="myAlert1" style="display: none;">
								<br>
								<div class="alert alert-danger" role="alert" >
									<strong>경고! </strong>&nbsp;&nbsp;체크인, 체크아웃 날짜를 확인하세요.
								</div>
								</div>
								<!-- 경보 -->
								<div class="col-md-12" align="right">
									<c:if test="${s.hostingStatus == 'W'}">
										<button type="submit" class="form-control btn btn-success">
											<span class="fa fa-credit-card"></span>
											&nbsp;&nbsp;즉시예약하기
										</button>
									</c:if>
									<c:if test="${s.hostingStatus == 'A'}">
										<p class="label label-warning" style="font-size:20px;"><span class="fa fa-comment"></span>&nbsp;&nbsp;예약중</p>
									</c:if>
									<c:if test="${s.hostingStatus == 'C'}">
										<p class="label label-default" style="font-size:20px;"><span class="fa fa-github"></span>&nbsp;&nbsp;예약완료</p>
									</c:if>
									<br>
									<c:if test="${not empty host.fb}">
										<a style="margin-top: 10px" class="btn btn btn-social btn-facebook" href="https://www.facebook.com/${host.email}"><span class="fa fa-facebook"></span>호스트</a>
									</c:if>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
			<div class="container col-md-6" align="left">
				<div class="col-md-12" align="left">
					<h3>${p.houseDesc}</h3>
					<br>
				</div>
				<div class="col-md-12" align="left">
					<span style="color: gray;">
						&nbsp;&nbsp;${p.houseCost}
						<span class="fa fa-krw" aria-hidden="true"></span>
						/ day
					</span>
					<br> <br> <br>
				</div>
				<div class="col-md-3" align="center">
					<div style="width: 60%;">
						<span class="fa fa-building fa-3x"></span>
					</div>
					<br>
					<span>${d.houseType}</span>
				</div>
				<div class="col-md-3" align="center">
					<div style="width: 60%;">
						<span class="fa fa-users fa-3x"></span>
					</div>
					<br>
					<span>인원 ${d.houseCapacity}명</span>
				</div>
				<div class="col-md-3" align="center">
					<div style="width: 60%;">
						<span class="fa fa-key fa-3x"></span>
					</div>
					<br>
					<span>침실 ${d.houseRoom}개</span>
				</div>
				<div class="col-md-3" align="center">
					<div style="width: 60%;">
						<span class="fa fa-moon-o fa-3x"></span>
					</div>
					<br>
					<span>침대 ${d.houseBed}개</span>
				</div>
				<div class="col-md-12" style="font-size: 12px;">
					<br> <br> <br>
					<h4 style="font-weight: bold">상세 설명</h4>
					<br>
					<span>${d.houseDetail}</span>
					<br>
					<hr>
					<div class="col-md-2">
						<span>숙소</span>
					</div>
					<div class="col-md-5">
						<span>
							숙박 가능 인원 :
							<span style="font-weight: bold">${d.houseCapacity}</span>
						</span>
						<br>
						<span>
							침실 :
							<span style="font-weight: bold">${d.houseRoom}</span>
						</span>
						<br>
						<span>
							침대 :
							<span style="font-weight: bold">${d.houseBed}</span>
						</span>
						<br>
					</div>
					<div class="col-md-5">
						<span>
							집 유형:
							<span style="font-weight: bold">${d.houseType}</span>
						</span>
						<br>
						<span>
							숙소 유형:
							<span style="font-weight: bold">${d.roomType}</span>
						</span>
						<br>
					</div>
					<br> <br> <br> <br>
					<hr>
					<div class="col-md-2">
						<span>가격</span>
					</div>
					<div class="col-md-5">
						<span>
							추가 인원 요금 :
							<span style="font-weight: bold">없음</span>
						</span>
						<br>
					</div>
					<div class="col-md-5">
						<span>
							1일 요금:
							<span style="font-weight: bold">${p.houseCost}</span>
						</span>
						<br>
					</div>
				</div>
			</div>
		</div>
	</div>



	<div class="container">
		<!-- 코드시작 -->

		<!-- 코드 종료 -->
		<footer class="footer">
			<%@ include file="attach/footer.jsp"%>
		</footer>
	</div>


	<script src="js/bootstrap.min.js"></script>
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
