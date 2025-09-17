-- mysql

-- 2022년 1월의 
-- 카테고리 별 
-- 도서 판매량을 합산하고, 
-- 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력하는 SQL문을 작성해주세요.
-- 완) 결과는 카테고리명을 기준으로 오름차순 정렬해주세요 

SELECT  CATEGORY, sum(sales) AS TOTAL_SALES
FROM BOOK B
JOIN BOOK_SALES BS
ON B.BOOK_ID = BS.BOOK_ID
WHERE YEAR(BS.SALES_DATE) = 2022
AND MONTH(BS.SALES_DATE) = 1
GROUP BY 1
ORDER BY 1;