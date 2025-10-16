SELECT u.USER_ID,nickname,city||' '||street_address1||' '||street_address2"전체주소"
,REGEXP_REPLACE(tlno,'(\d{3})(\d{4})(\d{3})','\1-\2-\3')"전화번호"
FROM
(SELECT WRITER_ID
FROM USED_GOODS_BOARD
GROUP BY WRITER_ID
HAVING COUNT(*)>=3)t
LEFT JOIN USED_GOODS_USER u
ON t.WRITER_ID=u.USER_ID
ORDER BY u.USER_ID DESC;