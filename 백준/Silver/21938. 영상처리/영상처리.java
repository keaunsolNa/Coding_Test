import java.io.*;
import java.util.*;

public class Main {

    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static int[][] map;
    private static boolean[][] visit;
    private static int n, m, nowX, nowY;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] input = new int[n][3 * m];
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 3 * m; j++)
                input[i][j] = Integer.parseInt(st.nextToken());
        }

        map = new int[n][m];
        visit = new boolean[n][m];

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < input.length; i++)
            for (int j = 0; j < input[i].length; j += 3)
                map[i][j / 3] = (input[i][j] + input[i][j + 1] + input[i][j + 2]) / 3 >= t ? 255 : 0;

        int cnt = 0;
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(!visit[i][j] && map[i][j] == 255) {
                    cnt++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(cnt);

    }

    private static void dfs(int x, int y) {

        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {

            nowX = dx[i] + x;
            nowY = dy[i] + y;

            if(rangeCheck() && !visit[nowX][nowY] && map[nowX][nowY] == 255) dfs(nowX, nowY);
        }
    }

    private static boolean rangeCheck() {

        return (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m);
    }

}
