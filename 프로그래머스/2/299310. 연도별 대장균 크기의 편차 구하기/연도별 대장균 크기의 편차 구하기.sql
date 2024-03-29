-- 코드를 작성해주세요
WITH MAX_SIZE
  AS (SELECT 
             YEAR(DIFFERENTIATION_DATE) YEAR  
           , MAX(SIZE_OF_COLONY) MAX_SIZE
        FROM ECOLI_DATA
       GROUP BY YEAR(DIFFERENTIATION_DATE) 
     )
     
SELECT 
       YEAR(AB.DIFFERENTIATION_DATE) YEAR
     , B.MAX_SIZE - AB.SIZE_OF_COLONY YEAR_DEV
     , AB.ID 
  FROM ECOLI_DATA AB
  JOIN MAX_SIZE B
    ON YEAR(AB.DIFFERENTIATION_DATE) = B.YEAR
 ORDER BY 1, 2