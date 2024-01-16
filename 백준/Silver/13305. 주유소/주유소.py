# 도시의 개수
city_num = int(input())
# 도시 사이의 길이
city_lengths = list(map(int, input().split()))
# 도시별 리터당 기름 비용
oil_fees = list(map(int, input().split()))

total_fee = 0
cheap_oil = oil_fees[0]

for i in range(len(city_lengths)):
    if oil_fees[i] < cheap_oil:
        cheap_oil = oil_fees[i]
    total_fee += city_lengths[i] * cheap_oil

print(total_fee)
