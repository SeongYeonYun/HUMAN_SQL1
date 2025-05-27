--새로운 테이블 생성

create table emp_ddl (
    empno      number(4),
    ename      varchar2(10),
    job        varchar2(9),
    mgr        number(4),
    hiredate   date,
    sal        number(7,2),
    comm       number(7,2),
    deptno     number(2)
    );

--테이블 생성 채크

desc emp_ddl;    
select * from emp_ddl;

create  table dept_ddl
as select * from dept;

desc dept_ddl;

create table empdept_ddl
    as select 
        e.empno,
        e.ename, 
        e.job,
        e.mgr,
        e.hiredate,
        e.sal,
        e.comm,
        d.deptno,
        d.dname,
        d.loc
        
    from 
        emp e,
        dept d
        where 1<>1;
        
select * from empdept_ddl;

create table emp_alter
as select * from emp;

alter table emp_alter
add hp varchar(20);
--varchar(로 저장해도 varchar2로 저장됨
desc emp_alter;

select * from emp_alter;

alter table emp_alter
add age number(3) default 1; --디폴트 값은 create할떄도 지정할수 있다.

--컬럼의 이름을 바꿀때 rename column을 사용한다.
alter table emp_alter
rename column hp to tel2;

--데이터 타입을 바꿀떈 modify를 사용한다. 수정할떄 타입의 크기가 커지는건 가능하다. 타입의 크기가 줄어드는건 불가능하다.

alter table emp_alter
modify empno number(5);

desc emp_alter;

alter table emp_alter
modify empno number(4);

--삭제는 drop column으로 지운다.
alter table emp_alter
drop column tel2;

rename emp_alter to emp_rename;

desc emp_alter; --출력이 안되는게 정강상임, 이름이 바뀜

select * from emp_rename;

create table emp_temp
as select * from emp;

--모든 데이터가 사라짐
truncate table emp_temp;
select * from emp_temp;
        
create table emp_hw(
    empno number(4),
    ename varchar2(10),
    job   varchar2(9),
    mgr   int(4),
    hiredate date,
    sal number(7,2),
    comm number(7,2),
    deptno int(2)
    );
drop table emp_hw;
desc emp_hw;

---------------311----------1-------------------
CREATE TABLE emp_hw (
    empno    NUMBER(4),
    ename    VARCHAR2(10),
    job      VARCHAR2(9),
    mgr      number(4),
    hiredate DATE,
    sal      NUMBER(7,2),
    comm     NUMBER(7,2),
    deptno   number(2)
);

desc emp_hw;
desc emp;
-------------311 2------------------
alter table emp_hw
    add bigo varchar2(20);
   
---------------311-3--------------    
alter table emp_hw
    modify bigo varchar2(30);
    
select * from emp_hw;
--------------311-4------------------

alter table emp_hw
    rename column bigo to remark;

--칼럼명이 일치하지 않는다    
insert into emp_hw
 select * from emp;
 
INSERT INTO emp_hw (
    empno, ename, job, mgr, hiredate, sal, comm, deptno, remark
)
SELECT
    empno, ename, job, mgr, hiredate, sal, comm, deptno, NULL
FROM emp;

--drop table emp_hw;

rename emp_alter to emp_rename;

desc emp_alter; --출력이 안되는게 정강상임, 이름이 바뀜

select * from emp_rename;

create table emp_temp
as select * from emp;

--모든 데이터가 사라짐
truncate table emp_temp;
select * from emp_temp;
        
create table emp_hw(
    empno number(4),
    ename varchar2(10),
    job   varchar2(9),
    mgr   int(4),
    hiredate date,
    sal number(7,2),
    comm number(7,2),
    deptno int(2)
    );
drop table emp_hw;
desc emp_hw;

---------------311----------1-------------------
CREATE TABLE emp_hw (
    empno    NUMBER(4),
    ename    VARCHAR2(10),
    job      VARCHAR2(9),
    mgr      number(4),
    hiredate DATE,
    sal      NUMBER(7,2),
    comm     NUMBER(7,2) not null ,
    deptno   number(2)
);
drop table emp_hw;
desc emp_hw;
desc emp;
-------------311 2------------------
alter table emp_hw
    add bigo varchar2(20);
   
---------------311-3--------------    
alter table emp_hw
    modify bigo varchar2(30);
    
select * from emp_hw;
--------------311-4------------------

alter table emp_hw
    rename column bigo to remark;

--칼럼명이 일치하지 않는다    
insert into emp_hw
 select * from emp;
 
INSERT INTO emp_hw (
    empno, ename, job, mgr, hiredate, sal, comm, deptno, remark
)
SELECT
    empno, ename, job, mgr, hiredate, sal, comm, deptno, NULL
FROM emp;

--drop table emp_hw;

--drop table online_sale;

--미리 오라클에서 정의된 
select * from dict;

--우저가 만든 db목록
select table_name from user_tables;

select * from user_indexes;

--인덱싱 order by 처럼 정령을 해서 가지고 있는것,

create index idx_emp_sal on emp(sal);

--descend 가 정렬의 기준임
select * from user_ind_columns;

--계획 설명에서 cost가 높을떄 인덱스를 하면 속도가 빨라짐, cost는 높으면 속도가 빨라진다.
select /*+ index(emp idx_emp_sal)*/ --강제 hint
    * 
    from emp
        where sal >2000;

--ORA-01031: insufficient privileges,  view셍성권한 없음    
create view vw_emp20
    as (
        select 
            empno,
            ename,
            job,
            deptno
            
            from emp
            where deptno = 20
        );
        
--삭제할떄는 drop view

select * from dept ;

-- sequence 생성권한 없음
create sequence seq_dept_sequence
    start with 10,
    increment by 20;
    
SELECT sequence_name
FROM user_sequences;

select seq_dept_sequence.nextval 
from dual;

/*
한번 생성된 sequence는 수정할수 없다. 단 drop sequence를 통해 삭제한후 다시 생성하거나
alter sequence로 수정한다.
start with 속성은 최초값이기 때문에 한번이라도 실행하면 수정이 불가능하다.
last_number과 충돌이 있을수 있다. 이미 진행된 상테에서 바꾸면 정합성 오류가 일어난다.
*/

create table dept_temp
    as select * from dept;
    
insert into dept_temp (deptno, dname, loc)
    values (seq_dept.nextval, '테스트', '천안');
    
select * from dept_temp;

------------347p-1----------------------
create table empidx
    as select * from emp;

create index 
    empidx on emp(ename);

select * from user_indexes
    where index_name = 'EMPIDX';


create table table_pk(
    login_id varchar2(20) primary key,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
    );

desc table_pk;
select * from table_pk;
select * from user_ind_columns;

--증복 불가능
insert into table_pk values('id','pw',null);
insert into table_pk values('id','pw2',null);

--null값 추가 불가능
insert into table_pk values(null,null,null);

--null로업데이트가 불가능
update table_pk
set login_id = null
where login_id = 'id';


create table emp_fk(
    empno number(4) constraint deptfk_empno_pk primary key,
    ename varchar2(10),
--    deotno number(2) constraint fk_emp_fk references dept_fk(deptno)
--  foreign key는 하나밖에 없다. constraint가 없는 경우도 가능하다.

     deotno number(2), foreign key (deptno) reference dept_fk(deptno)
);

desc dept_fk;

insert into emp_fk 
    values (1000,'name',10);

select  * from dept_fk;


insert into dept_fk
    values(10, '부서', '위치');
    
update dept_fk set deptno = 20
where deptno = 10;

delete dept_fk
    set deptno = 10
    where deptno =20;
    
delete emp_fk
    where deptno = 20;
    
--fk key 사룔시 cascade를 사용하면 참조하는 것들을 한번에 지우거다 수정한다.






-----------------------------------------------------------------------------
CREATE TABLE game (
	game_name	varchar2(20)		NOT NULL,
	price	number(2,1)		NULL,
	score	number(2,1)		NULL,
	year	date		NULL,
	img_url	varchar2(50)		NULL,
	publisher	varchar2(10)		NULL
);

CREATE TABLE publisher (
	publisher	varchar2(10)		NULL,
	country	varchar2(15)		NULL,
	start_date	date		NULL
);

CREATE TABLE game_genre (
	game_id	number(2)		NOT NULL,
	game_name	varchar2(20)		NOT NULL
);

CREATE TABLE genre_tag (
	game_genre	varchar2(10)		NULL,
	game_id	number(2)		NOT NULL
);

ALTER TABLE game ADD CONSTRAINT PK_GAME PRIMARY KEY (
	game_name
);

ALTER TABLE publisher ADD CONSTRAINT PK_PUBLISHER PRIMARY KEY (
	publisher
);

ALTER TABLE game_genre ADD CONSTRAINT PK_GAME_GENRE PRIMARY KEY (
	game_id
);

ALTER TABLE game ADD CONSTRAINT FK_publisher_TO_game_1 FOREIGN KEY (
	publisher
)
REFERENCES publisher (
	publisher
);

ALTER TABLE game_genre ADD CONSTRAINT FK_game_TO_game_genre_1 FOREIGN KEY (
	game_name
)
REFERENCES game (
	game_name
);

ALTER TABLE genre_tag ADD CONSTRAINT FK_game_genre_TO_genre_tag_1 FOREIGN KEY (
	game_id
)
REFERENCES game_genre (
	game_id
);

select * from game_genre;

SELECT 
    f.game_name,  -- 게임 이름
    f.price,      -- 가격
    f.score,      -- 평점
    f.year,       -- 출시 연도
    f.img_url,    -- 이미지 URL
    --f.game_id,    -- 게임 ID
    t.game_genre       -- 장르 (genre_tag 테이블에 있다고 가정)
    
    FROM (
        SELECT 
            g.game_name,
            g.price,
            g.score,
            g.year,
            g.img_url,
            ge.game_id
            
            FROM game g
            JOIN game_genre ge
                ON g.game_name = ge.game_name
        ) f
        
    JOIN genre_tag t
        ON t.game_id = f.game_id;
        
        
--날자를 차라리 문자로 할까?       
insert into game (game_name,price,score,year,img_url,publisher ) 
        values ('ssc', 2.1,3.9, TO_DATE('2012', 'YYYY'),'RR', 'mg');
        
desc game;
--가격 데이터 수정(너무 작음) 
select * from game;
        
--------------------------------------------------------------------------------------------

--【문항1】 emp 테이블에는 사원명(ename, varchar2(10))과 사원번호(empno, number(4))가 있습니다
--다음 사항을 만족하는 sql을 작성하시오. 
--1. 테이블의 사원번호(empno)와 사원명(ename)만 출력
--2. 사원번호가 높은 숫자부터 낮은 숫자 순서로 출력
--3. 보안을 위해 앞 2자리는 그대로 출력하고 나머지는 * 기호로 표시(출력 예시: 73**

--무엇의 앞 두자리만 출력해야 하는지 알려주세요
select
    rpad(substr(empno,1,2), length(empno), '*') as empno,
    rpad(substr(ename,1,2), length(ename), '*') as ename 
    
    from emp    
    order by empno desc;
---------------------------------------------------------------------------------
--【문항2】 
--emp 테이블에는 사원명(ename, varchar2(10)), 사원번호(empno, number(4)), 부서번호(deptno, number(2))가 
--있습니다.
-- dept 테이블에는 부서번호(deptno, number(2)), 부서이름(dname, varchar2(14)), 부서위치(loc, varchar2(13))가 
--있습니다.
--다음 사항을 만족하는 sql을 작성하시오. 
--1. 사원번호(empno), 사원명(ename), 부서이름(dname), 부서위치(loc)를 출력하세요
--2. 부서이름(dname) 기준으로 내림차순 정렬하세요


------------1----------------

select
    e.empno,
    e.ename,
    d.dname,
    d.loc
    
    from emp e
    join dept d
        on e.deptno = d.deptno
        
    order by dname desc;
    
---------------2----------------

select
    e.empno,
    e.ename,
    d.dname,
    d.loc
    
    from emp e, dept d
    where e.deptno = d.deptno
    
    order by dname desc;

-- 부서 테이블
CREATE TABLE departments (
    department_id   NUMBER PRIMARY KEY,
    department_name VARCHAR2(100)
);

-- 직원 테이블
CREATE TABLE employees (
    employee_id     NUMBER PRIMARY KEY,
    employee_name   VARCHAR2(100),
    department_id   NUMBER,
    CONSTRAINT fk_department FOREIGN KEY (department_id)
        REFERENCES departments(department_id)
);

-- 부서 데이터
INSERT INTO departments VALUES (10, 'HR');
INSERT INTO departments VALUES (20, 'IT');
INSERT INTO departments VALUES (30, 'Finance');

-- 직원 데이터
INSERT INTO employees VALUES (1, 'Kim', 10);
INSERT INTO employees VALUES (2, 'Lee', 20);
INSERT INTO employees VALUES (3, 'Park', 10);
INSERT INTO employees VALUES (4, 'Choi', 30);
INSERT INTO employees VALUES (5, 'Jung', 20);

COMMIT;

-- DEPARTMENTS 테이블에는 기본키 인덱스가 자동 생성됨 (PK)
-- 필요 시 인덱스를 수동으로 추가
CREATE INDEX idx_emp_dept_id ON employees(department_id);

SELECT /*+ USE_NL(d) */
       e.employee_id,
       e.employee_name,
       e.department_id,
       d.department_name
FROM   employees e
JOIN   departments d
  ON   e.department_id = d.department_id;
  
EXPLAIN PLAN FOR
SELECT /*+ USE_NL(d) */
       e.employee_id,
       e.employee_name,
       d.department_name
FROM   employees e
JOIN   departments d
  ON   e.department_id = d.department_id;

SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY);
  
--| 힌트 명령어                | 설명                                    |
--| --------------------- | ------------------------------------- |
--| `USE_NL(table)`       | 해당 테이블을 내부로 두고 Nested Loop Join 사용 유도 |
--| `USE_HASH(table)`     | 해시 조인 사용 유도                           |
--| `USE_MERGE(table)`    | 병합 조인 (Sort Merge Join) 사용 유도         |
--| `LEADING(table)`      | 조인 순서 지정 (어떤 테이블을 먼저 읽을지)             |
--| `INDEX(table column)` | 인덱스를 사용하도록 유도                         |

--EXPLAIN PLAN FOR 
--SELECT ...;
--
--SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY);


SELECT 
    ROUND(
        TO_DATE('2024-02-20 14:00:00', 'YYYY-MM-DD HH24:MI:SS'),
            'MONTH') AS D1,
            
        TRUNC(
            TO_DATE('2024-09-12 09:00:00', 'YYYY-MM-DD HH24:MI:SS'))
                AS D2 FROM DUAL;