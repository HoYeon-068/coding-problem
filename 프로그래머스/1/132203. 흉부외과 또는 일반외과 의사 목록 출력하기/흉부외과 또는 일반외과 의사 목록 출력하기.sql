-- 코드를 입력하세요
SELECT DR_NAME,DR_ID,MCDP_CD,TO_CHAR(hire_ymd,'YYYY-MM-DD') hire_ymd
FROM DOCTOR
WHERE mcdp_cd IN('CS','GS')
ORDER BY hire_ymd DESC,dr_name ASC;