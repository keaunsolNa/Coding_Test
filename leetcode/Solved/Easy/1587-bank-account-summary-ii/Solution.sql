/* Write your PL/SQL query statement below */
SELECT T1.name
     , sum(T2.amount) as balance
FROM Users T1
   , Transactions T2
WHERE T1.account = t2.account
GROUP BY T1.name
HAVING sum(T2.amount) > 10000     