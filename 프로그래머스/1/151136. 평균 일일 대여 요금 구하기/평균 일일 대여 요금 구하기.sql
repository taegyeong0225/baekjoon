-- ORACLE
SELECT round(avg(daily_fee)) as AVERAGE_FEE 
FROM CAR_RENTAL_COMPANY_CAR
where car_type = 'SUV';