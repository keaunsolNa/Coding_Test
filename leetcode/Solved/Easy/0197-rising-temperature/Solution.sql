/* Write your PL/SQL query statement below */
SELECT T1.id Id
FROM weather T1
WHERE T1.temperature  > (select A.temperature
                         from weather A
                         WHERE A.recordDate = T1.recordDate - 1 )
