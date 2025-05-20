CREATE TABLE animal_ins (
    animal_id         VARCHAR2(20) PRIMARY KEY,
    animal_type       VARCHAR2(20) NOT NULL,
    datetime          DATE NOT NULL,
    intake_condition  VARCHAR2(30) NOT NULL,
    name              VARCHAR2(50),  -- NULL 허용
    sex_upon_intake   VARCHAR2(30) NOT NULL
);

INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A349996', 'Cat', TO_DATE('2018-01-22 14:32:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Sugar', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A350276', 'Cat', TO_DATE('2017-08-13 13:50:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Jewel', 'Spayed Female');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A350375', 'Cat', TO_DATE('2017-03-06 15:01:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Meo', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A352555', 'Dog', TO_DATE('2014-08-08 04:20:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Harley', 'Spayed Female');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A352713', 'Cat', TO_DATE('2017-04-13 16:29:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Gia', 'Spayed Female');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A352872', 'Dog', TO_DATE('2015-07-09 17:51:00', 'YYYY-MM-DD HH24:MI:SS'), 'Aged', 'Peanutbutter', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A353259', 'Dog', TO_DATE('2016-05-08 12:57:00', 'YYYY-MM-DD HH24:MI:SS'), 'Injured', 'Bj', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A354540', 'Cat', TO_DATE('2014-12-11 11:48:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Tux', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A354597', 'Cat', TO_DATE('2014-05-02 12:16:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Ariel', 'Spayed Female');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A354725', 'Dog', TO_DATE('2015-08-26 11:51:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Kia', 'Spayed Female');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A354753', 'Dog', TO_DATE('2017-04-21 11:33:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Sammy', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A355519', 'Dog', TO_DATE('2015-05-08 18:34:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Faith', 'Spayed Female');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A355688', 'Dog', TO_DATE('2014-01-26 13:48:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Shadow', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A355753', 'Dog', TO_DATE('2015-09-10 13:14:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Elijah', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A357021', 'Dog', TO_DATE('2014-12-03 15:15:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Queens', 'Spayed Female');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A357444', 'Dog', TO_DATE('2016-03-11 15:43:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Puppy', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A357846', 'Dog', TO_DATE('2016-03-17 14:09:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Happy', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A358697', 'Dog', TO_DATE('2015-02-06 12:12:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Fuzzo', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A358879', 'Dog', TO_DATE('2015-09-14 16:52:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Simba', 'Neutered Male');
INSERT INTO animal_ins (animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake)
VALUES ('A361391', 'Dog', TO_DATE('2015-03-30 11:36:00', 'YYYY-MM-DD HH24:MI:SS'), 'Normal', 'Baby Bear', 'Neutered Male');