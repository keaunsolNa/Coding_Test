/* Write your PL/SQL query statement below */
SELECT T1.name  AS name
     , T2.bonus AS bonus
  FROM Employee T1
  LEFT JOIN Bonus T2
    ON T1.empId = T2.empId
 WHERE T2.bonus is null
    OR T2.bonus < 1000