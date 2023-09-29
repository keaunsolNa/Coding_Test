-- 코드를 입력하세요
SELECT
       NAME
  FROM ANIMAL_INS
 WHERE DATETIME <= ALL (
                        SELECT
                               DATETIME
                          FROM ANIMAL_INS
                         ORDER BY DATETIME);