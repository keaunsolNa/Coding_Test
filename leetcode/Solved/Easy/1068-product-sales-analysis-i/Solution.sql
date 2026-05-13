/* Write your PL/SQL query statement below */
SELECT T2.product_name
     , T1.year
     , T1.price
FROM Sales T1
   , Product T2
WHERE T1.product_id = T2.product_id    