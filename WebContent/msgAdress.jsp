<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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


	<%@ include file="attach/header.jsp"%>



	<div class="container">
		<!--  코드시작 -->
<input class="btn btn-default" type="button" value="여행(guesting)">
<input class="btn btn-default" type="submit" value="호스팅(hosting)">
	  전체 ${fn:length(list)}개<br>
	  <hr>
	  <table width='80%' border='1'>
	  <tr>
	    <th>발신자</th>
	    <th>제목</th>
	    </tr>
		<c:forEach var="board" items="${list}">
		<tr>
		  <td><c:out value="${board.writer}" /></td>
		  <td><a href='detail?no=<c:out value="${board.no}" />'><c:out value="${board.title}" /></a></td>
		  </td>
		 </tr>
		 </c:forEach>
		 <c:if test="${empty list}">
		 <tr>
		    <td colspan='4'>게시물이 존재하지 않습니다.</td>
		 </tr>
		 </c:if>
		 </table>
	</div>
	<form method='post' action='write'
		       encType="multipart/form-data">
		    수신자 : <input type='text' name='writer' size='30' /><br>
		    발신자 : <input type='text' name='writer' size='30' /><br>
		    내용 : <textarea name='content' rows='7' cols='70'></textarea><br>
		   <button type='submit'>등록</button>
		 </form>

		<footer>
			<%@ include file="attach/footer.jsp"%>
		</footer>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>