import sys

case = int(sys.stdin.readline().rstrip())

for i in range(case):
    n, k, t, l = map(int, sys.stdin.readline().split(' '))
    score = [[0 for _ in range(k)] for _ in range(n)]
    submit = [0 for _ in range(n)]
    time = [0 for _ in range(n)] 

    for j in range(l):
        ex = list(map(int, sys.stdin.readline().split(' ')))
        score[ex[0]-1][ex[1]-1] = max(score[ex[0]-1][ex[1]-1], ex[2])
        submit[ex[0]-1] += 1
        time[ex[0]-1] = j
        
    line = []

    for h in range(n):
        line.append([sum(score[h]), submit[h], time[h], h])
    
    line.sort(key= lambda x : (-x[0], x[1], x[2]))

    for rank in range(n):
        if line[rank][3] == t - 1:
            print(rank+1)