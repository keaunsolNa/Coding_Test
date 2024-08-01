N, M = map(int, input().split())
pages = list(map(int, input().split()))
d = [] 

for i in range(1, N+1):
    if i not in pages:
        d.append(i)

last = 0 
result = 0 
for i in d: 
    if last: 
        result += min(7, (i - last)*2) 
    else: 
        result += 7 
    last = i

print(result)