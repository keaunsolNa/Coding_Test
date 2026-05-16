/* Write your PL/SQL query statement below */
SELECT TO_CHAR(activity_date, 'YYYY-MM-DD') AS day
     , count(DISTINCT user_id) as active_users
FROM Activity
WHERE (activity_date BETWEEN '2019-06-28' AND '2019-07-27')
  AND activity_type IS NOT NULL
GROUP BY activity_date/* Write your PL/SQL query statement below */
