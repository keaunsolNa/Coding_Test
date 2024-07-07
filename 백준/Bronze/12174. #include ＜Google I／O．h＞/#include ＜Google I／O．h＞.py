for case in range(int(input())):
    b = int(input())
    s = input().replace('O', '0')
    s = s.replace('I', '1')
    res = "".join([chr(int(s[8 * i : 8 * (i + 1)], 2)) for i in range(b)])
    print(f"Case #{case+1}: {res}")