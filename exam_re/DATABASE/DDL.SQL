CREATE TABLE BOOK_TBL_06(
BOOK_NO         NUMBER,
BOOK_NAME       VARCHAR2(50) NOT NULL,
BOOK_COVERIMG   VARCHAR2(20),
BOOK_DATE       DATE,
BOOK_PRICE      NUMBER,
BOOK_PUBLISHER  VARCHAR2(50),
BOOK_INFO       VARCHAR2(2000),
PRIMARY KEY(BOOK_NO) );

insert into book_tbl_06 values(100, '리눅스',          '100.jpg', TO_DATE('15/09/02', 'yy/MM/dd'), 24000, '나룩스','운영체제, DB기초, 네트워크 기초, 개발환경구축'); 
insert into book_tbl_06 values(101, '자바',            '101.jpg', TO_DATE('16/01/10', 'yy/MM/dd'), 20000, '이자바', '프로그래밍 언어');
insert into book_tbl_06 values(102, '자바웹프로그래밍','102.jpg', TO_DATE('16/10/30', 'yy/MM/dd'), 25000, '김프로', '개발환경/서버프로그램/배치프로그램');
insert into book_tbl_06 values(103, '오픈소스활용하기','103.jpg', TO_DATE('17/09/01', 'yy/MM/dd'), 30000, '박오픈', '형상관리, 빌드, 배포');
insert into book_tbl_06 values(104, 'HTML',            '104.jpg', TO_DATE('18/04/04', 'yy/MM/dd'), 10000, '홍길동', 'HTML/CSS/JAVASCRIPT/JQUERY');

CREATE TABLE RENT_TBL_06(
RENT_NO     NUMBER,
BOOK_NO     NUMBER NOT NULL,
RENT_PRICE  NUMBER NOT NULL,
RENT_DATE   DATE NOT NULL,
RENT_STATUS CHAR(1) DEFAULT '0' NOT NULL,
PRIMARY KEY(RENT_NO) );

insert into RENT_TBL_06 values(10001, 100, 2400, TO_DATE('18/07/02', 'yy/MM/dd'),1);
insert into RENT_TBL_06 values(10002, 101, 2000, TO_DATE('18/07/04', 'yy/MM/dd'),1);
insert into RENT_TBL_06 values(10003, 100, 2400, TO_DATE('18/08/02', 'yy/MM/dd'),1);
insert into RENT_TBL_06 values(10004, 100, 2400, TO_DATE('18/08/12', 'yy/MM/dd'),1);
insert into RENT_TBL_06 values(10005, 102, 2500, TO_DATE('18/08/13', 'yy/MM/dd'),1);
insert into RENT_TBL_06 values(10006, 103, 3000, TO_DATE('18/08/13', 'yy/MM/dd'),1);
insert into RENT_TBL_06 values(10007, 103, 3000, TO_DATE('18/08/20', 'yy/MM/dd'),0);
insert into RENT_TBL_06 values(10008, 100, 2400, TO_DATE('18/09/03', 'yy/MM/dd'),1);
insert into RENT_TBL_06 values(10009, 100, 2400, TO_DATE('18/09/08', 'yy/MM/dd'),1);
insert into RENT_TBL_06 values(10010, 100, 2400, TO_DATE('18/09/14', 'yy/MM/dd'),0);
insert into RENT_TBL_06 values(10011, 102, 2500, TO_DATE('18/09/14', 'yy/MM/dd'),0);

commit;