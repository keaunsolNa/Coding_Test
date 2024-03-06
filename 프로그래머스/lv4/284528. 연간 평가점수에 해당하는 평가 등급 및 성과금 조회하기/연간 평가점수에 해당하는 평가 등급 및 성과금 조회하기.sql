SELECT
       A.EMP_NO
     , A.EMP_NAME
     , CASE 
           WHEN SUM(SCORE) / 2 >= 96 THEN 'S'
           WHEN SUM(SCORE) / 2 >= 90 THEN 'A'
           WHEN SUM(SCORE) / 2 >= 80 THEN 'B'
           ELSE 'C'
       END
       AS GRADE
     , CASE
           WHEN SUM(SCORE) / 2 >= 96 THEN A.SAL * 0.2
           WHEN SUM(SCORE) / 2 >= 90 THEN A.SAL * 0.15
           WHEN SUM(SCORE) / 2 >= 80 THEN A.SAL * 0.1
           ELSE 0
       END
       AS BONUS
  FROM HR_EMPLOYEES A 
  JOIN HR_GRADE B
    ON A.EMP_NO = B.EMP_NO
 GROUP BY A.EMP_NO, A.EMP_NAME
 ORDER BY EMP_NO;