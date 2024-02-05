base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
base_dic = dict()
for idx, val in enumerate(list(base)):
    base_dic[idx] = val

start = 1
while True:
    come = input()
    come = list(come.split())

    N = come[0]
    if int(N) == 0:
        break

    string = come[1]
    print("year", start)
    start += 1

    dic = dict()
    for idx, val in enumerate(list(string)):
        dic[val] = idx

    alpha = [input() for _ in range(int(N))]
    tmp = []

    x = 0
    for i in range(len(alpha)):
        result = ""
        for j in range(len(alpha[i])):
            idx = dic[alpha[i][j]]
            result += base_dic[idx]
        tmp.append((result, x))
        x += 1

    tmp.sort(key=lambda x: (x[0], len))

    for value, idx in tmp:
        print(alpha[idx])