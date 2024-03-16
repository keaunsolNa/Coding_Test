-- 코드를 작성해주세요
SELECT A.ID
     , B.FISH_NAME
     , B.LENGTH
 FROM (SELECT 
              D.FISH_NAME
            , D.FISH_TYPE
            , MAX(C.LENGTH) LENGTH
         FROM FISH_INFO C
         JOIN FISH_NAME_INFO D
           ON C.FISH_TYPE = D.FISH_TYPE
        GROUP BY D.FISH_NAME, D.FISH_TYPE
      ) B
 JOIN FISH_INFO A     
   ON A.LENGTH = B.LENGTH
  AND A.FISH_TYPE = B.FISH_TYPE  