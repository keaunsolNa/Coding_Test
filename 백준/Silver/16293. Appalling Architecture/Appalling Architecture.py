import sys

def solution():
    H, W = map(int, sys.stdin.readline().split())
    grid = []
    for _ in range(H):
        grid.append(list(sys.stdin.readline().strip()))

    for i in range(H):
        for j in range(W):
            if grid[i][j] != '.': grid[i][j] = 1
            else: grid[i][j] = 0

    cnt = [0] * 101

    for i in range(W):
        for j in range(H):
            cnt[i] += grid[j][i]

    L, R = 1e9, -1
    for i in range(W):
        if grid[H-1][i]:
            L = min(L, i - 0.5)
            R = i + 0.5

    sum, div = 0, 0

    for i in range(W):
        sum += cnt[i] * i
        div += cnt[i]

    if sum / div < L: print("left")
    elif sum / div > R: print("right")
    else: print("balanced")

solution()