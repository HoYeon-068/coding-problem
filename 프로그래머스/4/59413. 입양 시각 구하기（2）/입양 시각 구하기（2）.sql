
WITH hours AS(
    SELECT level-1hour
    FROM dual
    CONNECT BY level<=24
)


SELECT h.hour,COUNT(DATETIME)"COUNT"
FROM ANIMAL_OUTS o
RIGHT JOIN hours h
ON TO_CHAR(o.datetime,'HH24')=h.hour
GROUP BY h.hour
ORDER BY h.hour;