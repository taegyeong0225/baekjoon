-- mysql

-- 상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량
-- 총주문량이 작은 순서대로 조회하는 SQL 문을 작성
-- 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정

SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF f JOIN ICECREAM_INFO i
WHERE i.FLAVOR = f.FLAVOR
GROUP BY 1
ORDER BY 2;