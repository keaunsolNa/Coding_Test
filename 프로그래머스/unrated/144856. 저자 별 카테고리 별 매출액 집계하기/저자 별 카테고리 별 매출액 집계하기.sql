-- 코드를 입력하세요
SELECT 
       B.AUTHOR_ID, 
       C.AUTHOR_NAME, 
       B.CATEGORY,
       SUM(A.SALES * B.PRICE)
  FROM BOOK_SALES A
  JOIN BOOK B ON A.BOOK_ID = B.BOOK_ID
  JOIN AUTHOR C ON B.AUTHOR_ID = C.AUTHOR_ID
 WHERE (YEAR(A.SALES_DATE) = 2022 AND MONTH(A.SALES_DATE) = 1)
 GROUP BY 1, 3 
 ORDER BY B.AUTHOR_ID, B.CATEGORY DESC;