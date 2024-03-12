import java.util.*;

class Solution {
    
    private static boolean[][] visited;
    private static char[][] map;
    private static final int[] dirX = {0, 1, 0, -1};
    private static final int[] dirY = {-1, 0, 1, 0};
    private static int nowX, nowY, sizeX, sizeY, cnt;
    public int[] solution(String[] maps) {
        
        sizeX = maps.length;
        sizeY = maps[0].length();
        
        map = new char[sizeX][sizeY];
        visited = new boolean[sizeX][sizeY];

        for (int i = 0; i < sizeX; i++) 
            map[i] = maps[i].toCharArray();
        
        List<Integer> list = new ArrayList<>();
        cnt = 0;

        for (int i = 0; i < sizeX; i++) {

            for (int j = 0; j < sizeY; j++) {
                
                if (!visited[i][j] && map[i][j] != 'X') dfs(i, j);
                if(cnt != 0) list.add(cnt);
  
                cnt = 0;
                
            }
        }

        Collections.sort(list);

        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }

    private static void dfs(int x, int y) {

        cnt += map[x][y] - '0';
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {

            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(rangeCheck() && !visited[nowX][nowY] && map[nowX][nowY] != 'X') {
                
                dfs(nowX, nowY);
            }
        }

    }

    private static boolean rangeCheck() {

        return (nowX >= 0 && nowY >= 0 && nowX < sizeX && nowY < sizeY);
    }
}