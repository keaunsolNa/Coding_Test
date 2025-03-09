import sys
input = sys.stdin.readline

r,c,k = map(int, input().split())
graph = []
for _ in range(r):
    graph.append(list(input().rstrip()))

dx = [1,-1,0,0]
dy = [0,0,1,-1]

answer = 0
def dfs(x,y,distance):
    global answer
    if distance == k and y == c-1 and x==0:
        answer += 1
    else:
        graph[x][y]='T'
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if(0 <= nx < r and 0 <= ny < c and graph[nx][ny] == '.'):
                graph[nx][ny]='T'
                dfs(nx,ny,distance+1)
                graph[nx][ny]='.'

dfs(r-1,0,1)
print(answer)