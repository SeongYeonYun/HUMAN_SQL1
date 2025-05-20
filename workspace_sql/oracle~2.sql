SELECT JOB AS "GKS'KGSJ'KJSDFF"  FROM EMP ORDER BY HIREDATE DESC;
DESC EMP;

SELECT * FROM EMP
    ORDER BY JOB ASC, SAL DESC; /*ASC 오름차순(생략 가능) , DESC 내림차순(생략 불가능)
    여러개를 적는 경우 왼쪽겉 부터 적용되고 처음 것으로 순위를 매길수 없을떄 두번쨰 순으로 넘어간다*/
    
--연봉이 같으면 시험번호 내침차순 정렬--
SELECT * FROM EMP
    ORDER BY SAL DESC , EMPNO DESC;
-----------------------------------------    
    
SELECT * FROM EMP
    --WHERE COMM IS NOT NULL
    WHERE COMM IS NULL
    ORDER BY SAL DESC; 
    /*NULL값은 값이 비어있으므로 0보다 작은 숫자로 인식됨
    IS NULL -> NULL값만 추출, IS NOT NUL -> NULL값만 제외하고 추출*/

SELECT * FROM EMP
    --WHERE COMM IS NOT NULL
    --WHERE COMM IS NULL AND SAL >2000 AND SAL <5000
    --WHERE SAL =1600  --1600일치"=="이랑 헷갈리지 말것
    --WHERE SAL > 1600 -- 1600초과
    WHERE SAL >=1600   -- 1600이상
    -- !=, <> -> 다르다
    
    ORDER BY SAL DESC; 

SELECT *
FROM EMP
WHERE DEPTNO = 30 AND JOB = 'SALESMAN';
/*
    SELECT *
        FROM EMP
        WHERE DEPTNO =20
        OR JOB = 'SALESMAN';
        만약 AND나 IF가 같이 있다면 AND가 먼저 적용된다.
*/

SELECT * FROM EMP
WHERE JOB = 'CLERK' AND (SAL >2000 OR DEPTNO = 10); --()괄호가 있는 경우 괄호 안에 있는것을 먼저 연산
SELECT * FROM EMP
WHERE NOT (JOB = 'CLERK' AND SAL >2000 OR DEPTNO = 10);

--월금 2000이상 4000미만인 사원
SELECT * FROM EMP
WHERE SAL >=2000 AND SAL < 4000 ;
--2000<=SAL<4000은 불가능 2000<=SAL의 경우 참일수도 거짓일수도 있기 떄문에 4000과 비교할수 없다.

-------------------------------------------
SELECT * FROM EMP
WHERE DEPTNO = 10 OR DEPTNO = 20;

SELECT * FROM EMP
    WHERE DEPTNO IN (10,20);
    
SELECT * FROM EMP
    WHERE DEPTNO NOT IN (10,20);    
-------------------------------------------

SELECT ENAME, DEPTNO, SAL,
       RANK() OVER (PARTITION BY DEPTNO ORDER BY SAL DESC) AS SAL_RANK
FROM EMP;



/*질문할점 : INSET구문을 볼떄 TO_DATE('02-04-1981','DD-MM-YYYY')인데 왜 슬러시로 표시되고 19는 생략되는가?
ANSWER : 그저 설정이 그렇게 되어 있는것, 만일 데이터가 2001-01-01이라고 치면 01/01/01로 출력됨*/    
SELECT * FROM EMP
    WHERE HIREDATE <= TO_DATE('1981/04/02', 'YYYY/MM/DD');
    
SELECT * FROM EMP
    WHERE TO_DATE(HIREDATE, 'YYYY/MM/DD') =  TO_DATE('1981/04','YYYY/MM');
    
    
    
----------------------------퀴즈------------------------------------
----1---
SELECT * FROM EMP
    WHERE DEPTNO = 10;

---2---
SELECT * FROM EMP
    WHERE DEPTNO != 10;

---3---
SELECT * FROM EMP
WHERE SAL >=3000;

---4---
SELECT * FROM EMP
WHERE SAL BETWEEN 1500 AND 3000;

---5---
SELECT * FROM EMP
WHERE DEPTNO = 10 AND SAL >=2000;

