-- ID, 이름, 성별, 생년월일 o
-- 생일이 3월인 여성 회원 o
-- 전화번호가 NULL인 경우는 출력대상에서 제외시켜 주시고
-- 결과는 회원ID를 기준으로 오름차순 정렬 o 
SELECT MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, "%Y-%m-%d")
from member_profile
where month(date_of_birth) = 3
and gender = "W"
and tlno is not null
order by MEMBER_ID;