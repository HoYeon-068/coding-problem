-- 코드를 입력하세요
SELECT MCDP_CD"진료과코드",count(*)"5월예약건수"
FROM appointment
WHERE TO_CHAR(APNT_YMD,'MM')=5
GROUP BY mcdp_cd
ORDER BY count(*),mcdp_cd;