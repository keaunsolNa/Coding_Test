import sys
input = sys.stdin.readline

T = int(input())
sieve = [1 for _ in range(1_000_000)]
sieve[0], sieve[1] = 0, 0
for i in range(2, 1_000):
    if sieve[i]:
        for j in range(i*i, 1_000_000, i):
            sieve[j] = 0
super_prime = []
k_th = 0
for i in range(1_000_000):
    if sieve[i]:
        k_th += 1
        if sieve[k_th]:
            super_prime.append(i)
for _ in range(T):
    print(super_prime[int(input())-1])