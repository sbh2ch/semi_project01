쪽지함

create table t86_1_members_msg(

no number(5) primary key,
sender varchar2(200),
addressee varchar2(200),
message varchar2(200)
);
select*from t86_1_members_msg;

drop table t86_1_members_msg;
create sequence s86_1_members_msg_no;

insert into t86_1_members_msg(no,sender,addressee,message) values (t86_1_members_msg_no.nextval,'정회경','하연수','어dd디야^^?');

select no, sender, addressee, message 
		from t86_1_members_msg 
		where sender='정회경'
		order by no desc;
select no no, sender sender, message message 
		from t86_1_members_msg 
		order by no desc;

select no, sender, message 
		from t86_1_members_msg 
		where sender = '정회경' 
		order by no desc;
		
		select no, addressee, message 
		from t86_1_members_msg 
		where sender = '정회경' 
		order by no desc;

select no, addressee, message from t86_1_members_msg;

회원

create table t86_1_members(
email varchar2(20) primary key,
no varchar2(20) not null,
password varchar2(20),
name varchar2(30) not null,
fb varchar2(10)
);

회원 시퀀스

create sequence seq_1_members


회원(숙식정보)

create table t86_1_house_content1(
host_num varchar2(30) primary key,
house_type varchar2(30) not null,
room_type varchar2(30) not null,
host_state number(1) not null,
house_capacity number(10) not null,
house_room number(10) not null,
house_bed number(10) not null,
house_bath number(10) not null
);


회원(거래정보)

create table t86_1_house_content2(
host_num varchar2(30) primary key,
host_date date not null,
house_img varchar2(300),
house_desc varchar2(200),
house_cost varchar2(20) not null
);

게스팅 현황

create table t86_1_member_guesting(
email varchar2(20) primary key,
host_num varchar2(30) not null,
guest_state number(1) not null
);


회원 위치

create table t86_1_member_location(
email varchar2(20) primary key,
host_num varchar2(30) not null,
nation varchar2(30) not null,
addr varchar2(30) not null,
zip_code varchar2(30) not null,
detail_addr varchar2(30),
XY_point varchar2(30) not null
);