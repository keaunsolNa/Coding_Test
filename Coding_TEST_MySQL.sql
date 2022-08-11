-- 모든 레코드 조회하기
SELECT
       ANIMAL_ID
     , ANIMAL_TYPE
     , DATETIME
     , INTAKE_CONDITION
     , NAME
     , SEX_UPON_INTAKE
  FROM ANIMAL_INS 
 ORDER BY ANIMAL_ID;
 
-- 역순 정렬하기
SELECT
       NAME
     , DATETIME
  FROM ANIMAL_INS
 ORDER BY ANIMAL_ID DESC;
 
-- 아픈 동물 찾기
SELECT
       ANIMAL_ID
     , NAME  
  FROM ANIMAL_INS     
 WHERE INTAKE_CONDITION = 'SICK';
 
-- 어린 동물 찾기
SELECT
       ANIMAL_ID
     , NAME  
  FROM ANIMAL_INS
 WHERE INTAKE_CONDITION != 'Aged'
 ORDER BY ANIMAL_ID;
 
-- 동물의 아이디와 이름
SELECT
       ANIMAL_ID
     , NAME  
  FROM ANIMAL_INS
 ORDER BY ANIMAL_ID;

-- 여러 기준으로 정렬하기
SELECT
       ANIMAL_ID
     , NAME
     , DATETIME
  FROM ANIMAL_INS
 ORDER BY NAME ASC, DATETIME DESC;
 
-- 상위 n개 레코드
SELECT
       NAME
  FROM ANIMAL_INS
 WHERE DATETIME <= ALL (
                        SELECT
                               DATETIME
                          FROM ANIMAL_INS
                         ORDER BY DATETIME);

-- 최대값 구하기
SELECT MAX(DATETIME) FROM ANIMAL_INS;

-- 최소값 구하기
SELECT MIN(DATETIME) FROM ANIMAL_INS;

-- 동물수 구하기
SELECT COUNT(*) FROM ANIMAL_INS;

-- 중복 제거하기
SELECT COUNT(DISTINCT NAME) FROM ANIMAL_INS WHERE NAME IS NOT NULL;

-- 고양이랑 개는 몇 마리 있을까
SELECT 
       ANIMAL_TYPE, 
       COUNT(ANIMAL_TYPE) 
  FROM ANIMAL_INS
 GROUP BY ANIMAL_TYPE
 ORDER BY 1;
 
 -- 동명 동물 수 찾기
 SELECT 
       NAME 
     , COUNT(NAME) 
  FROM ANIMAL_INS
 WHERE NAME IS NOT NULL
 GROUP BY NAME 
 HAVING COUNT(NAME) > 1
 ORDER BY 1;
 
 -- 입양 시간 구하기
SELECT
       EXTRACT(HOUR FROM DATETIME) HOUR
     , COUNT(ANIMAL_ID)  
  FROM ANIMAL_OUTS
 WHERE EXTRACT(HOUR FROM DATETIME) > 8 AND EXTRACT(HOUR FROM DATETIME) < 20 
 GROUP BY 1 
ORDER BY 1;

-- 입양 시간 구하기(2)
WITH RECURSIVE TIME AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR+1 FROM TIME WHERE HOUR < 23 ) 
    
    SELECT A.HOUR
     , CASE WHEN B.COUNT IS NULL THEN 0 ELSE B.COUNT END AS COUNT
  FROM TIME A
  LEFT JOIN (
    SELECT DATE_FORMAT(DATETIME, '%H') AS HOUR
         , COUNT(DISTINCT ANIMAL_ID) AS COUNT
      FROM ANIMAL_OUTS
     GROUP BY DATE_FORMAT(DATETIME, '%H') ) B
    ON A.HOUR = B.HOUR
 ORDER BY A.HOUR ;
 
-- 이름이 없는 동물의 아이디
SELECT 
       ANIMAL_ID
  FROM ANIMAL_INS     
 WHERE NAME IS NULL 
 ORDER BY 1; 
  
-- 이름이 있는 동물의 아이디
SELECT 
       ANIMAL_ID
  FROM ANIMAL_INS     
 WHERE NAME IS NOT NULL 
 ORDER BY 1; 
 
-- NULL 처리하기
SELECT
      ANIMAL_TYPE
    , IFNULL(NAME, 'No name')
    , SEX_UPON_INTAKE  
 FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

-- 루시와 엘라 찾기
SELECT
       ANIMAL_ID
     , NAME
     , SEX_UPON_INTAKE
  FROM ANIMAL_INS
 WHERE NAME IN("Lucy", "Ella", "Pickle", "Rogan", "Sabrina", "Mitty") 
 ORDER BY ANIMAL_ID;
 
 -- 이름에 el이 들어가는 동물 찾기
SELECT
       ANIMAL_ID
     , NAME  
  fROM ANIMAL_INS
 WHERE NAME LIKE "%EL%"
   AND ANIMAL_TYPE = "DOG"
 ORDER BY NAME;
 
-- 중성화 여부 파악하기
SELECT
       ANIMAL_ID
     , NAME
     , CASE
         WHEN SEX_UPON_INTAKE LIKE "%Spayed%" THEN 'O'
         WHEN SEX_UPON_INTAKE LIKE "%Neutered%" THEN 'O'
         ELSE 'X'  
       END
  FROM ANIMAL_INS
 ORDER BY ANIMAL_ID;

-- 오랜 기간 보호한 동물(2)
SELECT 
       C.ANIMAL_ID
     , C.NAME
  FROM (SELECT
               A.ANIMAL_ID 
             , A.NAME
             , A.DATETIME - B.DATETIME
          FROM ANIMAL_OUTS A
          JOIN ANIMAL_INS B ON(A.ANIMAL_ID = B.ANIMAL_ID)
          ORDER BY 3 DESC) C
 WHERE ROWNUM <= 2;
 
-- DATETIME에서 DATE로 형 변환
SELECT
       ANIMAL_ID
     , NAME
     , DATE_FORMAT(DATETIME,'%Y-%m-%d') AS '날짜'
  FROM ANIMAL_INS
 ORDER BY ANIMAL_ID;