n, m = map(int, input().split())

p = []
s = []
result = []
for i in range(n):
    pi,si = map(int, input().split())
    p.append(pi)
    s.append(si)

for i in range(n):
    data = []
    for j in range(n):
        if i == j:
            data.append(p[j] // 2 + s[j])
        else:
            data.append(p[j] + s[j])
    count = 0
    sum = 0
    data.sort()
    for j in range(n):
        sum += data[j]
        if sum > m:
            break
        count += 1
    result.append(count)   

print(max(result))