-- 코드를 입력하세요
SELECT TO_CHAR(datetime,'fmhh24')HOUR,count(*)COUNT
FROM animal_outs
WHERE TO_CHAR(datetime,'fmhh24') BETWEEN 9 AND 19
GROUP BY TO_CHAR(datetime,'fmhh24')
ORDER BY TO_NUMBER(TO_CHAR(datetime,'fmhh24'));