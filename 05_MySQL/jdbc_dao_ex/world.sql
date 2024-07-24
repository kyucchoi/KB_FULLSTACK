USE world;

SELECT * FROM country;
SELECT Name, IFNULL(IndepYear, "독립 연도 없음") FROM country;
SELECT LOWER(Code) FROM country;
SELECT UPPER(Name) AS "대문자나라" FROM country;
SELECT * FROM city;
SELECT CONCAT(ID, " / ", Name, " / ", Population) FROM city;
SELECT * FROM country;
SELECT REPLACE(Continent, "Asia", "아시아당") FROM country;
SELECT Name, CEILING(LifeExpectancy) FROM country;
SELECT Name, FLOOR(LifeExpectancy) FROM country;
SELECT Name, ROUND(LifeExpectancy) FROM country;
SELECT Name, LENGTH(Name) FROM country;
SELECT MAX(Population) FROM city;
SELECT MIN(Population) FROM city;
SELECT ROUND(AVG(Population), 4) FROM city;

SELECT CountryCode, SUM(Population) FROM city
GROUP BY CountryCode;

SELECT co.Code, ci.Name, co.Name
FROM city AS ci
INNER JOIN country AS co
ON ci.CountryCode = co.Code;

SELECT co.Code, co.Name, IFNULL(cl.Language, "사용하는 언어 X") AS Language
FROM country AS co
LEFT JOIN countrylanguage AS cl
ON co.Code = cl.CountryCode;

SELECT ci.CountryCode, co.Name, SUM(ci.Population)
FROM city AS ci
JOIN country AS co
ON ci.CountryCode = co.Code
GROUP BY ci.CountryCode

SELECT ci.CountryCode, co.Name, AVG(ci.Population)
FROM city AS ci
         JOIN country AS co
              ON ci.CountryCode = co.Code
GROUP BY ci.CountryCode

SELECT * FROM city;
SELECT *
FROM city
WHERE Population > ALL (
    SELECT Population
    FROM city
    WHERE Name = "Amsterdam"
)