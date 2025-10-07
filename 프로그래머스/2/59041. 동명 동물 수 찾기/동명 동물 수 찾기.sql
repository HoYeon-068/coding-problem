-- 코드를 입력하세요
SELECT name,count(*)count
FROM animal_ins
WHERE name IS NOT NULL
GROUP BY name
HAVING count(*)>1
ORDER BY name;