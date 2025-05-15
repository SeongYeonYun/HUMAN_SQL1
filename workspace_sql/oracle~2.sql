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
