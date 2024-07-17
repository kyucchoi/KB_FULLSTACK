# 첫번째 장
SHOW DATABASES;

USE employees;

SHOW TABLES;

DESCRIBE employees;
DESC employees;
SHOW COLUMNS FROM employees;

# 두번째 장
SELECT * FROM titles;

SELECT first_name FROM employees;

SELECT first_name, last_name, gender FROM employees;

# 세번째 장
SELECT first_name AS '이름', gender AS '성별', hire_date AS '회사 입사일' FROM employees;

# 네번째 장
USE sqldb;

SELECT * FROM usertbl WHERE name = '김경호';

SELECT * FROM usertbl WHERE birthyear >= 1970 AND height >= 182;

# 다섯번째 장
SELECT * FROM usertbl WHERE birthyear >= 180 AND height <= 183;

SELECT * FROM usertbl WHERE addr = '경남' OR '전남';

SELECT * FROM usertbl WHERE name LIKE '김%';

# 여섯번째 장
SELECT name, height FROM usertbl WHERE height > (SELECT height FROM usertbl WHERE name = '김경호');

# 일곱번째 장
SELECT * FROM usertbl ORDER BY mDate ASC;

SELECT * FROM usertbl ORDER BY mDate DESC;

SELECT * FROM usertbl ORDER BY height DESC, name DESC;

# 여덟번째 장
SELECT DISTINCT addr FROM usertbl ORDER BY addr ASC;