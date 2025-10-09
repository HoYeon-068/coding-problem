-- 코드를 입력하세요
SELECT b.book_id,a.author_name,TO_CHAR(b.published_date,'YYYY-MM-DD')published_date
FROM BOOK b
JOIN AUTHOR a
ON b.AUTHOR_ID=a.AUTHOR_ID
WHERE b.category='경제'
ORDER BY PUBLISHED_DATE;