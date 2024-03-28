-- 코드를 작성해주세요
SELECT 
       YEAR(DIFFERENTIATION_DATE) YEAR
     , CASE 
         WHEN YEAR(DIFFERENTIATION_DATE) = 2019
         THEN (SELECT 
                 MAX(SIZE_OF_COLONY) 
                FROM ECOLI_DATA 
               WHERE YEAR(DIFFERENTIATION_DATE) = 2019
              ) - SIZE_OF_COLONY
         WHEN YEAR(DIFFERENTIATION_DATE) = 2020
         THEN (SELECT 
                 MAX(SIZE_OF_COLONY) 
                FROM ECOLI_DATA 
               WHERE YEAR(DIFFERENTIATION_DATE) = 2020
              ) - SIZE_OF_COLONY     
         WHEN YEAR(DIFFERENTIATION_DATE) = 2021
         THEN (SELECT 
                 MAX(SIZE_OF_COLONY) 
                FROM ECOLI_DATA 
               WHERE YEAR(DIFFERENTIATION_DATE) = 2021
              ) - SIZE_OF_COLONY
       END YEAR_DEV 
     , ID 
  FROM ECOLI_DATA 
 ORDER BY 1, 2