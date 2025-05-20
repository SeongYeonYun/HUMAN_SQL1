select * from  CAR_RENTAL_HISTORY;
--car_history : 자동차 대여 목록 ,
--car_id : 자동차 아이디,
--start_date : 대여 시작일
--end_date : 대여 종료일

desc  CAR_RENTAL_HISTORY;
--10월 22일을 기준으로 대여중인것은 '대여중', 대여 가능한것은 '대여가능'으로 표시하라
--10월 22일 기준 반납했을경우도 대여중으로 취급한다.

select car_id, stat from
    (select car_id, start_date, end_date,
        case
            when to_date('2022-10-22') between start_date and end_date
                then '대여중'
                else '대여가능'
            end as stat
    from  CAR_RENTAL_HISTORY)
    where stat = '대여중';
    
    
-----------------------------------------------------------------------------------------------  
CREATE TABLE first_half (
    SHIPMENT_ID   INT NOT NULL,
    FLAVOR        VARCHAR2(50) NOT NULL,
    TOTAL_ORDER   INT NOT NULL
);


INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (101, 'chocolate', 3200);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (102, 'vanilla', 2800);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (103, 'mint_chocolate', 1700);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (104, 'caramel', 2600);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (105, 'white_chocolate', 3100);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (106, 'peach', 2450);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (107, 'watermelon', 2150);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (108, 'mango', 2900);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (109, 'strawberry', 3100);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (110, 'melon', 3150);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (111, 'orange', 2900);
INSERT INTO first_half (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (112, 'pineapple', 2900);
 
 CREATE TABLE july (
    SHIPMENT_ID   INT NOT NULL,
    FLAVOR        VARCHAR2(50) NOT NULL,
    TOTAL_ORDER   INT NOT NULL
);

INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (101, 'chocolate', 520);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (102, 'vanilla', 560);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (103, 'mint_chocolate', 400);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (104, 'caramel', 460);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (105, 'white_chocolate', 350);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (106, 'peach', 500);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (107, 'watermelon', 780);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (108, 'mango', 790);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (109, 'strawberry', 520);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (110, 'melon', 400);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (111, 'orange', 250);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (112, 'pineapple', 200);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (208, 'mango', 110);
INSERT INTO july (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) VALUES (209, 'strawberry', 220);

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
select * from july;
select * from first_half;

select flavor from(
    select flavor 

    from
        (
            select * from july
            union all 
            select * from FIRST_HALF         
        )
       
    group by flavor  
    order by sum(total_order) 
        desc
    )
    
    --상위 n개를 추출, mysql에서는 limit n 함수를 사용한다. 헷살리지 말것;
    where rownum <= 3;  
    
    

--------------------2----------------------

select * from(
    select flavor from(
        select
            j.shipment_id,
            j.flavor,
            j.total_order,
            f.total_order,
            
            --join 했을때 생기는 null값을 고려해야함,
            case
                /* 상반기 주문량의 값이 null일 경우 */
                when f.total_order is null        
                    then 
                        case
                            /* 상반기와 7월달의 데이터가 둘다 null값 일경우 */
                            when j.total_order is null
                                then null
                                
                                /* 상반기 null, 7월이 not null */
                                else j.total_order
                        end 
                    else 
                        case 
                            /* 상반기 값이 null이 아니고 7월값이 null인경우 */
                            when j.total_order is null
                                then f.total_order
                                /* 상반기와 7월 둘다 null이 아닌경우 */
                                else j.total_order + f.total_order
                        end
                
            end t_order
            
            --shipment_id 는 july테이블의 기본키 이다.
            --궁금한점 : left or right 조인을 할때 기본키를 키로 조인해야 하는가?
            -- answer : 상관없다. 단 두 테이블의 기본키가 동일할경우 더 깔끔하고 증복의 가능성이 없기 떄문에 안정적이다.
            from july j 
                full outer join FIRST_HALF f
                on j.shipment_id = f.shipment_id)
                
            group by flavor
            order by sum(t_order) desc)
            where rownum <= 3; 


