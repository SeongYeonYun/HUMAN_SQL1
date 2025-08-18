SELECT
    *
FROM
    car_rental_history;
--car_history : 자동차 대여 목록 ,
--car_id : 자동차 아이디,
--start_date : 대여 시작일
--end_date : 대여 종료일

desc  CAR_RENTAL_HISTORY;
--10월 22일을 기준으로 대여중인것은 '대여중', 대여 가능한것은 '대여가능'으로 표시하라
--10월 22일 기준 반납했을경우도 대여중으로 취급한다.

SELECT
    car_id,
    stat
FROM
    (
        SELECT
            car_id,
            start_date,
            end_date,
            CASE
                WHEN TO_DATE('2022-10-22') BETWEEN start_date AND end_date THEN
                    '대여중'
                ELSE
                    '대여가능'
            END AS stat
        FROM
            car_rental_history
    )
WHERE
    stat = '대여중';
    
    
-----------------------------------------------------------------------------------------------  
CREATE TABLE first_half (
    shipment_id INT NOT NULL,
    flavor      VARCHAR2(50) NOT NULL,
    total_order INT NOT NULL
);

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 101,
           'chocolate',
           3200 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 102,
           'vanilla',
           2800 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 103,
           'mint_chocolate',
           1700 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 104,
           'caramel',
           2600 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 105,
           'white_chocolate',
           3100 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 106,
           'peach',
           2450 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 107,
           'watermelon',
           2150 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 108,
           'mango',
           2900 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 109,
           'strawberry',
           3100 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 110,
           'melon',
           3150 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 111,
           'orange',
           2900 );

INSERT INTO first_half (
    shipment_id,
    flavor,
    total_order
) VALUES ( 112,
           'pineapple',
           2900 );

CREATE TABLE july (
    shipment_id INT NOT NULL,
    flavor      VARCHAR2(50) NOT NULL,
    total_order INT NOT NULL
);

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 101,
           'chocolate',
           520 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 102,
           'vanilla',
           560 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 103,
           'mint_chocolate',
           400 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 104,
           'caramel',
           460 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 105,
           'white_chocolate',
           350 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 106,
           'peach',
           500 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 107,
           'watermelon',
           780 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 108,
           'mango',
           790 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 109,
           'strawberry',
           520 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 110,
           'melon',
           400 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 111,
           'orange',
           250 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 112,
           'pineapple',
           200 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 208,
           'mango',
           110 );

INSERT INTO july (
    shipment_id,
    flavor,
    total_order
) VALUES ( 209,
           'strawberry',
           220 );

--q: 7월과 전반기 총 주문량을 더하고 상위 3개의 맛을 추력하라
--https://school.programmers.co.kr/learn/courses/30/lessons/133027
-- 1. 우선 7월과 싱빈기의 주문값을 더한다.
-- -> 1. union all 을 한다음 group by sum
-- -> 2. shipent_id를 기준으로 조인한다. flavor 은 증복값이 있기 떄문에 pass

-- 2. 상위 3개를 추출한다. 
-- -> 1. rank?
-- -> 2. 정렬후 head

--출력값 
    --FLAVOR
    --strawberry
    --mango
    --chocolate
-------------------------1----------------------
SELECT
    *
FROM
    july;

SELECT
    *
FROM
    first_half;

SELECT
    flavor
FROM
    (
        SELECT
            flavor
        FROM
            (
                SELECT
                    *
                FROM
                    july
                UNION ALL
                SELECT
                    *
                FROM
                    first_half
            )
        GROUP BY
            flavor
        ORDER BY
            SUM(total_order) DESC
    )
    
    --상위 n개를 추출, mysql에서는 limit n 함수를 사용한다. 헷살리지 말것;
WHERE
    ROWNUM <= 3;  
    
    

--------------------2----------------------

SELECT
    *
