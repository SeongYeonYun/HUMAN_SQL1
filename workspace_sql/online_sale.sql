CREATE TABLE ONLINE_SALE (
    ONLINE_SALE_ID  NUMBER       PRIMARY KEY,
    USER_ID         NUMBER       NOT NULL,
    PRODUCT_ID      NUMBER       NOT NULL,
    SALES_AMOUNT    NUMBER       NOT NULL,
    SALES_DATE      DATE         NOT NULL
);

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (1, 1, 54, 1, TO_DATE('2022-01-01', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (2, 1, 3, 2, TO_DATE('2022-01-25', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (3, 4, 34, 1, TO_DATE('2022-01-30', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (4, 6, 253, 3, TO_DATE('2022-02-03', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (5, 2, 31, 2, TO_DATE('2022-02-09', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (6, 5, 35, 1, TO_DATE('2022-02-14', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (7, 5, 57, 1, TO_DATE('2022-02-18', 'YYYY-MM-DD'));
