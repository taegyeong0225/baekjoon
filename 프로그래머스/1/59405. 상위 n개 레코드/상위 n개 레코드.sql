-- 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문
SELECT name
from ANIMAL_INS
order by DATETIME
limit 1;