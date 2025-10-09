WITH T AS(
    SELECT REST_ID,ROUND(AVG(REVIEW_SCORE),2)"SCORE"
    FROM REST_REVIEW
    GROUP BY REST_ID
)
SELECT i.rest_id,i.rest_name,i.food_type,i.FAVORITES,i.ADDRESS,t.score
FROM REST_INFO i
JOIN T t
ON i.rest_id=t.rest_id
WHERE i.address LIKE '서울%'
ORDER BY t.score DESC,i.FAVORITES DESC;