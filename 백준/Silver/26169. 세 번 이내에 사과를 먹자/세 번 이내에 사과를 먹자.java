import java.io.*;
import java.util.*;

public class Main {
    private static boolean[][] visited;
    private static int[][] map;
    private static final int[] dirX = {0, 1, 0, -1};
    private static final int[] dirY = {-1, 0, 1, 0};
    private static int nowX, nowY;
    private static final int SIZE = 5, LIMIT = 3, APPLE = 1;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        map = new int[SIZE][SIZE];
        visited = new boolean[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < SIZE; j++)
                map[i][j] = Integer.parseInt(st.nextToken());

        }

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(dfs(0, r, c, 0));

    }

    private static int dfs(int depth, int y, int x, int cnt) {

        visited[y][x] = true;

        if(map[y][x] == APPLE) cnt++;

        if(cnt >= 2) return 1;

        if(depth >= LIMIT) {
            visited[y][x] = false;
            return 0;
        }

        for (int i = 0; i < 4; i++) {

            nowY = dirY[i] + y;
            nowX = dirX[i] + x;

            if(rangeCheck() && !visited[nowY][nowX] && map[nowY][nowX] != -1) {

                if(dfs(depth + 1, nowY, nowX, cnt) == 1) return 1;
            }
        }

        visited[y][x] = false;
        return 0;
    }

    private static boolean rangeCheck() {

        return (nowX >= 0 && nowY >= 0 && nowX < SIZE && nowY < SIZE);
    }

}
