import sys
sys.setrecursionlimit(int(1e9))
input=sys.stdin.readline
n=int(input())
arr=[input().rstrip() for _ in range(n)]
def transform(s): 
    temp=[-1]*26 
    res='' 
    cnt=0
    for i in s:
        idx=ord(i)-ord('a')
        if temp[idx]==-1: 
            cnt+=1
            temp[idx]=cnt
        res+=chr(temp[idx]+ord('a')-1)
    return res
transform_arr=[transform(i) for i in arr]
cnt=0
for i in range(n):
    for j in range(i+1, n):
        if transform_arr[i]==transform_arr[j]:
            cnt+=1
print(cnt)