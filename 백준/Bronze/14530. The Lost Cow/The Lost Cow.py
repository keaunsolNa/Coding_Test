x, y = map(int, input().split())
cur_John = x 
travel_distance, travel_direction = 1, 1 
idx = 1
ans = 0
while True:
    for _ in range(travel_distance):
        cur_John += travel_direction
        ans += 1
        if cur_John == y:
            print(ans)
            exit()
    idx *= 2     
    travel_distance = abs(cur_John-x) + idx 
    travel_direction *= (-1)