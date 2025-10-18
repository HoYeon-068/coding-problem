-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(sales_date,'YYYY'))YEAR
,TO_NUMBER(TO_CHAR(sales_date,'MM'))MONTH
,gender,COUNT(DISTINCT o.user_id)users
FROM USER_INFO i
RIGHT JOIN ONLINE_SALE o
ON i.USER_ID=o.USER_ID
WHERE gender IS NOT NULL
GROUP BY TO_CHAR(sales_date,'YYYY'),TO_CHAR(sales_date,'MM'),gender
ORDER BY year,month,gender;