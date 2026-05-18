/* Write your PL/SQL query statement below */
SELECT T1.project_id
     , ROUND(SUM(T2.experience_years) / COUNT(T2.experience_years), 2) average_years
FROM Project T1
   , Employee T2
WHERE T1.employee_id = T2.employee_id
GROUP BY T1.project_id