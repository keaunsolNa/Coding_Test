for t in range(1, int(input()) + 1):
    n = int(input())
    names = [input() for _ in range(n)]
    res, now = 0, names[0]
    for i in range(1, n):
        if now > names[i]:
            res += 1
            continue
        now = names[i]
    print(f"Case #{t}: {res}")