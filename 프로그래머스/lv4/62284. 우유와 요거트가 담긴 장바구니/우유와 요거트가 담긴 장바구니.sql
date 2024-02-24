-- 코드를 입력하세요

SELECT DISTINCT CART_ID
  FROM CART_PRODUCTS
 WHERE CART_ID IN (SELECT 
                          CART_ID
                    FROM CART_PRODUCTS
                   WHERE NAME IN ('Yogurt')
                   GROUP BY CART_ID)
   AND CART_ID IN (SELECT
                         CART_ID
                    FROM CART_PRODUCTS
                   WHERE NAME IN ('Milk')
                   GROUP BY CART_ID 
                  )     
 ORDER BY CART_ID 