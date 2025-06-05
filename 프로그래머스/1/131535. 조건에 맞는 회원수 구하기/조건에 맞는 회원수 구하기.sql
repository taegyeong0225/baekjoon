-- 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문
SELECT count(USER_ID)
from USER_INFO
where year(JOINED) = 2021
and age between 20 and 29;