from math import ceil

V, N = map(int, input().split())
one_tenth = V * N / 10

print(' '.join([str(ceil(one_tenth * i)) for i in range(1, 9 + 1)]))