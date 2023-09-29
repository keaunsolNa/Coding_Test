-- 코드를 입력하세요
SELECT
       A.PT_NAME
     , A.PT_NO
     , A.GEND_CD
     , A.AGE
     , NVL(A.TLNO, 'NONE')
  FROM PATIENT A
 WHERE GEND_CD = 'W'
   AND AGE <= 12
 ORDER BY AGE DESC, A.PT_NAME