---6--- AND 7
SELECT * FROM EMP
WHERE DEPTNO = 30 AND SAL>1500 AND SAL <3000 --NOT BETWEEN 1500 AND 3000
ORDER BY SAL , ENAME;

---8--- VOTM
SELECT * FROM EMP
WHERE DEPTNO IN (20,30) AND (SAL >1500 AND SAL <3000)
ORDER BY SAL , ENAME; --IN 을 쓸수 있는 경우 : 같은 커럼이 =과 OR로 연결되 있는경우

---9---
SELECT ENAME,SAL FROM EMP
WHERE DEPTNO IN (20,30) AND SAL >=1500
ORDER BY SAL;

/*LIKE 를 쓸경우 글자의 포함 여부를 묻는다. _은 문자 하나, %은 불 특정 다수의 문자*/
SELECT * FROM EMP WHERE ENAME LIKE 'S%';

SELECT * FROM EMP WHERE ENAME LIKE '%A_L%';

SELECT COMM FROM EMP;
    
SELECT * FROM EMP
WHERE COMM>=400;


----UNION-----
SELECT * FROM EMP WHERE DEPTNO = 10

UNION 

SELECT * FROM EMP WHERE DEPTNO = 10

UNION ALL

SELECT * FROM EMP WHERE DEPTNO = 20;

/*
UNION과 UNION ALL이 동시에 사용될 경우 UNION으로 연산됨
*/

SELECT EMPNO FROM EMP
UNION ALL
SELECT SAL FROM EMP;
--같은 타입의 데이터 형만이 가능

SELECT * FROM EMP
    ORDER BY TO_CHAR(HIREDATE);
    
-----------131P 5,6----------------------  
SELECT ENAME, EMPNO, SAL, DEPTNO FROM EMP
    WHERE (ENAME LIKE '%E%' AND DEPTNO = 30) AND (SAL <= 1000 OR SAL >= 2000);

SELECT * FROM EMP
WHERE COMM IS NULL AND JOB IN ('MANAGER', 'CLERK') AND ENAME NOT LIKE '_L%';

SELECT ENAME, LOWER(ENAME)
FROM EMP;

SELECT * FROM EMP
WHERE LOWER(ENAME) LIKE '_l%';

SELECT EXTRACT(YEAR FROM HIREDATE) AS YEAR FROM EMP; 
--EXTRACT함수의 경우 반환값을 DATE타입의 데이터로 반환함


SELECT ENAME, LENGTH(ENAME) AS LEN FROM EMP
    WHERE LENGTH(ENAME)=5;
    
select lengthb('""'), lengthb('한') from dual;
--lengthb -> 바이트 크기 , 띄어쓰기 1바이트


desc emp;

SELECT LENGTH(ENAME) AS LEN, ENAME FROM EMP
    GROUP BY LENRTH(ENAME);
    

select job, substr(job,-3,1), substr(job,5) from emp;
/* -일경우 맨 뒤에서 자리 카운트*/

--select * from emp
--    where empno= 10
--    order by empno desc
--
--union all
--
--select * from emp
--    where empno= 20
--    order by empno asc;

--union 명령어를 할떄 중간에 정렬을 할수는 없고 마지막에 써야함

    
/*
궁금한점 lengthb 함수에서 lengthb('''')는 왜 크기가 1바이트 이고 ' '을 하면 왜 에러가 나는가??
''는 하나의 문자로 인식하지만 안에 내용이 추가되는 경우 입력값을 두개로 인식하기 때문에 에러가 발생한다.
""은 다른 기호이기 떄문에 가능하다.
*/

select job, substr(job,1,2),substr(job,3,2),substr(job,5) from emp;

select ename, substr(ename,2,3) from emp;

select ename, substr(ename,-3,2) from emp;

select ename , substr(ename, -3,3) from emp;

SELECT 'A-B-C',
     REPLACE('A-B-C', '-', '*'),
     REPLACE('A-B-C', '-', '*'),
     REPLACE('A-B-C', '-', '')
FROM EMP;

SELECT 'AB'|| 'CD'|| 'EF' FROM DUAL;

    
SELECT LPAD(ENAME, 10, '+') FROM EMP;

---문제 2
SELECT ENAME, RPAD(SUBSTR(ENAME,1,2), 6, '*') FROM EMP;

---문제 3
SELECT ENAME, RPAD(SUBSTR(ENAME,1,2), LENGTH(ENAME), '*') FROM EMP;