FROM
    (
        SELECT
            flavor
        FROM
            (
                SELECT
                    j.shipment_id,
                    j.flavor,
                    j.total_order,
                    f.total_order,
            
            --join 했을때 생기는 null값을 고려해야함,
                    CASE
                /* 상반기 주문량의 값이 null일 경우 */
                        WHEN f.total_order IS NULL THEN
                                CASE
                            /* 상반기와 7월달의 데이터가 둘다 null값 일경우 */
                                    WHEN j.total_order IS NULL THEN
                                        NULL
                                
                                /* 상반기 null, 7월이 not null */
                                    ELSE
                                        j.total_order
                                END
                        ELSE
                            CASE 
                            /* 상반기 값이 null이 아니고 7월값이 null인경우 */
                                WHEN j.total_order IS NULL THEN
                                        f.total_order
                                /* 상반기와 7월 둘다 null이 아닌경우 */
                                ELSE
                                    j.total_order + f.total_order
                            END
                    END t_order
            
            --shipment_id 는 july테이블의 기본키 이다.
            --궁금한점 : left or right 조인을 할때 기본키를 키로 조인해야 하는가?
            -- answer : 상관없다. 단 두 테이블의 기본키가 동일할경우 더 깔끔하고 증복의 가능성이 없기 떄문에 안정적이다.
                FROM
                    july       j
                    FULL OUTER JOIN first_half f ON j.shipment_id = f.shipment_id
            )
        GROUP BY
            flavor
        ORDER BY
            SUM(t_order) DESC
    )
WHERE
    ROWNUM <= 3; 
-----------------------------------------------------------------------------------------------------------
--https://school.programmers.co.kr/learn/courses/30/lessons/59042


--animal_out을 기준으로 left join , key = animal_id

SELECT
    o.animal_id,
    o.name
FROM
    animal_outs o
    LEFT OUTER JOIN animal_ins  s ON o.animal_id = s.animal_id
WHERE
    s.animal_id IS NULL
ORDER BY
    animal_id,
    name;

SELECT
    *
FROM
    animal_outs;

SELECT
    *
FROM
    animal_ins;
    
-------------------------------------------------------------------------------------------------------------    

--https://school.programmers.co.kr/learn/courses/30/lessons/131534

--키값은 user_id, 

--1. 먼저 21년에 가입한 회원의 수를 구한다
--2. 년도와 월별 상품을 구매한 수를 구한다.

--------------------------1-----------------------
--출력값은 정확하나 숫자형이 아닌 날자가 문자형이라 정답으로 처리가 안됨
SELECT    
    to_char(o.sales_date, 'yyyy') as year,
    to_char(o.sales_date, 'mm') as month,
    count(distinct o.user_id) as purchased_USERS,
    round(
        count(distinct o.user_id)/( 
            select 
                count(*) from user_info
                where to_char(joined, 'yyyy') = '2021'),1)
                as PUCHASED_RATIO
                
    from user_info u
        right join online_sale o
        on u.user_id = o.user_id
        
    where to_char(u.joined, 'yyyy') = '2021'
    
    group by to_char(o.sales_date, 'yyyy'),
        to_char(o.sales_date, 'mm')
    order by year, month
    ;
    
select * from online_sale;
select * from user_info;

-------------------------------2------------------------------------------------------
SELECT 
EXTRACT(YEAR FROM A.SALES_DATE) AS YEAR
, EXTRACT(MONTH FROM A.SALES_DATE) AS MONTH
, COUNT(DISTINCT A.USER_ID) AS PURCHASED_USERS
, ROUND(COUNT(DISTINCT A.USER_ID)/(
    SELECT COUNT(USER_ID) 
        FROM USER_INFO  
        WHERE EXTRACT(YEAR FROM JOINED) = '2021'),1) 
    AS PUCHASED_RATIO

FROM ONLINE_SALE A
LEFT JOIN USER_INFO B ON B.USER_ID = A.USER_ID
WHERE EXTRACT(YEAR FROM B.JOINED) = '2021'
GROUP BY EXTRACT(MONTH FROM A.SALES_DATE),EXTRACT(YEAR FROM A.SALES_DATE)
ORDER BY YEAR,MONTH;

select /*+ USE_HASH(o) */
    e.ename, d.deptno
    from emp e
        join dept d
        on e.deptno = d.deptno;




select * from accounts;
select * from pizza_orders;
select * from pizzalist;

