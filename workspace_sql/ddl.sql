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
