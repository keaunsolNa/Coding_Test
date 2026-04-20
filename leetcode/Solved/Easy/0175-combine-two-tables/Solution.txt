/* Write your PL/SQL query statement below */
SELECT T1.firstName
     , T1.lastName
     , T2.city
     , T2.state
FROM Person T1
     , Address T2
WHERE T1.personId = T2.personId(+);