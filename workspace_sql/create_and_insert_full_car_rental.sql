CREATE TABLE CAR_RENTAL_COMPANY_RENTAL_HISTORY (
    HISTORY_ID INTEGER NOT NULL,
    CAR_ID     INTEGER NOT NULL,
    START_DATE DATE    NOT NULL,
    END_DATE   DATE    NOT NULL,
    CONSTRAINT PK_CAR_RENTAL PRIMARY KEY (HISTORY_ID)
);

INSERT INTO CAR_RENTAL_COMPANY_RENTAL_HISTORY (HISTORY_ID, CAR_ID, START_DATE, END_DATE)
VALUES (722, 1, TO_DATE('2022-10-31', 'YYYY-MM-DD'), TO_DATE('2022-11-30', 'YYYY-MM-DD'));
INSERT INTO CAR_RENTAL_COMPANY_RENTAL_HISTORY (HISTORY_ID, CAR_ID, START_DATE, END_DATE)
VALUES (517, 2, TO_DATE('2022-08-05', 'YYYY-MM-DD'), TO_DATE('2022-08-07', 'YYYY-MM-DD'));
INSERT INTO CAR_RENTAL_COMPANY_RENTAL_HISTORY (HISTORY_ID, CAR_ID, START_DATE, END_DATE)
VALUES (534, 2, TO_DATE('2022-08-09', 'YYYY-MM-DD'), TO_DATE('2022-08-09', 'YYYY-MM-DD'));
INSERT INTO CAR_RENTAL_COMPANY_RENTAL_HISTORY (HISTORY_ID, CAR_ID, START_DATE, END_DATE)
VALUES (537, 2, TO_DATE('2022-08-10', 'YYYY-MM-DD'), TO_DATE('2022-08-20', 'YYYY-MM-DD'));
INSERT INTO CAR_RENTAL_COMPANY_RENTAL_HISTORY (HISTORY_ID, CAR_ID, START_DATE, END_DATE)
VALUES (568, 2, TO_DATE('2022-08-21', 'YYYY-MM-DD'), TO_DATE('2022-08-23', 'YYYY-MM-DD'));