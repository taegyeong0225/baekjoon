-- 입양을 간 동물 중, 보호 기간이 가장 길었던 동물 두 마리의 아이디와 이름을 조회
-- 보호 기간이 긴 순으로 조회해야 합니다.
SELECT ai.ANIMAL_ID, ai.NAME
from animal_ins ai
join ANIMAL_OUTS ao
on ai.ANIMAL_ID = ao.ANIMAL_ID
order by ao.DATETIME-ai.DATETIME desc
limit 2;