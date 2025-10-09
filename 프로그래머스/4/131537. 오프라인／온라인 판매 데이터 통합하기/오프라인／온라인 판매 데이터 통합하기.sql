-- 코드를 입력하세요
SELECT TO_CHAR(sales_date,'YYYY-MM-DD')sales_date,product_id,user_id,SALES_AMOUNT
FROM ONLINE_SALE
WHERE TO_CHAR(sales_date,'YYYY-MM')='2022-03'
UNION ALL
SELECT TO_CHAR(sales_date,'YYYY-MM-DD')sales_date,product_id, NULL AS user_id,SALES_AMOUNT
FROM OFFLINE_SALE
WHERE TO_CHAR(sales_date,'YYYY-MM')='2022-03'
ORDER BY sales_date,product_id,user_id;