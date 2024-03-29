-- 코드를 작성해주세요
SELECT SUM(C.SCORE) SCORE,
       A.EMP_NO,
       A.EMP_NAME,
       A.POSITION,
       A.EMAIL
  FROM HR_EMPLOYEES A
  JOIN HR_DEPARTMENT B
  JOIN HR_GRADE C
    ON A.DEPT_ID = B.DEPT_ID
   AND A.EMP_NO = C.EMP_NO
   AND C.YEAR = 2022
 GROUP BY A.EMP_NO, A.EMP_NAME, A.POSITION, A.EMAIL 
 ORDER BY SCORE DESC
 LIMIT 1
                