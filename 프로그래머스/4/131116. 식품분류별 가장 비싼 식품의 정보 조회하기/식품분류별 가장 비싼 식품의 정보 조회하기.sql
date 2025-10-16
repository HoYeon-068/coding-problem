SELECT t.category,t.price"MAX_PRICE",t.product_name
FROM(
SELECT f.*,
RANK()OVER(PARTITION BY category ORDER BY price DESC)순위
FROM FOOD_PRODUCT f
WHERE CATEGORY IN('과자', '국', '김치', '식용유')
    )t
WHERE 순위=1
ORDER BY t.price DESC;