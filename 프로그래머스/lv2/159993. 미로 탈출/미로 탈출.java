import java.io.*;
import java.util.*;

class Solution {
    
    private static char[][] map;
    private static final int[] dirX = {0, 1, 0, -1};
    private static final int[] dirY = {-1, 0, 1, 0};
    private static int nowX, nowY, sizeX, sizeY;
    public int solution(String[] maps) {
        
        sizeX = maps.length;
        sizeY = maps[0].length();

        map = new char[sizeX][sizeY];

        int[] start = new int[2];
        int[] lever = new int[2];

        for (int i = 0; i < sizeX; i++) {

            String temp = maps[i];
            for (int j = 0; j < sizeY; j++) {

                map[i][j] = temp.charAt(j);

                if (map[i][j] == 'S') start = new int[] {i, j};
                else if (map[i][j] == 'L') lever = new int[] {i, j};

            }
        }

        int result = bfs(start, 'L');
        int result2 = bfs(lever, 'E');

        if (result == -1 || result2 == -1) return -1;
        else return result + result2;
        
    }
    
    // bfs
    private static int bfs(int[] start, char target) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {start[0], start[1], 0});

        boolean[][] visited = new boolean[sizeX][sizeY];

        while (!queue.isEmpty()) {

            int x = queue.peek()[0];
            int y = queue.peek()[1];
            int count = queue.peek()[2];
            visited[x][y] = true;

            if (map[x][y] == target) return count;

            queue.poll();

            for (int i = 0; i < 4; i++) {

                nowX = x + dirX[i];
                nowY = y + dirY[i];

                if (rangeCheck() && !visited[nowX][nowY]) {

                    if(map[nowX][nowY] != 'X') {

                        visited[nowX][nowY] = true;
                        queue.add(new int[] {nowX, nowY, count + 1});
                    }
                }
            }
        }

        return -1;
    }

    private static boolean rangeCheck() {

        return (nowX >= 0 && nowY >= 0 && nowX < sizeX && nowY < sizeY);
    }
}