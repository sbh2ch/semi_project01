<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

	<div id="MapPanel" class="jumbotron" style="display:inline-block; position:absolute;		 
		width:0%; height: 0px; z-index: 6000;"></div>
	<div id="backPanel" class="jumbotron" style="display:inline-block; position:absolute;		 
		width:100%; height: 800px; z-index: 3000;">
		<img id="img1" src="images/input_house.png" style="width: 100%; height: 100%; display: inline-block; left:0px; top:0px; position: absolute;">
		<img name="imgs" src="images/input_house.png" style="width: 100%; height: 100%; display: inline-block; left:0px; top:0px; position: absolute;">
		<img id="img2" src="images/input_photo.png" style="width: 100%; height: 100%; display: inline-block; left:0px; top:0px; position: absolute;">
		<img id="img3" src="images/input_cost.png" style="width: 100%; height: 100%; display: inline-block; left:0px; top:0px; position: absolute;">
	</div>
	
	<div style="display: inline-block; border:5px dotted red; left:10%; top:10%;
		position: absolute; z-index:9000; width: 25%; height: 70%; ">
			
		<div class="container-fluid form-control" style=" width: 100%; min-height: 100%; height: 100%;  ">
		<!--<form class="form-houseInfo" action="/semiProject01/hostInfo" method="post">-->				
		<div class="form-houseInfo" >
			
		<div id="myCarousel" class="carousel slide" data-interval="false">
		  <ol class="carousel-indicators">
		  <!-- carousel 상단의 ㅇㅇㅇ 모양의 페이징 버튼 부분. -->
		    <!-- <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		    <li data-target="#myCarousel" data-slide-to="1"></li>
		    <li data-target="#myCarousel" data-slide-to="2"></li>-->
		  </ol>
		  <!-- Carousel 적용될 내부 컨텐츠들 -->
		  <div class="carousel-inner">
		  <!-- 첫번째 과정인 숙소정보 입력창 -->
		    <div class="active item">	    
		    
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
					<!--<label for="inputName" class="sr-only">Name</label>-->
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
					<!--<label for="inputEmail" class="sr-only">Email address</label>-->
					숙소 유형<br>
					<input type="radio" name="roomType" checked="checked" value="집 전체" />집 전체
					<input type="radio" name="roomType" value="개인실" />개인실
					<input type="radio" name="roomType" value="다인실" />다인실
				</div>
			</div>
			<div style="text-align: center; border: 2px solid green; height: 300px;">
				<!--<label for="inputPassword" class="sr-only">Password</label>-->
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
			<!--<button class="btn btn-lg btn-primary" type="button" id="step1btn">다음 단계</button>-->			
			  <!--<a class="carousel-control11 right11" href="#myCarousel" data-slide="next">&rsaquo;</a>-->
			  <a class="btn btn-lg btn-primary" href="#myCarousel" data-slide="next" onclick="startSlide('next')">다음단계</a>
			<br>
			<br>
		    
		    
		    
		    </div>
		    <!-- 두번째 과정인 위치정보 입력창 -->
		    <div class="item">
			<br>
			<br>			
			<h3>위치 정보를 입력하세요</h3>
			<br>					
			<!--private int no;
				private String nation;
				private String addr;
				private String detailAddr;
				private String zipCode;
				private String xPoint;
				private String yPoint;
				<label for="inputName" class="sr-only">Name</label>
				<label for="inputEmail" class="sr-only">Email address</label>
				<label for="inputPassword" class="sr-only">Password</label>-->
				국가<br>
				<input name="nation" type="text" class="form-control" placeholder="마커를 움직이면 자동입력됩니다"/>			
				주소<br>
				<input name="addr" type="text" class="form-control" placeholder="주소를 입력하거나 마커를 움직입니다 (예: 서울시)" onkeydown="if(event.keyCode==13) Rungeo();" />			
				상세 주소<br>
				<input name="detailAddr" type="text" class="form-control" placeholder="상세주소를 입력하세요 (예: 상우아파트 402동 201호)" />
				우편번호<br>
				<input name="zipCode" type="text" class="form-control" placeholder="마커를 움직이면 자동입력됩니다" />
				<input name="xPoint" type="hidden" />
				<input name="yPoint" type="hidden" />
				<br>
				<br>
				<a class="btn btn-lg btn-primary" href="#myCarousel" data-slide="prev" onclick="startSlide('prev')">이전단계</a>
				<a class="btn btn-lg btn-primary" href="#myCarousel" data-slide="next" onclick="startSlide('next')">다음단계</a>
			</div>
				<!-- 세번째 과정인 위치정보 입력창 -->
		    <div class="item">
			<br>
			<br>			
			<h3>사진을 추가하여 숙소의 모습을 보여줍니다</h3>
			<br>					
			<!--
				<label for="inputName" class="sr-only">Name</label>
				<label for="inputEmail" class="sr-only">Email address</label>
				<label for="inputPassword" class="sr-only">Password</label>-->
				
				<br>
				<br>
				<a class="btn btn-lg btn-primary" href="#myCarousel" data-slide="prev" onclick="startSlide('prev')">이전단계</a>
				<a class="btn btn-lg btn-primary" href="#myCarousel" data-slide="next" onclick="startSlide('next')">다음단계</a>			
			</div>	
			<!-- 네번째 과정인 요금 입력창 -->
			<div class="item">
				<br>
				<br>			
				<h3>적정한 1일당 요금을 입력하세요</h3>
				<br>					
			<!-- 여기서 form 을 설정해서 그간 입력한 정보를 모조리 전송 -->
				<form action="" method="post" onkeydown="if(event.keyCode==13) return false;">
					<input name="cost" type="text" class="form-control" placeholder="1일당의 숙박비용"/>	
					<br>
					<br>
					<a class="btn btn-lg btn-primary" href="#myCarousel" data-slide="prev" onclick="startSlide('prev')">이전단계</a>
					<input class="btn btn-lg btn-primary" type="submit" value="입력완료" />
				</form>			
			</div>		  
		  <!-- Carousel nav -->
		  <!-- <a class="carousel-control11 left11" href="#myCarousel" data-slide="prev">&lsaquo;</a>-->
		</div>
		</div>
			
			
		</div>
		<!--</form>-->
	</div>
</div>
