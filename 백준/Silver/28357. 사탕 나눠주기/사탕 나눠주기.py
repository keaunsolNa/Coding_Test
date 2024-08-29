def ch(x):
    re = 0
    for i in s:
        if i>x:
            re+=(i-x)
    return re
n,m = map(int,input().split())
s = list(map(int,input().split()))
a,b = 0,max(s)
while a<b:
    mid = (a+b)//2
    midw = ch(mid)
    if midw >m:
        a = mid+1
    elif midw<=m:
        b = mid
    
print(a)