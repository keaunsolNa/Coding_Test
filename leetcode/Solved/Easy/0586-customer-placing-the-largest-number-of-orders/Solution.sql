SELECT T1.CUSTOMER_NUMBER
FROM ORDERS T1
GROUP BY T1.CUSTOMER_NUMBER
HAVING COUNT(ORDER_NUMBER) = (SELECT MAX(CNT)
                              FROM (SELECT COUNT(ORDER_NUMBER) AS CNT
                                    FROM ORDERS
                                    GROUP BY CUSTOMER_NUMBER
                                   )
)
                             