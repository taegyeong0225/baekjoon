import sys

row = int(sys.stdin.readline())

for i in range(row):
    a, b = map(int, sys.stdin.readline().split())
    print(a+b)