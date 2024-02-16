-- 코드를 작성해주세요

SELECT 
       ITEM_INFO.ITEM_ID,
       ITEM_INFO.ITEM_NAME,
       ITEM_INFO.RARITY
  FROM ITEM_INFO
 INNER JOIN ITEM_TREE
    ON ITEM_INFO.ITEM_ID = ITEM_TREE.ITEM_ID
 WHERE ITEM_TREE.PARENT_ITEM_ID IN  (
                                      SELECT 
                                             ITEM_ID
                                        FROM ITEM_INFO
                                       WHERE ITEM_INFO.RARITY = 'RARE' )
 ORDER BY ITEM_INFO.ITEM_ID DESC;                                       
 