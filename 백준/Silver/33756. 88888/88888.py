import sys
input = sys.stdin.readline

luck8=[int("8"*i) for i in range(18,0,-1)]
def check(n):
    cnt=0
    for num in luck8:
        while (n>=num):
            n-=num
            cnt+=1
            
    if n==0 and cnt<=8:
        print("Yes")
    else:
        print("No")

t=int(input())

for i in range(t):
    n=int(input())
    check(n)