import java.io.*;
import java.util.*;

public class Main {
    private static boolean[][] map, visited;
    private static final int[] dirX = {0, 1};
    private static final int[] dirY = {1, 0};
    private static int n, m, nowX, nowY;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new boolean[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                map[i][j] = Integer.parseInt(st.nextToken()) == 1;

        }

        dfs(0, 0);

        if(visited[m - 1][n - 1]) System.out.println("Yes");
        else System.out.println("No");
    }

    private static void dfs(int x, int y) {

        visited[x][y] = true;

        for (int i = 0; i < 2; i++) {

            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(rangeCheck() && !visited[nowX][nowY] && map[nowX][nowY]) {

                dfs(nowX, nowY);
            }
        }
    }

    private static boolean rangeCheck() {

        return (nowX >= 0 && nowY >= 0 && nowX < m && nowY < n);
    }

}