---심화 길이가 20일때 가운데정렬 
--SELECT JOB, LPAD(RPAD(JOB,FLOOR((20-LENGTH(JOB))/2)+LENGTH(JOB),'*'),20, '*')
--FROM EMP; 

--------------------------------------------------------------------------------
SELECT JOB, LPAD(RPAD(JOB,(20-LENGTH(JOB))/2+LENGTH(JOB),'*'),20, '*')
FROM EMP; 
--RPAD함수 자체가 정수로 처리
--------------------------------------------------------------------

--글자수가 홀수개일 경우????? 애당초 가운데 정렬이 안된다.
--먼저 앞에 들어가는 *수와 뒤에 들어가는 *수를 구하자    
    -- (20-LENGTH(ENAME))/2 가 앖 뒤로FLOOR(A/B)
    -- 앞뒤로 추가하자
--------------------------------------------------------------------------------------------------------
SELECT COMM, 
    NVL(COMM, 0)
    FROM EMP;
--NULL값을 대체하기 위해서 사용되는 함수 nvl
--ORACLE의 경우 REPLACE는 NULL값을 지원하지 않는다.
--NVL2(컬럼명, NOT NULL, NULL)
  
SELECT COMM, REPLACE(COMM, 300, NULL) FROM EMP;
--아마 오라클에서 REPLACE는 NULL값이 뭔지는 알지만 NULL값 특성상 값이 존재하지 않기 때문에 인식하지는 못하는것 같다.
---------------------------------------------------------------------------------------------------------

SELECT CONCAT(NULL, 'abc') AS result FROM DUAL;
SELECT '      AB C   ', TRIM('      AB C   ') FROM DUAL;
/*
TRIM은 앞뒤 공백을 모두 제거해 주지만 문자 사이의 공백을 제거하지 못한다.
만약 모두 지고 싶다면 REPLCE를 활용한다.
*/

--ROUND
SELECT
    ROUND(14.46),
    --하나만 입력하면 소숫점 첫쨰자리 반올림
    
    ROUND(14.4126,3)
    --소숫점 두번째자리 까지 반올림
    
FROM DUAL;

SELECT
    TRUNC(14.46),
    TRUNC(14.46,1),
    TRUNC(14.46,-1),
    TRUNC(-14.46)
FROM DUAL;    --소수점 버림

SELECT
    CEIL(3.14),
    FLOOR(3.14),
    CEIL(-3.14),
    TRUNC(-3.14)
FROM DUAL;
--CEIL : 나랑 가장 가까운 나보다 큰 정수
--FLOOR : 나랑 가장 가까운 나보다 작은 정수
      

SELECT 7/0 FROM DUAL; --DIVISION ERROR 
SELECT 7/3 FROM DUAL;

SELECT MOD(7,3), MOD(8,3),MOD(9,3)  FROM DUAL;
SELECT MOD(8,3) FROM DUAL;
SELECT MOD(9,3) FROM DUAL;

SELECT FLOOR(12/3) FROM DUAL;
SELECT FLOOR(-10/3) FROM DUAL;
--FLOOR의 경우 안에 있는 숫자보다 작은 정수중 가장 큰 정수를 반환하기 떄문에 
--나머지를 한다음 몫이 반환된다(양수일 경우)

select sysdate-15 from dual; --오늘날자 출력하는법, 영국시간

select empno + '1000' from emp;
select empno + '100sdsd0' from emp; --error


select 'sfasf' + '100sdsd0' from emp; --error
-- concat @@@@ ||
--select 'sfasf' || '100sdsd0' from emp;

select to_char(HIREDATE, 'yyyy"년" mm-dd hh"시" mi"분" SS"초"') from EMP; --날자 포멧할때 한글은 ""사용

SELECT TO_DATE('2025-05-15', 'YYYY-MM-DD') - TO_DATE('2005-05-12' ,'YYYY-MM-DD') FROM DUAL;

--null 값일 경우 null값이 출력되기 떄문에 조건문으로 계산한다(null=0). comm은 정확한 인센이라 정확한 연봉은 아님
select ename, 
    case
        when comm is null 
            then sal * 12 +0 
            else sal * 12 + comm
    end total_pay
    from emp;


select job , sal ,
    decode(job, 'MANAGER', sal*1.1,
                'SALESMAN', SAL*1.05) AS UPSALE
