-- 코드를 작성해주세요

SELECT ID,EMAIL,FIRST_NAME,LAST_NAME
FROM DEVELOPER_INFOS
WHERE skill_1='Python'OR skill_2='Python' OR skill_3='Python'
ORDER BY ID;