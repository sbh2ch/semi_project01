# semi_project01

<h2>테이블 구성</h2>
<h2>테이블 구성1</h2>

<h4>쪽지함</h4>
create table t86_1_members_msg(<br>
msg_no number primary key,<br>
sender varchar2(50),<br>
receiver varchar2(50),<br>
content varchar2(2000)<br>
);<br>
<br>
<h4>회원</h4>
create table t86_1_members(<br>
email varchar2(20) primary key,<br>
no varchar2(20) not null,<br>
password varchar2(20),<br>
name varchar2(30) not null<br>
fb varchar2(10) --페이스북 계정체크<br>
);<br>
<h5>회원 시퀀스</h5>
create sequence seq_1_members<br>
<br>
<h4>현황</h4>
create table t86_1_hosting_status(<br>
host_no number primary key,<br>
host_email varchar2(50),<br>
guest_email varchar2(50),<br>
start_date date,<br>
end_date date,<br>
hosting_status varchar2(5)<br>
);<br>
<br>
<h4>미리보기</h4>
create table t86_1_host_preview(<br>
email varchar2(20),<br>
host_no number primary key,<br>
reg_date date not null,<br>
start_date date not null,<br>
end_date date not null,<br>
img_path varchar2(300),<br>
img_oriname varchar2(200),<br>
img_realname varchar2(200),<br>
house_desc varchar2(200),<br>
house_cost number(20) not null<br>
)<br>
<br>
<h4>위치 정보</h4>
create table t86_1_host_location(<br>
host_no number primary key,<br>
nation varchar2(100) not null,<br>
addr varchar2(100) not null,<br>
zip_code varchar2(30) not null,<br>
detail_addr varchar2(100)<br>
X_point varchar2(100) not null<br>
Y_point varchar2(100) not null<br>
);<br>
<br>
<h4>상세정보</h4>
create table t86_1_host_detail(<br>
host_no number primary key,<br>
house_type varchar2(30) not null,<br>
room_type varchar2(30) not null<br>
house_capacity number(10) not null,<br>
house_room number(10) not null,<br>
house_bed number(10) not null,<br>
house_bath number(10) not null,<br>
house_detail varchar2(4000)<br>
);<br>
<br>
<h4>댓글</h4>
create table t86_1_reply(<br>
reply_no number primary key,<br>
host_no number,<br>
name varchar2(50),<br>
email varchar2(50),<br>
content varchar2(1000),<br>
reg_date date<br>
);<br>
