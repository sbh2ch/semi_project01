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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/ie10-viewport-bug-workaround.js"></script>
</head>

<body style="min-height: 100%; overflow: hidden;">
		<%@ include file="attach/header.jsp"%>
		<!-- 코드시작 -->
		<%@ include file="houseForm.jsp" %>		
		<!-- 코드종료 -->
		<footer>
		<%@ include file="attach/footer.jsp"%>
		</footer>
<script type="text/javascript">
	/* 상세정보 입력 관련 변수 */
	var hostNum;
	var houseType;
	var roomType;
	var hostState;
	var houseCapacity;
	var houseRoom;
	var houseBed;
	var houseBath;
	/* 위치정보 입력 관련 변수 */
	var nation;
	var addr;
	var zipCode;
	var detailAddr;
	var xPoint;
	var yPoint;
	/* 미리보기 입력 관련 변수 */
	var email;
	var hostDate;
	var houseImg;
	var houseDesc;
	var houseCost;
</script>
	
</body>
</html>
