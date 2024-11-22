def I(A, B):
 X,Y=len(A),len(B)
 if abs(X-Y)>1:return 0
 if X==Y:
  d=sum(1 for a,b in zip(A,B) if a!=b)
  if d==0 or d==1:return 1
  if d==2:
   E=[i for i,(a,b)in enumerate(zip(A,B))if a!=b]
   if len(E)==2 and A[E[0]]==B[E[1]]and A[E[1]]==B[E[0]]:return 1
 if X>Y:A,B=B,A
 for i in range(len(B)):
  if B[:i]+B[i+1:]==A:return 1
 return 0
D=[input()for _ in' '*int(input())]
for _ in' '*int(input()):
 w=input()
 if w in D:print(f"{w} is correct")
 else:
  F=0
  for R in D:
   if I(w, R):print(f"{w} is a misspelling of {R}");F=1;break
  if not F:print(f"{w} is unknown")