/* Write your PL/SQL query statement below */

SELECT email
FROM (
         SELECT email
              , count(email)
         FROM Person
         GROUP BY email
         HAVING count(email) > 1
     ) 