-- 코드를 입력하세요
SELECT o.animal_id,o.ANIMAL_TYPE,o.name
FROM animal_outs o
LEFT JOIN animal_ins i
ON o.ANIMAL_ID=i.ANIMAL_ID
WHERE i.animal_id IS NOT NULL
AND o.SEX_UPON_OUTCOME!=i.SEX_UPON_INTAKE
ORDER BY o.animal_id; 