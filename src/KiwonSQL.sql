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

insert into drink (drink_name,price,setprice,ssize) values ('제주 한라봉 칠러 미디엄',3600,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('제주 한라봉 칠러 라지',4400,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('애플 망고 칠러 스몰',2700,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('애플 망고 칠러 미디엄',3600,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('애플 망고 칠러 라지',4400,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('자두 칠러 스몰',2700,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('자두 칠러 미디엄',3600,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('자두 칠러 라지',4400,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('바닐라 라떼 미디엄',4000,1900,2);
insert into drink (drink_name,price,setprice,ssize) values ('바닐라 라떼 라지',4600,2000,3);
insert into drink (drink_name,price,setprice,ssize) values ('아이스 바닐라 라떼 미디엄',4000,1900,2);
insert into drink (drink_name,price,setprice,ssize) values ('아이스 바닐라 라떼 라지',4600,2000,3);
insert into drink (drink_name,price,setprice,ssize) values ('코카 콜라 미디엄',2100,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('코카 콜라 라지',2600,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('코카 콜라 제로 미디엄',2100,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('코카 콜라 제로 라지',2600,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('환타 미디엄',2100,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('환타 라지',2600,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('스프라이트 미디엄',2100,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('스프라이트 라지',2600,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('카페라떼 스몰',3000,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('카페라떼 미디엄',3500,1400,2);
insert into drink (drink_name,price,setprice,ssize) values ('카페라떼 라지',4100,1500,3);
insert into drink (drink_name,price,setprice,ssize) values ('카푸치노 스몰',3000,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('카푸치노 미디엄',3500,1400,2);
insert into drink (drink_name,price,setprice,ssize) values ('카푸치노 라지',4100,1500,3);
insert into drink (drink_name,price,setprice,ssize) values ('아메리카노 스몰',2600,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('아메리카노 미디엄',3100,1000,2);
insert into drink (drink_name,price,setprice,ssize) values ('아메리카노 라지',3600,1000,3);
insert into drink (drink_name,price,setprice,ssize) values ('드립 커피 스몰',1900,0,1);
insert into drink (drink_name,price,setprice,ssize) values ('드립 커피 미디엄',2500,300,2);
insert into drink (drink_name,price,setprice,ssize) values ('드립 커피 라지',3000,400,3);
insert into drink (drink_name,price,setprice,ssize) values ('아이스 드립 커피 (시럽없음) 미디엄',1900,0,2);
insert into drink (drink_name,price,setprice,ssize) values ('아이스 드립 커피 (시럽없음) 라지',2400,0,3);
insert into drink (drink_name,price,setprice,ssize) values ('아이스 아메리카노 (시럽없음) 미디엄',3100,1000,2);
insert into drink (drink_name,price,setprice,ssize) values ('아이스 아메리카노 (시럽없음) 라지',3600,1000,3);
insert into drink (drink_name,price,setprice,ssize) values ('아이스 카페라떼 (시럽없음) 미디엄',3500,1400,2);
insert into drink (drink_name,price,setprice,ssize) values ('아이스 카페라떼 (시럽없음) 라지',4100,1500,3);
insert into drink (drink_name,price,setprice,ssize) values ('딸기 쉐이크 미디엄',2300,1100,2);
insert into drink (drink_name,price,setprice,ssize) values ('초코 쉐이크 미디엄',2300,1100,2);
insert into drink (drink_name,price,setprice,ssize) values ('바닐라 쉐이크 미디엄',2300,1100,2);
insert into drink (drink_name,price,setprice,ssize) values ('에스프레소',2200,100,2);
insert into drink (drink_name,price,setprice,ssize) values ('오렌지주스(캔)',0,0,2); --해피밀
insert into drink (drink_name,price,setprice,ssize) values ('우유',0,0,2); --해피밀
insert into drink (drink_name,price,setprice,ssize) values ('생수',0,0,2); --해피밀

insert into sauce (sauce_name,price,setprice) values ('디핑 소스 스위트 앤 사워',300,0); --세트가격 x
insert into sauce (sauce_name,price,setprice) values ('디핑 소스 스위트 칠리',300,0); --세트가격 x
insert into sauce (sauce_name,price,setprice) values ('디핑 소스 케이준',300,0); --세트가격 x

insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('코울슬로',2700,200,2,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('소시지 스낵랩',3200,0,2,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('골든 모짜렐라 치즈스틱 2조각',3100,0,2,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('골든 모짜렐라 치즈스틱 4조각',4800,0,3,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('맥너겟 4조각',2800,0,1,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('맥너겟 6조각',3800,0,2,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('맥너겟 10조각',5300,0,3,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('맥스파이시 치킨텐더 2조각',3300,0,1,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('맥스파이시 치킨텐더 4조각',5700,0,2,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('단품 상하이 치킨 스낵랩',3000,0,2,1,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('후렌치 후라이 스몰',1800,0,1,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('후렌치 후라이 미디엄',2500,0,2,0,1);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('후렌치 후라이 라지',3100,0,3,0,0);
insert into snacksandside (snacksandside_name,price,setprice,ssize,popularity,reorder) values ('스트링 치즈',2400,0,2,0,0);


select * 
from drink,sauce
where drink_name like '%콜라%';