from emp;


--소수점이 없는 정수 형을 출력하거나 정수형으로 만들어보자.
--1. 1로 나눈 나머지가 0보다 근경우 -> 오라클에서 1로 나누는것은 숫자 자체에 영향을 끼치지 않는 방식이기 떄문에 소수점 이하의 값이 그대로 출력된다.
--  WHERE MOD((sal * 1.814),2) >=0 ;

--2. 문자형으로 변환한후 ','가 있는경우 옆의 글자 제거
-- 소수점의 경우 문자형으로 변환시 소수점(.)은 뭊자로 인식되지 않는다.
SELECT TO_CHAR(SAL * 1.814)  AS UPSALE FROM EMP
    WHERE  TO_CHAR(SAL * 1.814) LIKE '2';

--3. 버림이나 반올림을 한다 (ROUND, TRUNC)
SELECT TRUNC(SAL * 1.814) AS UP_SALE FROM EMP;


SELECT COMM, 
    CASE
        WHEN COMM IS NULL THEN '해당없음'
        WHEN COMM = 0 THEN '0원'
        WHEN COMM > 0 THEN '수당 : ' || COMM
    END AS CASE
FROM EMP;
    
--궁금한점 : CASE COMM  WHEN NULL과 다른점이 뭐지???????
--ANSWER : CASE COMM의 경우 COMM값이 먼저 입력되기 때문에 조건문을 판별할수 없다.

SELECT ENAME, COMM, 
    CASE 
        WHEN COMM IS NULL
            THEN -1
            ELSE COMM
    END AS CASE,
    DECODE(COMM, NULL ,-1,COMM) AS DECO
 
 FROM EMP;



--------------1----------------------- 
SELECT EMPNO,RPAD(SUBSTR(EMPNO,1,2),LENGTH(EMPNO), '*') AS MASKING_EMPNO, 
       ENAME,RPAD(SUBSTR(ENAME,1,1),LENGTH(ENAME), '*') AS  MASKING_ENAME
       FROM EMP
       WHERE LENGTH(ENAME) = 5;
    
--------------------2---------------
SELECT EMPNO, ENAME, SAL, 
       TRUNC((SAL / 21.5),2) AS DAY_PAY,
       ROUND((SAL / 21.5)/8,1) AS THE_PAY

FROM EMP;

---------------3--------------
SELECT EMPNO, ENAME, HIREDATE, 
    NEXT_DAY(ADD_MONTHS(HIREDATE,3),'월요일') AS R_JOB, NVL(TO_CHAR(COMM),'N/A') AS COMM
    FROM EMP
  --NEXT_DAY 다음주 요일 반환, COMM변수가 숫자형 이기 떄문에 문자형으로 변환한 후 문자형 'N/A'로 변환  
;

---------4--------
--데이터 타입이 숫자형이라 0하나밖에 출력이 안됨 -> 문자열로 바꿈

SELECT EMPNO, ENAME, MGR,
    TO_CHAR(
        CASE
            WHEN MGR IS NULL THEN 0
            WHEN SUBSTR(TO_CHAR(MGR), 1, 2) = '75' THEN 5555
            WHEN SUBSTR(TO_CHAR(MGR), 1, 2) = '76' THEN 6666
            WHEN SUBSTR(TO_CHAR(MGR), 1, 2) = '77' THEN 7777
            WHEN SUBSTR(TO_CHAR(MGR), 1, 2) = '78' THEN 8888
            ELSE MGR
        END,
        'FM0000'
    ) AS CHG_MGR
FROM EMP;


SELECT EMPNO, ENAME, MGR, 
    CASE
        WHEN MGR IS NULL THEN '0000'
        WHEN SUBSTR(MGR,1,2) = 75 THEN '5555'
        WHEN SUBSTR(MGR,1,2) = 76 THEN '6666'
        WHEN SUBSTR(MGR,1,2) = 77 THEN '7777'
        WHEN SUBSTR(MGR,1,2) = 78 THEN '8888'
        ELSE TO_CHAR(MGR)

    END AS CHG_MGR


FROM EMP;




--select
--    case
--        when mgr is null
--            then  '0000'
--        when substr(mgr,2,1) in ('5','6','7','8')
--            then  lpad(substr(mgr,2,1), length(mgr), substr(mgr,2,1))  
--        
--    end as lp
--    from emp;

