CREATE TABLE animal_outs (
    animal_id         VARCHAR2(20) PRIMARY KEY,
    animal_type       VARCHAR2(20) NOT NULL,
    datetime          DATE NOT NULL,
    name              VARCHAR2(50),           -- 이름은 NULL 허용
    sex_upon_outcome  VARCHAR2(30) NOT NULL
);


INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A349480', 'Dog', TO_DATE('2013-12-22 11:30:00', 'YYYY-MM-DD HH24:MI:SS'), 'Daisy', 'Spayed Female');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A349733', 'Dog', TO_DATE('2017-09-27 19:09:00', 'YYYY-MM-DD HH24:MI:SS'), 'Allie', 'Spayed Female');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A349990', 'Cat', TO_DATE('2018-02-02 14:18:00', 'YYYY-MM-DD HH24:MI:SS'), 'Spice', 'Spayed Female');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A349996', 'Cat', TO_DATE('2018-02-02 14:17:00', 'YYYY-MM-DD HH24:MI:SS'), 'Sugar', 'Neutered Male');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A350276', 'Cat', TO_DATE('2018-01-28 17:51:00', 'YYYY-MM-DD HH24:MI:SS'), 'Jewel', 'Spayed Female');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A350375', 'Cat', TO_DATE('2017-05-23 16:17:00', 'YYYY-MM-DD HH24:MI:SS'), 'Meo', 'Neutered Male');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A352555', 'Dog', TO_DATE('2014-08-10 18:57:00', 'YYYY-MM-DD HH24:MI:SS'), 'Harley', 'Spayed Female');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A352713', 'Cat', TO_DATE('2017-04-25 12:25:00', 'YYYY-MM-DD HH24:MI:SS'), 'Gia', 'Spayed Female');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A352872', 'Dog', TO_DATE('2015-07-16 17:58:00', 'YYYY-MM-DD HH24:MI:SS'), 'Peanutbutter', 'Neutered Male');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A353259', 'Dog', TO_DATE('2016-05-09 10:40:00', 'YYYY-MM-DD HH24:MI:SS'), 'Bj', 'Neutered Male');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A354540', 'Cat', TO_DATE('2015-01-22 12:07:00', 'YYYY-MM-DD HH24:MI:SS'), 'Tux', 'Neutered Male');
INSERT INTO animal_outs (animal_id, animal_type, datetime, name, sex_upon_outcome)
VALUES ('A354597', 'Cat', TO_DATE('2014-06-03 12:30:00', 'YYYY-MM-DD HH24:MI:SS'), 'Ariel', 'Spayed Female');