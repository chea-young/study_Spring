create table member(
seq number not null primary key,
userid varchar2 (50) not null,
userpw varchar2 (50) not null,
username varchar2 (12) not null,
regdate date default sysdate,
status varchar2 (6)
);

create sequence seq
start with 1 increment by 1
maxvalue 99999 nocycle;

insert into member (seq, userid, userpw, username) values (seq.nextval, 'ny', '1111', '¾È´¨');
commit;

