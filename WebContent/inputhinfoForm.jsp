<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html lang="en"  style="min-height: 100%; overflow: hidden;">
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

<body style="min-height: 100%; overflow: hidden;">
			<%@ include file="attach/header.jsp"%>
		<!-- 코드시작 -->
		<div class="jumbotron" style="background: url('images/input_house.png'); background-size: 100% 100%; height: 800px;">
			<div class="container-fluid form-control" style="width: 30%; height: 100%; margin-left: 10%;">
				<form class="form-houseInfo" action="/semiProject01/inputHouseInfo" method="post">					
					<br>
					<br>					
					<h3>숙소 정보를 입력하세요</h3>
					<br>					
					<!-- private String houseType;
						private String roomType;
						private boolean hostState;
						private int houseCapacity;
						private int houseRoom;
						private int houseBed;
						private int houseBath;-->
					<div style="border: 2px solid green;">
						<div style="display:inline-block; border:2px solid red; margin-left: auto; margin-right: auto;">
							<label for="inputName" class="sr-only">Name</label>
							건물 유형<br>
							<select class="col-md-2" name="houseType" style="width: 150px;">
								<option selected="selected">건물 유형 선택</option>
								<option>아파트</option>
								<option>단독주택</option>
								<option>게스트하우스</option>
								<option>빌라</option>
								<option>타운하우스</option>
							</select>
						</div>
						<div style="display:inline-block; border:2px solid red; margin-left: auto; margin-right: auto;">
							<label for="inputEmail" class="sr-only">Email address</label>
							숙소 유형<br>
							<input type="radio" name="roomType" checked="checked" value="집 전체" />집 전체
							<input type="radio" name="roomType" value="개인실" />개인실
							<input type="radio" name="roomType" value="다인실" />다인실
						</div>
					</div>
					<div style="text-align: center; border: 2px solid green; height: 300px;">
						<label for="inputPassword" class="sr-only">Password</label>
						<div style="float: left; display: inline-block; border:2px solid red;">
							수용 인원<br>
							<select>
								<c:forEach begin="1" end="20" var="n">
									<option>${n}명</option>
								</c:forEach>
								<option>20+명</option>
							</select>
						</div>
						<div style="float: left; display: inline-block; border:2px solid red;">
							침실 수<br>
							<select>
								<c:forEach begin="1" end="6" var="n">
									<option>${n}실</option>
								</c:forEach>
								<option>6+실</option>
							</select>
						</div>
						<div style="float: left; display: inline-block; border:2px solid red;">
							침대<br>
							<select>
								<c:forEach begin="0" end="10" var="n">
									<option>${n}개</option>
								</c:forEach>
								<option>10+개</option>
							</select>
						</div>
						<div style="float: left; display: inline-block; border:2px solid red;">
							욕실<br>
							<select>
								<c:forEach begin="0" end="6" var="n">
									<option>${n}실</option>
								</c:forEach>
								<option>6+실</option>
							</select>
						</div>
					</div>
					<h6 style="color: gray;">Use at least four characters.</h6>
					<button class="btn btn-lg btn-primary" type="submit">다음 단계</button>
					<br>
					<br>
				</form>
		<!-- 코드종료 -->
			</div>
		</div>
		<footer>
			<%@ include file="attach/footer.jsp"%>
		</footer>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
