-- 환자이름, 환자번호, 성별코드, 나이, 전화번호를 조회
-- 12세 이하인 여자환자
-- 나이를 기준으로 내림차순 정렬하고, 나이 같다면 환자이름을 기준으로 오름차순 정렬
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, "NONE") as TLNO
from PATIENT
where age <= 12
and gend_cd = "W"
order by age desc, pt_name;
