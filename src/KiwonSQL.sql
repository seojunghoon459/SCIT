drop SEQUENCE kiosk_seq;
drop table kiosk;
drop table drink;
drop table sauce;
drop table snacksandside;

create table drink
(
    drink_name varchar2(100) primary key,
    price number not null,
    setprice number not null,
    ssize number default 2 check (ssize in (1,2,3)),
    popularity number(1) default 0 check (popularity in (0,1)),
    reorder number(1)	default 0 check (reorder in (0,1))
);
create table sauce
(
    sauce_name varchar2(100) primary key,
    price number not null,
    setprice number not null,
    ssize number default 2 check (ssize in (1,2,3)),
    popularity number(1) default 0 check (popularity in (0,1)),
    reorder number(1)	default 0 check (reorder in (0,1))
);
create table snacksandside
(
    snacksandside_name varchar2(100) primary key,
    price number not null,
    setprice number not null,
    ssize number default 2 check (ssize in (1,2,3)),
    popularity number(1) default 0 check (popularity in (0,1)),
    reorder number(1)	default 0 check (reorder in (0,1))
);

create table kiosk
(
    knum number primary key,
    kiosk_bill	varchar2(1000),
    count	 number(1) default 1
);

create SEQUENCE kiosk_seq;

insert into drink (drink_name,price,setprice,ssize) values ('���� �Ѷ�� ĥ�� �̵��',3600,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('���� �Ѷ�� ĥ�� ����',4400,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('���� ���� ĥ�� ����',2700,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('���� ���� ĥ�� �̵��',3600,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('���� ���� ĥ�� ����',4400,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('�ڵ� ĥ�� ����',2700,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('�ڵ� ĥ�� �̵��',3600,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('�ڵ� ĥ�� ����',4400,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('�ٴҶ� �� �̵��',4000,1900,2);
insert into drink (drink_name,price,setprice,ssize) values ('�ٴҶ� �� ����',4600,2000,3);
insert into drink (drink_name,price,setprice,ssize) values ('���̽� �ٴҶ� �� �̵��',4000,1900,2);
insert into drink (drink_name,price,setprice,ssize) values ('���̽� �ٴҶ� �� ����',4600,2000,3);
insert into drink (drink_name,price,setprice,ssize) values ('��ī �ݶ� �̵��',2100,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('��ī �ݶ� ����',2600,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('��ī �ݶ� ���� �̵��',2100,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('��ī �ݶ� ���� ����',2600,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('ȯŸ �̵��',2100,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('ȯŸ ����',2600,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('��������Ʈ �̵��',2100,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('��������Ʈ ����',2600,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('ī��� ����',3000,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('ī��� �̵��',3500,1400,2);
insert into drink (drink_name,price,setprice,ssize) values ('ī��� ����',4100,1500,3);
insert into drink (drink_name,price,setprice,ssize) values ('īǪġ�� ����',3000,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('īǪġ�� �̵��',3500,1400,2);
insert into drink (drink_name,price,setprice,ssize) values ('īǪġ�� ����',4100,1500,3);
insert into drink (drink_name,price,setprice,ssize) values ('�Ƹ޸�ī�� ����',2600,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('�Ƹ޸�ī�� �̵��',3100,1000,2);
insert into drink (drink_name,price,setprice,ssize) values ('�Ƹ޸�ī�� ����',3600,1000,3);
insert into drink (drink_name,price,setprice,ssize) values ('�帳 Ŀ�� ����',1900,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('�帳 Ŀ�� �̵��',2500,300,2);
insert into drink (drink_name,price,setprice,ssize) values ('�帳 Ŀ�� ����',3000,400,3);
insert into drink (drink_name,price,setprice,ssize) values ('���̽� �帳 Ŀ�� (�÷�����) �̵��',1900,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('���̽� �帳 Ŀ�� (�÷�����) ����',2400,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('���̽� �Ƹ޸�ī�� (�÷�����) �̵��',3100,1000,2);
insert into drink (drink_name,price,setprice,ssize) values ('���̽� �Ƹ޸�ī�� (�÷�����) ����',3600,1000,3);
insert into drink (drink_name,price,setprice,ssize) values ('���̽� ī��� (�÷�����) �̵��',3500,1400,2);
insert into drink (drink_name,price,setprice,ssize) values ('���̽� ī��� (�÷�����) ����',4100,1500,3);
insert into drink (drink_name,price,setprice,ssize) values ('���� ����ũ �̵��',2300,1100,2);
insert into drink (drink_name,price,setprice,ssize) values ('���� ����ũ �̵��',2300,1100,2);
insert into drink (drink_name,price,setprice,ssize) values ('�ٴҶ� ����ũ �̵��',2300,1100,2);
insert into drink (drink_name,price,setprice,ssize) values ('����������',2200,100,2);
insert into drink (drink_name,price,setprice,ssize) values ('�������ֽ�(ĵ)',0,0,2); --���ǹ�
insert into drink (drink_name,price,setprice,ssize) values ('����',0,0,2); --���ǹ�
insert into drink (drink_name,price,setprice,ssize) values ('����',0,0,2); --���ǹ�

insert into sauce (sauce_name,price,setprice) values ('���� �ҽ� ����Ʈ �� ���',300,0); --��Ʈ���� x
insert into sauce (sauce_name,price,setprice) values ('���� �ҽ� ����Ʈ ĥ��',300,0); --��Ʈ���� x
insert into sauce (sauce_name,price,setprice) values ('���� �ҽ� ������',300,0); --��Ʈ���� x

insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�ڿｽ��',2700,200,2,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�ҽ��� ������',3200,0,2,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('��� ��¥���� ġ�ƽ 2����',3100,0,2,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('��� ��¥���� ġ�ƽ 4����',4800,0,3,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�Ƴʰ� 4����',2800,0,1,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�Ƴʰ� 6����',3800,0,2,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�Ƴʰ� 10����',5300,0,3,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�ƽ����̽� ġŲ�ٴ� 2����',3300,0,1,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�ƽ����̽� ġŲ�ٴ� 4����',5700,0,2,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('��ǰ ������ ġŲ ������',3000,0,2,1,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�ķ�ġ �Ķ��� ����',1800,0,1,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�ķ�ġ �Ķ��� �̵��',2500,0,2,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('�ķ�ġ �Ķ��� ����',3100,0,3,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('��Ʈ�� ġ��',2400,0,2,0,0);


select * 
from drink,sauce
where drink_name like '%�ݶ�%';