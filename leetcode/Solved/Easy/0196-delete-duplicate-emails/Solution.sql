/* Write your PL/SQL query statement below */
DELETE FROM Person
WHERE id NOT IN (SELECT MIN(id)
                 FROM Person
                 GROUP BY email )