쪽지함
select * from t86_1_members_msg;

insert into t86_1_members_msg(no,sender,addressee,messege)
values('5','kagpig','ghlruddl3','아 왜!!!!!!!!!!!!!!!!');

--------------------------------------------------------------

create table t86_1_host_preview(
email varchar2(20),
host_no number primary key,
reg_date date not null,
start_date date not null,
end_date date not null,
img_path varchar2(300),
img_oriname varchar2(200),
img_realname varchar2(200),
house_desc varchar2(200),
house_cost number(20) not null
);
