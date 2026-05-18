/* Write your PL/SQL query statement below */

SELECT T1.name
     , T1.population
     , T1.area
FROM World T1
WHERE population >= 25000000
   OR AREA >= 3000000 