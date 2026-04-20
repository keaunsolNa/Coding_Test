/* Write your PL/SQL query statement below */
SELECT employee_id
FROM Employees
WHERE salary < 30000
  AND manager_id not in (select employee_id
                         from Employees)
ORDER BY employee_id