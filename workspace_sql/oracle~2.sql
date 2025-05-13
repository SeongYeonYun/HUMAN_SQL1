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

    