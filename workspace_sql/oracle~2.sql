SELECT JOB AS "GKS'KGSJ'KJSDFF"  FROM EMP ORDER BY HIREDATE DESC;
DESC EMP;

SELECT * FROM EMP
    ORDER BY JOB ASC, SAL DESC; /*ASC 오름차순(생략 가능) , DESC 내림차순(생략 불가능)*/
    
--연봉이 같으면 시험번호 내침차순 정렬--
SELECT * FROM EMP
    ORDER BY SAL DESC , EMPNO DESC;
-----------------------------------------    
    
SELECT COMM FROM EMP 
    ORDER BY COMM DESC; /*NULL값은 값이 비어있으므로 0보다 작은 숫자로 인식됨*/
    
--SELECT * FROM EMP
--WHERE HIREDATE = TO_DATE('81/04/02', 'YY/MM/DD');
 
    
    
    