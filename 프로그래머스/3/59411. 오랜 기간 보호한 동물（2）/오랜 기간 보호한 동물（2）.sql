-- 코드를 입력하세요
SELECT t.ANIMAL_ID,t.name
FROM(
SELECT i.ANIMAL_ID,i.name,
RANK()OVER(ORDER BY o.datetime-i.datetime DESC)순위
FROM ANIMAL_INS i
JOIN ANIMAL_OUTS o
ON i.ANIMAL_ID=o.ANIMAL_ID
ORDER BY o.datetime-i.datetime DESC)t
WHERE 순위 <=2;