-- 코드를 입력하세요
SELECT ANIMAL_ID,NAME
FROM animal_ins
WHERE REGEXP_LIKE(name,'el','i') AND ANIMAL_TYPE='Dog'
ORDER BY name;