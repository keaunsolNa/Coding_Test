-- 코드를 입력하세요
SELECT
       A.MCDP_CD AS "진료과 코드"
     , COUNT(A.PT_NO) AS "5월예약건수"
  FROM APPOINTMENT A
 WHERE EXTRACT(YEAR FROM A.APNT_YMD) = '2022'
   AND EXTRACT(MONTH FROM A.APNT_YMD) = '5'
 GROUP BY A.MCDP_CD  
 ORDER BY 2, 1