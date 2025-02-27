import sys

input = sys.stdin.readline

n, k = map(int, input().strip().split())

count = 0
while bin(n).count("1") > k:
    n += 1
    count += 1
print(count)