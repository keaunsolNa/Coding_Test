-- 코드를 입력하세요
SELECT 
       TO_CHAR(A.SALES_DATE, 'YYYY-MM-DD'), A.PRODUCT_ID, A.USER_ID, A.SALES_AMOUNT
  FROM (
        SELECT 
               USER_ID, 
               PRODUCT_ID, 
               SALES_AMOUNT, 
               SALES_DATE
          FROM ONLINE_SALE
         WHERE TO_CHAR(SALES_DATE, 'MM') = '03'

         UNION

        SELECT 
               NULL AS USER_ID, 
               PRODUCT_ID, 
               SALES_AMOUNT, 
               SALES_DATE
          FROM OFFLINE_SALE
         WHERE TO_CHAR(SALES_DATE, 'MM') = '03'
       ) A
 ORDER BY 1, 2, 3;