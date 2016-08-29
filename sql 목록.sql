쪽지함
create table t86_1_members_msg(
no number(5) primary key,
sender varchar2(200),
addressee varchar2(200),
messege varchar2(200)
);

insert into t86_1_members_msg(no, sender,addressee,masssge)
values(1,'ghlruddl3','kanpig','야 어디냐?');


drop table t86_1_members_msg;

select * from t86_1_members_msg;