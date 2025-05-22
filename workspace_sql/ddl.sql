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