-- select ~~ group by 구문중 연산되는 함수의 경우 null값을 제외하고 계산한다.
--예를들어 avg 의 경우 null값 자체를 무시하기 때문에 분모(전체 크기가 작아진다.

--이름에 a가 들어가는 사람 수

select count(*)  from emp
    where ename like '%A%';
   
select avg(sal) from emp;
   

select
    sum(sal)/count(*) as mean
     ,sal > sum(sal)/count(*)
    grouP
    from emp;
   
   
select deptno
from emp
group by deptno;

SELECT *FROM EMP ;

SELECT * 
 FROM EMP
 WHERE COMM <= 300

UNION ALL  -- 증복 포함

SELECT * 
FROM EMP
WHERE COMM <= 500 ;

-----------------------05.19----------------
-- JOIN -- 
SELECT * 
    FROM 
            EMP, DEPT
    ORDER BY 
            EMPNO
;

select * from emp;
select * from dept;

select ename,e.deptno
    from emp e, dept d
    where e.deptno = d.deptno
    order by empno;

--급여 등급 테이블
select * from salgrade;

--자신의 상사 코드 조회, 총 13개의 결과값이 나온다 
select * from emp e , emp d
    where e.mgr = d.empno;
    --deptno가 두개 나타남,

select * from dept;    
--3개 테이블 합치기
select *   from emp e
    join emp d
    on e.mgr = d.empno
    join dept p
    on d.deptno = e.deptno;
    -- deptno가 3개 나타남
--    join dept p
--    on p.deptno = d.deptno;
    
--이런 식으로 *앞에 별칭으 붙혀야 한다 . ex) select grade. salgrade.* from salgrade

--select * from emp.e,
--    where e.mgr = c.empno;
--별칭이 있어야만 오라클이 작동, deptno같은 경우 동일한  컬럼이 있기 때문에 지정르 해줘야 한다.

--select ename,deptno
--    from emp e, dept d
--    where e.deptno = d.deptno
--    order by empno;

--자신의 상사 코드 조회, 총 13개의 결과값이 나온다 
select * from emp e , emp d, dept p
    where e.mgr = d.empno
     and e.deptno = p.deptno;
     --and d.deptno = p.deptno;
    --deptno가 두개 나타남,
    
select * from dept;
select *  from emp e
    join emp d
    on e.mgr = d.empno
    join dept p
    on e.deptno = p.deptno --and d.deptno = p.deptno;
    join dept p
    on p.deptno = d.deptno;

 
/*
오라클 문법인 where절을 활용하면 문제는 조건식으로 판단이 된다. 만약 상사와 직원의 부서 코드
인 deptno값을 dept 테이블을 조인 히려고 한다면 오라클 문법이 아닌 join on 구물을 활용하는게 좋은것 같다
*/
--using를 사용할 경우 .deptno는 쓰면 안됨
select empno, ename, deptno 
from emp e join dept d using(deptno)
where sal >= 3000;

select empno, ename, d.deptno 
from emp e join dept d 
on e.deptno = d.deptno
where sal >= 3000;


select e2.empno,
e1.ename, 
e1.deptno
from emp e1 left outer join emp e2 
on e1.mgr = e2.empno;

----------------q1------------------------
select e.deptno, dname, empno, ename, sal
from  emp e
join dept d on e.deptno = d.deptno
where sal >2000
order by e.deptno;


---------------------q2-------------
select e.deptno, d.dname,
avg(sal), max(sal), 
min(sal), count(sal) as cnt
from emp e join dept d 
on e.deptno = d.deptno
group by e.deptno,d.dname;

------------------3-------------
select e.deptno,
dname, 
empno, ename, job, sal
from emp e right outer join dept d on e.deptno = d.deptno
order by deptno,dname;

select * from emp;

-------------------------------4-----------------------
--


select e.ename , d.dname, 
e.empno, e.ename, 
e.mgr, e.sal, 
e.deptno, s.losal,
s.hisal, s.grade, 
e.empno as MGR_empno, 
e.ename as MGR_ENAME
    from emp e 
    full outer join dept d
    on e.deptno = d.deptno
    full outer join salgrade s
    on e.sal between s.losal and s.hisal
      
;    