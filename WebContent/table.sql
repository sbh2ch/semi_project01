--현황
create table t86_1_hosting_status(
host_no number primary key,
host_email varchar2(50),
guest_email varchar2(50),
start_date date,
end_date date,
hosting_status varchar2(5)
);
--쪽지함
create table t86_1_members_msg(
msg_no number primary key,
sender varchar2(50),
receiver varchar2(50),
content varchar2(2000)
);
--회원
create table t86_1_members(
email varchar2(20) primary key,
no varchar2(20) not null,
password varchar2(20),
name varchar2(30) not null,
fb varchar2(10) --페이스북 계정체크
);
-- 미리보기
create table t86_1_host_preview(
email varchar2(20),
host_no varchar2(30) primary key,
reg_date date not null,
start_date date not null,
end_date date not null,
img_path varchar2(300),
img_oriname varchar2(200),
img_realname varchar2(200),
house_desc varchar2(200),
house_cost number(20) not null
);
-- 상세정보
create table t86_1_host_detail(
host_no varchar2(30) primary key,
house_type varchar2(30) not null,
room_type varchar2(30) not null,
host_state number(1) not null,
house_capacity number(10) not null,
house_room number(10) not null,
house_bed number(10) not null,
house_bath number(10) not null,
house_detail varchar2(4000)
);

select * from T86_1_HOST_DETAIL;

create sequence seq_1_members;

--위치정보
create table t86_1_host_location(
host_no number primary key,
nation varchar2(30) not null,
addr varchar2(30) not null,
zip_code varchar2(30) not null,
detail_addr varchar2(30),
X_point varchar2(30) not null,
Y_point varchar2(30) not null
);
-- 후기쓰기
create sequence t86_1_reply_no;
create sequence test_seq;
drop table t86_1_reply;
delete from t86_1_reply;
create table t86_1_reply(
reply_no number primary key,
host_email varchar2(50) not null,
name varchar2(50) not null,
reply_email varchar2(50) not null,
content varchar2(1000) not null,
reg_date date default sysdate
);