-- 코드를 입력하세요
SELECT
       COUNT(*)
  FROM USER_INFO
 WHERE AGE BETWEEN 20 AND 29
   AND JOINED BETWEEN TO_DATE('20210101', 'YYYYMMDD') AND  TO_DATE('20211231', 'YYYYMMDD')