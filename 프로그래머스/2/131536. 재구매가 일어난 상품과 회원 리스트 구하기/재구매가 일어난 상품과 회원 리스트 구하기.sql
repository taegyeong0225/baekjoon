-- 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여, 재구매한 회원 ID와 재구매한 상품 ID를 출력
-- 결과는 회원 ID를 기준으로 오름차순 정렬
-- 상품 ID를 기준으로 내림차순 정렬
select USER_ID, PRODUCT_ID
from ONLINE_SALE
group by USER_ID, PRODUCT_ID
having count(PRODUCT_ID)>=2
order by USER_ID, PRODUCT_ID desc;
