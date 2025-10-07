-- 코드를 입력하세요
SELECT ANIMAL_TYPE,count(*)
FROM animal_ins
WHERE animal_type IN('Cat','Dog')
GROUP BY animal_type
ORDER BY animal_type;