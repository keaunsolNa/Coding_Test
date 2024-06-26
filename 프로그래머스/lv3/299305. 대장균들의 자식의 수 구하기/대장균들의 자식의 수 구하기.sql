SELECT
       ID,
       COALESCE((SELECT COUNT(*) 
                   FROM ECOLI_DATA 
                  WHERE PARENT_ID = A.ID), 0) AS CHILD_COUNT
  FROM ECOLI_DATA A
 ORDER BY ID;