-- 동물의 생물 종, 이름, 성별 및 중성화 여부를 아이디 순으로 조회
SELECT ANIMAL_TYPE, ifnull(NAME, "No name"), SEX_UPON_INTAKE
from ANIMAL_INS
order by ANIMAL_ID;