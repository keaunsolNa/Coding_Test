import sys

input = sys.stdin.readline

n, m = map(int, input().split())
r = list(zip(map(int, input().split()), range(1, n + 1)))

k = []
for _ in range(n):
    k.append(list(map(int, input().split()))[1:])

q = int(input())

ask_k = []
for _ in range(q):
    ask_k.append(int(input()))

for i in range(q):
    ans = []
    for j in range(n):
        if ask_k[i] in k[j]:
            ans.append(r[j])
    if ans:
        ans.sort()
        for a in ans:
            print(a[1], end=" ")
        print()
    else:
        print(-1)