-- 코드를 입력하세요
SELECT category,SUM(sales)TOTAL_SALES
FROM BOOK b
RIGHT JOIN BOOK_SALES s
ON b.BOOK_ID=s.BOOK_ID
WHERE TO_CHAR(sales_date,'YYYY-MM')='2022-01'
GROUP BY category
ORDER BY category;