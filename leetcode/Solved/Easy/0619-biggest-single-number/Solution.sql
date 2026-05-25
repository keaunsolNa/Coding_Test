/* Write your PL/SQL query statement below */
SELECT MAX(T1.num) num
FROM (
         SELECT count(T1.num)
              , T1.num
         FROM MyNumbers T1
         GROUP BY T1.num
         HAVING count(T1.num) = 1
         ORDER BY T1.num DESC
     ) T1